package org.example.model;

public class Estudiante extends Persona {
    private double promedioNotas;
    public Estudiante(String nombre, String apellido, String numeroCelular, double promedioNotas) {
        super(nombre, apellido, numeroCelular);
        this.promedioNotas = promedioNotas;
    }

    public double getPromedioNotas() { return promedioNotas; }
    public void setPromedioNotas(double promedioNotas) { this.promedioNotas = promedioNotas; }
}
