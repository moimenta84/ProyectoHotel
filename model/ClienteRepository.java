package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model;

import java.util.ArrayList;

public class ClienteRepository {
    private ArrayList<Cliente> clientes;
    private int tam;
    private boolean isempty;

    public ClienteRepository() {
        this.clientes = new ArrayList<>();
        actualizarEstado();
    }

    public void mostrarListadoClientes() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Cliente " + i);
            System.out.println(clientes.get(i).motrarInfo());

        }
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public boolean isIsempty() {
        return isempty;
    }

    public void setIsempty(boolean isempty) {
        this.isempty = isempty;
    }

    public void añadirCliente(Cliente cliente) {
        clientes.add(cliente);
        actualizarEstado();
    }
    public Cliente getclienteById(int id){
actualizarEstado();
        return clientes.get(id);
    }

    public void borrarClientebyId(int id) {
        clientes.remove(id);
        actualizarEstado();
    }

    private void actualizarEstado() {
        this.tam = clientes.size();
        this.isempty = clientes.isEmpty();
    }
}
