package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.services;

import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model.Cliente;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model.ClienteRepository;
import static SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.utilidades.FuncionesGenerales.scanerNum;
import static SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.utilidades.FuncionesGenerales.scanerString;

public class GestionClientes {
    private ClienteRepository clienteRepository;

    public GestionClientes(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
public boolean getIsempty(){
        return clienteRepository.isIsempty();
}
    public void añadirClientes() {
        Cliente cliente = new Cliente();
        System.out.println("Introduce el nombre");
        cliente.setNombre(scanerString());
        System.out.println("Introduce el DNI");
        cliente.setDNI(scanerString());
        System.out.println("Introduce la edad");
        cliente.setEdad(scanerNum());
        clienteRepository.añadirCliente(cliente);
    }

    public Cliente getclienteById() {
        System.out.println("En getclienteby"+clienteRepository.isIsempty());
        if (clienteRepository.isIsempty()) {
            System.out.println("Lista Vacía");
            return null;
        } else {
            while (true) {
                mostrarClientes();
                System.out.println("Introduce la ID del cliente");
                int clienteId_selected = scanerNum();
                if (clienteId_selected > -1 && clienteId_selected < clienteRepository.getTam()) {
                    clienteRepository.getclienteById(clienteId_selected);
                    System.out.println("recuperando cliente...!");
                    return clienteRepository.getclienteById(clienteId_selected);
                } else {
                    System.out.println("Id del cliente no válido");
                }
            }

        }
    }

    public void mostrarClientes() {
        System.out.println(clienteRepository.isIsempty());
        if (clienteRepository.isIsempty()) {
            System.out.println("NO hay ningún cliente registrado todavía");
        } else {
            clienteRepository.mostrarListadoClientes();

        }
    }

    public void borrarClientebyId() {
        if (clienteRepository.isIsempty()) {
            System.out.println("Lista Vacía");
        } else {
            while (true) {
                mostrarClientes();
                System.out.println("Introduce la ID del cliente");
                int clienteId_selected = scanerNum();
                if (clienteId_selected > -1 && clienteId_selected < clienteRepository.getTam()) {
                    clienteRepository.borrarClientebyId(clienteId_selected);
                    System.out.println("Eliminación exitosa!");
                    break;
                } else {
                    System.out.println("Id del cliente no válido");
                }
            }

        }
    }
}
