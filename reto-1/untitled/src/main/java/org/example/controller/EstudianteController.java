package org.example.controller;

import org.example.model.Estudiante;
import org.example.service.ServiceEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private ServiceEstudiante service;

    @GetMapping("/listar")
    public List<Estudiante> listarEstudiantes() {
        return service.listarEstudiantes();
    }

    @GetMapping("/filtrar/nombre")
    public List<Estudiante> filtrarPorNombre(@RequestParam String nombre) {
        return service.filtrarPorNombre(nombre);
    }

    @GetMapping("/filtrar/celular")
    public List<Estudiante> filtrarPorCelular(@RequestParam String celular) {
        return service.filtrarPorNumeroCelular(celular);
    }

    @GetMapping("/ordenar/promedio")
    public List<Estudiante> ordenarPorPromedio() {
        return service.ordenarPorPromedioNotas();
    }
}