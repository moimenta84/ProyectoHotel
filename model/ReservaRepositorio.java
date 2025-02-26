package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model;

import java.util.ArrayList;

public class ReservaRepositorio {
    private ArrayList<Reserva> reservas;
    private int tam;
    private boolean isempty;

    public ReservaRepositorio() {
        this.reservas = new ArrayList<>();
        actualizarEstado();

    }

    public void mostrarListadoReserva() {
        for (int i = 0; i < reservas.size(); i++) {
            System.out.println("Cliente " + i);
            reservas.get(i).motrarInfo();
            ;
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

    public void añadirReserva(Reserva reserva) {
        reservas.add(reserva);
        actualizarEstado();
    }

    public void borrarReservabyId(int id) {
        reservas.remove(id);
        actualizarEstado();
    }

    private void actualizarEstado() {
        this.tam = reservas.size();
        this.isempty = reservas.isEmpty();
    }

}
