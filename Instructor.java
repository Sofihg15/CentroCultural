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

public class Instructor extends Persona {

    private ArrayList<String> cursosCapacitacion; // lista de cursos
    private ArrayList<String> actividadesImparte; // nombres de actividades
    private String areaAlmacenamiento; // locker o espacio fijo

    public Instructor(String nombre, String direccion, String areaAlmacenamiento) {
        super(nombre, direccion); // Invoca constructor de Persona
        this.areaAlmacenamiento = areaAlmacenamiento;
        this.cursosCapacitacion = new ArrayList<>();
        this.actividadesImparte = new ArrayList<>();
    }

    public String getAreaAlmacenamiento() { return areaAlmacenamiento; }
    public ArrayList<String> getCursosCapacitacion() { return cursosCapacitacion; }
    public ArrayList<String> getActividadesImparte() { return actividadesImparte; }

    public void agregarCurso(String curso) {
        cursosCapacitacion.add(curso);
    }

    public void asignarActividad(String actividad) {
        actividadesImparte.add(actividad);
    }

    public void setAreaAlmacenamiento(String areaAlmacenamiento) {
        this.areaAlmacenamiento = areaAlmacenamiento;
    }
}

