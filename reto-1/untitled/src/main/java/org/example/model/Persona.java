package org.example.model;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroCelular;

    public Persona(String nombre, String apellido, String numeroCelular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCelular = numeroCelular;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getNumeroCelular() { return numeroCelular; }
    public void setNumeroCelular(String numeroCelular) { this.numeroCelular = numeroCelular; }
}
