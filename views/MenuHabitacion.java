package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.views;

import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.services.GestionClientes;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.services.GestionHabitaciones;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.utilidades.FuncionesGenerales;

public class MenuHabitacion {
    public static void menuHabitacion(GestionHabitaciones gestionHabitaciones) {
        int eleccion;

        do {
            System.out.println("Menu Habitaciones");
            System.out.println("1. Añadir Habitaciones");
            System.out.println("2. Mostrar Habitaciones");
            System.out.println("3. Borrar Habitaciones");
            System.out.println("4. Salir");
            eleccion = FuncionesGenerales.scanerNum();

            switch (eleccion) {
                case 1:
                    gestionHabitaciones.añadirHabitacion();
                    break;
                case 2:
                    gestionHabitaciones.mostrarHabitacion();
                    break;
                case 3:
                    gestionHabitaciones.borrarHabitacionbyId();
                    break;
            }
        } while (eleccion != 4);
    }
}

