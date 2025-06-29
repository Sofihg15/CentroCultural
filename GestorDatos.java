/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocultural;

/**
 *
 * @author almasofiahernandez
 */
import java.util.ArrayList;

public class GestorDatos {
    private ArrayList<Alumno> alumnos;
    private ArrayList<Pago> pagos;
    private ArrayList<Actividad> actividades;
    private ArrayList<Instructor> instructores;
    private ArrayList<AreaFisica> areas;

    public GestorDatos() {
        alumnos = new ArrayList<>();
        pagos = new ArrayList<>();
        actividades = new ArrayList<>();
        instructores = new ArrayList<>();
        areas = new ArrayList<>();
    }

    // === ALUMNOS ===
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public ArrayList<Alumno> getAlumnosVigentes() {
        ArrayList<Alumno> vigentes = new ArrayList<>();
        for (Alumno a : alumnos) {
            if (a.isVigente()) {
                vigentes.add(a);
            }
        }
        return vigentes;
    }

    // === PAGOS ===
    public void agregarPago(Pago pago) {
        pagos.add(pago);
    }

  public ArrayList<Pago> getPagosPorAlumno(String numeroExpediente) {
    ArrayList<Pago> pagosAlumno = new ArrayList<>();
    for (Pago p : pagos) {
        if (p.getNumeroExpedienteAlumno().equalsIgnoreCase(numeroExpediente)) {
            pagosAlumno.add(p);
        }
    }
    return pagosAlumno;
}

    // === ACTIVIDADES ===
    public void agregarActividad(Actividad actividad) {
        actividades.add(actividad);
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    // === INSTRUCTORES ===
    public void agregarInstructor(Instructor instructor) {
        instructores.add(instructor);
    }

    public ArrayList<Instructor> getInstructores() {
        return instructores;
    }

    // === ÁREAS ===
    public void agregarArea(AreaFisica area) {
        areas.add(area);
    }

    public ArrayList<AreaFisica> getAreas() {
        return areas;
    }
}
