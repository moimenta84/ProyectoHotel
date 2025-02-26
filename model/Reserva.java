package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Reserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaSalida;
    public Reserva(){}
    public Reserva(Cliente cliente, Habitacion habitacion, LocalDateTime fechaEntrada, LocalDateTime fechaSalida) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.habitacion.setDisponible(false); // Marcar la habitación como no disponible
    }

    // Getters y setters
    public String getCliente() {
        return cliente.motrarInfo();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getHabitacion() {
        return habitacion.motrarInfo();
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public void motrarInfo() {
        System.out.println(
                "Cliente: " + getCliente() + "\n" +
                "Habitación: " + getHabitacion() + "\n"+
                "Fecha entrada: " + getFechaEntrada() + "\n"+
                "Fecha salida: " + getFechaSalida() + "\n"
        );
    }
    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente +
                ", habitacion=" + habitacion +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                '}';
    }
}
