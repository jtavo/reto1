package org.example.service;

import org.example.model.Estudiante;
import org.example.repository.RepositorioEstudiante;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEstudiante {
    @Autowired
    private RepositorioEstudiante repositorio;

    public ServiceEstudiante() {
        this.repositorio = new RepositorioEstudiante();
    }

    public List<Estudiante> listarEstudiantes() {
        return repositorio.getEstudiantes();
    }

    public List<Estudiante> filtrarPorNombre(String nombre) {
        return repositorio.getEstudiantes().stream()
                .filter(e -> e.getNombre().equalsIgnoreCase(nombre))
                .collect(Collectors.toList());
    }

    public List<Estudiante> filtrarPorNumeroCelular(String numeroCelular) {
        return repositorio.getEstudiantes().stream()
                .filter(e -> e.getNumeroCelular().equals(numeroCelular))
                .collect(Collectors.toList());
    }

    public List<Estudiante> ordenarPorPromedioNotas() {
        return repositorio.getEstudiantes().stream()
                .sorted(Comparator.comparingDouble(Estudiante::getPromedioNotas))
                .collect(Collectors.toList());
    }
}