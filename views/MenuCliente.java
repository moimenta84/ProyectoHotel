package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.views;

import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.services.GestionClientes;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.utilidades.FuncionesGenerales;

public class MenuCliente {
    public static void menuCliente(GestionClientes gestionClientes){
        int eleccion;

        do {
            System.out.println("Menu usuarios");
            System.out.println("1. Añadir Clientes");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Borrar Clientes");
            System.out.println("4. Salir");
            eleccion= FuncionesGenerales.scanerNum();

            switch (eleccion) {
                case 1:
                    gestionClientes.añadirClientes();
                    break;
                case 2:
                    gestionClientes.mostrarClientes();
                    break;
                case 3:
                    gestionClientes.borrarClientebyId();
                    break;
            }
        }while (eleccion!=4);
    }
}
