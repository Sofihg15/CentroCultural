/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocultural;

/**
 *
 * @author almasofiahernandez
 */
public class ComprobanteCapacitaciòn {
    private String nombreCurso;
    private String institucion;

    public ComprobanteCapacitaciòn(String nombreCurso, String institucion) {
        this.nombreCurso = nombreCurso;
        this.institucion = institucion;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getInstitucion() {
        return institucion;
    }
}
