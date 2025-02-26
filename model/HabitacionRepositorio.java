package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model;

import java.util.ArrayList;

public class HabitacionRepositorio {
    private ArrayList<Habitacion> habitacions;
    private int tam;
    private boolean isempty;

    public HabitacionRepositorio() {
        this.habitacions = new ArrayList<>();
        actualizarEstado();

    }

    public void mostrarListadoHabitaciones() {
        for (int i = 0; i < habitacions.size(); i++) {
            System.out.println("Habitación " + i);
            System.out.println(habitacions.get(i).motrarInfo());
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

    public void añadirHabitacion(Habitacion habitacion) {
        habitacions.add(habitacion);
        actualizarEstado();
    }

    public void borrarHabitacionbyId(int id) {
        habitacions.remove(id);
        actualizarEstado();
    }
    public Habitacion getHabitacionById(int id){
        actualizarEstado();
        return habitacions.get(id);
    }
    private void actualizarEstado() {
        this.tam = habitacions.size();
        this.isempty = habitacions.isEmpty();
    }
}
