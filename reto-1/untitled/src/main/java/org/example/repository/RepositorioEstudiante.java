package org.example.repository;

import org.example.model.Estudiante;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class RepositorioEstudiante {
    private List<Estudiante> estudiantes;

    public RepositorioEstudiante() {
        estudiantes = new ArrayList<>();
        // Agregar 10 estudiantes
        estudiantes.add(new Estudiante("Juan", "Perez", "123456789", 8.5));
        estudiantes.add(new Estudiante("Maria", "Lopez", "987654321", 9.2));
        estudiantes.add(new Estudiante("Pedro", "Mape", "987656321", 9.8));
        estudiantes.add(new Estudiante("Javier", "Marquez", "987654300", 9.3));
        estudiantes.add(new Estudiante("Jhon", "Doe", "00000000000", 10.0));
        estudiantes.add(new Estudiante("Maria", "Doe", "1111111111", 5.2));
        estudiantes.add(new Estudiante("Jorge", "Melchor", "555555555555", 4.8));
        estudiantes.add(new Estudiante("Nirvana", "Jara", "444444444444", 7.3));
        estudiantes.add(new Estudiante("Raul", "Ramirez", "34343434343", 6.8));
        estudiantes.add(new Estudiante("Juana", "Lopez", "5665656565656", 8.3));
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
