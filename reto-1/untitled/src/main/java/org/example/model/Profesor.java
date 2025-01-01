package org.example.model;

public class Profesor extends Persona {
    private String especialidad;

    public Profesor(String nombre, String apellido, String numeroCelular, String especialidad) {
        super(nombre, apellido, numeroCelular);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}