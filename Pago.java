/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocultural;

/**
 *
 * @author almasofiahernandez
 */

import java.util.Date;
public class Pago {

    public enum TipoPago {
        INSCRIPCION,
        MENSUALIDAD
    }

    private TipoPago tipoPago;
    private Date fechaPago;
    private String numeroExpedienteAlumno; // Identificador único del alumno
    private double monto;
    private boolean comprobanteImpreso;

    public Pago(TipoPago tipoPago, Date fechaPago, String numeroExpedienteAlumno, double monto) {
        this.tipoPago = tipoPago;
        this.fechaPago = fechaPago;
        this.numeroExpedienteAlumno = numeroExpedienteAlumno;
        this.monto = monto;
        this.comprobanteImpreso = false;
    }

    public TipoPago getTipoPago() { return tipoPago; }
    public Date getFechaPago() { return fechaPago; }
    public String getNumeroExpedienteAlumno() { return numeroExpedienteAlumno; }
    public double getMonto() { return monto; }
    public boolean isComprobanteImpreso() { return comprobanteImpreso; }
    public void setComprobanteImpreso(boolean impreso) { this.comprobanteImpreso = impreso; }

    // Determina si el pago es vigente (menos de un mes)
    public boolean isVigente() {
        long unMes = 30L * 24 * 60 * 60 * 1000;
        return (System.currentTimeMillis() - fechaPago.getTime()) <= unMes;
    }
}
