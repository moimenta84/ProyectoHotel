package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2;

import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model.Hotel;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.utilidades.FuncionesGenerales;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.views.MenuCliente;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.views.MenuHabitacion;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.views.MenuReservas;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Hotel hotel=new Hotel();

        int eleccion;
        do {
            System.out.println("1. Gestionar Clientes");
            System.out.println("2. Gestionar Habitaciones");
            System.out.println("3. Gestionar Reservas");
            System.out.println("4. Salir");
            eleccion = FuncionesGenerales.scanerNum();
            switch (eleccion) {
                case 1:
                    MenuCliente.menuCliente(hotel.getGestionClientes());
                    break;
                case 2:
                    MenuHabitacion.menuHabitacion(hotel.getGestionHabitaciones());

                    break;
                case 3:
                    MenuReservas.menuHabitacion(hotel.getGestionReservas());

                    break;
            }
        }while (eleccion!=4);
    }
}
