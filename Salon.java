/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocultural;

/**
 *
 * @author almasofiahernandez
 */
public class Salon extends AreaFisica {
    private int numeroMesas;
    private int numeroSillas;

    public Salon(String identificador, String nombre, int numeroMesas, int numeroSillas) {
        super(identificador, nombre);
        this.numeroMesas = numeroMesas;
        this.numeroSillas = numeroSillas;
    }


    public String getDetalles() {
        return numeroMesas + " mesas, " + numeroSillas + " sillas";
    }
}


