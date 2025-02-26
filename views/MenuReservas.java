package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.views;

import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.services.GestionHabitaciones;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.services.GestionReservas;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.utilidades.FuncionesGenerales;

public class MenuReservas {
    public static void menuHabitacion(GestionReservas gestionReservas) {

        int eleccion;

        do {
            System.out.println("Menu Habitaciones");
            System.out.println("1. Crear Reservas");
            System.out.println("2. Mostrar Reservas");
            System.out.println("3. Borrar Reservas");
            System.out.println("4. Salir");
            eleccion = FuncionesGenerales.scanerNum();

            switch (eleccion) {
                case 1:
                    gestionReservas.crearReserva();
                    break;
                case 2:
                    gestionReservas.mostrarReservas();
                    break;
                case 3:
                    gestionReservas.borrarReservabyId();
                    break;
            }
        } while (eleccion != 4);
    }
}
