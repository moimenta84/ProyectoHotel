package SegundaEvaluacionEjercicios.Clases_POO.ejerHotel2.model;

public class Cliente {
    private String nombre;
    private String DNI;
    private int edad;
    
    public Cliente(){
        
    }
    
    public Cliente(String nombre, String DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String motrarInfo() {
        return
                "Nombre: " + getNombre() + "\n" +
                "DNI: " + getDNI() + "\n" +
                "Edad: " + getEdad() + "\n";
    }
}
