package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model;

public class Habitacion {
    private int numero;
    private String tipo;
    private boolean disponible;
public Habitacion(){}
    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = true;
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String motrarInfo() {
        return
                "TIPO: " + getTipo() + "\n" +
                "Número: " + getNumero() + "\n"
        ;
    }
}

