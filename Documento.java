/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocultural;

/**
 *
 * @author almasofiahernandez
 */
public class Documento {
    public enum TipoDocumento {
        IDENTIFICACION,
        COMPROBANTE_DOMICILIO,
        CERTIFICADO_MEDICO,
        CREDENCIAL_MENOR,
        DOCUMENTO_TUTOR
    }

    private TipoDocumento tipo;
    private boolean entregado;

    public Documento(TipoDocumento tipo, boolean entregado) {
        this.tipo = tipo;
        this.entregado = entregado;
    }

    public TipoDocumento getTipo() { return tipo; }
    public boolean isEntregado() { return entregado; }
    public void setEntregado(boolean entregado) { this.entregado = entregado; }
}


