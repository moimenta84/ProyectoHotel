package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model;

import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.services.GestionClientes;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.services.GestionHabitaciones;
import SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.services.GestionReservas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Hotel {
    private ClienteRepository clienteRepository;
    private HabitacionRepositorio habitacionRepositorio;
    private ReservaRepositorio reservaRepositorio;
    private GestionClientes gestionClientes;
    private GestionHabitaciones gestionHabitaciones;
    private GestionReservas gestionReservas;

    public Hotel() {
        this.clienteRepository = new ClienteRepository();
        this.habitacionRepositorio = new HabitacionRepositorio();
        this.reservaRepositorio = new ReservaRepositorio();
        this.gestionClientes = new GestionClientes(clienteRepository);
        this.gestionHabitaciones = new GestionHabitaciones(habitacionRepositorio);
        this.gestionReservas = new GestionReservas(reservaRepositorio, gestionClientes, gestionHabitaciones);
    }

    public ClienteRepository getClienteRepository() {
        return clienteRepository;
    }

    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public HabitacionRepositorio getHabitacionRepositorio() {
        return habitacionRepositorio;
    }

    public void setHabitacionRepositorio(HabitacionRepositorio habitacionRepositorio) {
        this.habitacionRepositorio = habitacionRepositorio;
    }

    public ReservaRepositorio getReservaRepositorio() {
        return reservaRepositorio;
    }

    public void setReservaRepositorio(ReservaRepositorio reservaRepositorio) {
        this.reservaRepositorio = reservaRepositorio;
    }

    public GestionClientes getGestionClientes() {
        return gestionClientes;
    }

    public void setGestionClientes(GestionClientes gestionClientes) {
        this.gestionClientes = gestionClientes;
    }

    public GestionHabitaciones getGestionHabitaciones() {
        return gestionHabitaciones;
    }

    public void setGestionHabitaciones(GestionHabitaciones gestionHabitaciones) {
        this.gestionHabitaciones = gestionHabitaciones;
    }

    public GestionReservas getGestionReservas() {
        return gestionReservas;
    }

    public void setGestionReservas(GestionReservas gestionReservas) {
        this.gestionReservas = gestionReservas;
    }
}

