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
import java.util.Date;

public class Alumno extends Persona {
    private Date fechaNacimiento;
    private String numeroExpediente;
    private boolean vigente;
    private String tutor;
    private ArrayList<Pago> pagos;
    private ArrayList<Documento> documentos;

    public Alumno(String nombre, String direccion, Date fechaNacimiento, String numeroExpediente) {
        super(nombre, direccion); 
        this.fechaNacimiento = fechaNacimiento;
        this.numeroExpediente = numeroExpediente;
        this.vigente = true; // Arranca vigente
        this.pagos = new ArrayList<>();
        this.documentos = new ArrayList<>();

        documentos.add(new Documento(Documento.TipoDocumento.CERTIFICADO_MEDICO, false));
        documentos.add(new Documento(Documento.TipoDocumento.IDENTIFICACION, false));
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public ArrayList<Pago> getPagos() {
        return pagos;
    }

    public void agregarPago(Pago pago) {
        pagos.add(pago);
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public boolean isMayorEdad() {
        long edadEnMillis = System.currentTimeMillis() - fechaNacimiento.getTime();
        long anios = edadEnMillis / (365L * 24 * 60 * 60 * 1000); // Conversión a años
        return anios >= 18;
    }
}
