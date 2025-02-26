package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.services;

import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model.Cliente;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model.ClienteRepository;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model.Habitacion;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model.HabitacionRepositorio;

import static SegundaEvaluacionEjercicios.Clases_POO.ejerHotel.utilidades.FuncionesGenerales.scanerNum;
import static SegundaEvaluacionEjercicios.Clases_POO.ejerHotel.utilidades.FuncionesGenerales.scanerString;

public class GestionHabitaciones {
    private HabitacionRepositorio habitacionRepositorio;

    public GestionHabitaciones(HabitacionRepositorio habitacionRepositorio) {
        this.habitacionRepositorio = habitacionRepositorio;
    }

    public void añadirHabitacion() {
        Habitacion habitacion = new Habitacion();
        System.out.println("Introduce el tipo");
        habitacion.setTipo(scanerString());
        System.out.println("Introduce el número");
        habitacion.setNumero(scanerNum());
        habitacion.setDisponible(false);
        habitacionRepositorio.añadirHabitacion(habitacion);
    }

    public void mostrarHabitacion() {
        if (habitacionRepositorio.isIsempty()) {
            System.out.println("NO hay ninguna habitacion todavía");
        } else {
            habitacionRepositorio.mostrarListadoHabitaciones();
        }
    }

    public Habitacion getHabitacionById() {
        if (habitacionRepositorio.isIsempty()) {
            System.out.println("Lista Vacía");
            return null;
        } else {
            while (true) {
                mostrarHabitacion();
                System.out.println("Introduce la ID de la habitación");
                int habitacionId_selected = scanerNum();
                if (habitacionId_selected > -1 && habitacionId_selected < habitacionRepositorio.getTam()) {
                    habitacionRepositorio.getHabitacionById(habitacionId_selected);
                    System.out.println("recuperando habitación...!");
                    return habitacionRepositorio.getHabitacionById(habitacionId_selected);
                } else {
                    System.out.println("Id de la habitación no válida");
                }
            }

        }
    }
public boolean getIsempty(){
        return habitacionRepositorio.isIsempty();
}
    public void borrarHabitacionbyId() {
        if (habitacionRepositorio.isIsempty()) {
            System.out.println("Lista Vacía");
        } else {
            while (true) {
                mostrarHabitacion();
                System.out.println("Introduce la ID de la habitación");
                int habitacionId_selected = scanerNum();
                if (habitacionId_selected > -1 && habitacionId_selected < habitacionRepositorio.getTam()) {
                    habitacionRepositorio.borrarHabitacionbyId(habitacionId_selected);
                    System.out.println("Eliminación exitosa!");
                    break;
                } else {
                    System.out.println("Id de la habitación no válida");
                }
            }
        }
    }
}
