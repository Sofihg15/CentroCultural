/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocultural;

/**
 *
 * @author almasofiahernandez
 */
public class Cancha extends AreaFisica {
    private String tipoDeporte;
    private boolean techada;

    public Cancha(String identificador, String nombre, String tipoDeporte, boolean techada) {
        super(identificador, nombre);
        this.tipoDeporte = tipoDeporte;
        this.techada = techada;
    }

    public String getDetalles() {
        return tipoDeporte + (techada ? " (techada)" : " (abierta)");
    }
}
