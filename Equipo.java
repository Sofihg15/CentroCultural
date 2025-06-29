package com.mycompany.centrocultural;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author almasofiahernandez
 */
public class Equipo {
    private String nombre;
    private String codigoInventario; // único
    private int existencia;
    private ResponsableEquipo responsableEquipo;

    public Equipo(String nombre, String codigoInventario, int existencia, ResponsableEquipo responsableEquipo) {
        this.nombre = nombre;
        this.codigoInventario = codigoInventario;
        this.existencia = existencia;
        this.responsableEquipo = responsableEquipo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigoInventario() {
        return codigoInventario;
    }

    public int getExistencia() {
        return existencia;
    }

    public ResponsableEquipo getResponsableEquipo() {
        return responsableEquipo;
    }

    // Setter para existencia con validación simple
    public void setExistencia(int existencia) {
        if (existencia >= 0) {
            this.existencia = existencia;
        } else {
            System.out.println("Existencia no puede ser negativa.");
        }
    }
}



