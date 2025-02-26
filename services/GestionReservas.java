package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.services;

import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model.*;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.utilidades.FuncionesGenerales;

import java.time.LocalDateTime;

import static SegundaEvaluacionEjercicios.Clases_POO.ejerHotel.utilidades.FuncionesGenerales.scanerNum;
import static SegundaEvaluacionEjercicios.Clases_POO.ejerHotel.utilidades.FuncionesGenerales.scanerString;

public class GestionReservas {
    private ReservaRepositorio reservaRepositorio;
    private GestionClientes gestionClientes;
    private GestionHabitaciones gestionHabitaciones;
/*
Cuando pasas las instancias a través del constructor, estás reutilizando las mismas instancias que se crearon
en otro lugar del programa. Esto asegura que todas las clases que dependen de estas instancias trabajen con los
mismos datos y estado.
 */
    public GestionReservas(ReservaRepositorio reservaRepositorio, GestionClientes gestionClientes, GestionHabitaciones gestionHabitaciones) {
        this.reservaRepositorio = reservaRepositorio;
        this.gestionClientes = gestionClientes;
        this.gestionHabitaciones = gestionHabitaciones;
    }

    public void crearReserva() {
        if (gestionClientes.getIsempty() || gestionHabitaciones.getIsempty()) {
            System.out.println("No se pudo completar la acción.");
            System.out.println("Falta de habitaciones o ausencia de clientes");

        } else {
            Reserva reserva = new Reserva();
            System.out.println("Seleciona al cliente");
            Cliente cliente = gestionClientes.getclienteById();


            System.out.println("Selecciona la habitacion");
            Habitacion habitacion = gestionHabitaciones.getHabitacionById();
            reserva.setHabitacion(habitacion);
            reserva.setCliente(cliente);

            while (true) {
                System.out.println("Inicio de estancia: ");
                LocalDateTime inicio = FuncionesGenerales.obtenerFechaHora();
                System.out.println("Fin de estancia");
                LocalDateTime fin = FuncionesGenerales.obtenerFechaHora();
                if (inicio.isBefore(fin)) {
                    reserva.setFechaEntrada(inicio);
                    reserva.setFechaSalida(fin);
                    break;
                } else {
                    System.out.println("El inicio no puede ser posterior a la salida");
                }
            }

            reservaRepositorio.añadirReserva(reserva);
            System.out.println("Reserva realizada con éxito");
        }
    }


    public void mostrarReservas() {
        if (reservaRepositorio.isIsempty()) {
            System.out.println("NO hay ninguna reserva todavía");
        } else {
            reservaRepositorio.mostrarListadoReserva();
        }
    }

    public void borrarReservabyId() {
        if (reservaRepositorio.isIsempty()) {
            System.out.println("Lista Vacía");
        } else {
            while (true) {
                mostrarReservas();
                System.out.println("Introduce la ID de la reserva");
                int reservaId_selected = scanerNum();
                if (reservaId_selected > -1 && reservaId_selected < reservaRepositorio.getTam()) {
                    reservaRepositorio.borrarReservabyId(reservaId_selected);
                    System.out.println("Eliminación exitosa!");
                    break;
                } else {
                    System.out.println("Id de la reserva no válida");
                }
            }
        }
    }
}
