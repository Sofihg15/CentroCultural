/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocultural;

/**
 *
 * @author almasofiahernandez
 */
import java.util.*;
import java.text.SimpleDateFormat;

public class GeneradorReportes {
    private GestorDatos gestor;
    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public GeneradorReportes(GestorDatos gestor) {
        this.gestor = gestor;
    }
    
    public void imprimirListaAlumnos() {
        System.out.println("\n=== LISTA DE ALUMNOS ===");
        System.out.println("Expediente | Nombre | Edad | Tutor");
        System.out.println("----------------------------------------");
        for (Alumno a : gestor.getAlumnos()) {
            String tutor = a.isMayorEdad() ? "N/A" : a.getTutor();
            System.out.printf("%s | %s | %s | %s%n", 
                a.getNumeroExpediente(), 
                a.getNombre(),
                a.isMayorEdad() ? "Mayor" : "Menor",
                tutor != null ? tutor : "Sin tutor");
        }
    }
    
    public void imprimirEstadoPagos(String nombreAlumno) {
        System.out.println("\n=== ESTADO DE PAGOS: " + nombreAlumno + " ===");
        ArrayList<Pago> pagosAlumno = gestor.getPagosPorAlumno(nombreAlumno);
        if (pagosAlumno.isEmpty()) {
            System.out.println("No hay pagos registrados");
            return;
        }
        
        System.out.println("Fecha | Tipo | Comprobante");
        System.out.println("---------------------------");
        for (Pago p : pagosAlumno) {
            System.out.printf("%s | %s | %s%n",
                formato.format(p.getFechaPago()),
                p.getTipoPago(),
                p.isComprobanteImpreso() ? "Sí" : "No");
        }
    }
    
    public void imprimirListaActividades() {
        System.out.println("\n=== LISTA DE ACTIVIDADES ===");
        System.out.println("Nombre | Tipo | Instructor");
        System.out.println("---------------------------");
        for (Actividad a : gestor.getActividades()) {
            System.out.printf("%s | %s | %s%n",
                a.getNombre(),
                a.getTipo(),
                a.getInstructorResponsable()); // o a.getInstructor().getNombre()
        }
    }
    
    public void imprimirListaInstructores() {
        System.out.println("\n=== LISTA DE INSTRUCTORES ===");
        System.out.println("Nombre | Dirección");
        System.out.println("------------------");
        for (Instructor i : gestor.getInstructores()) {
            System.out.printf("%s | %s%n", i.getNombre(), i.getDireccion());
        }
    }
    
    public void imprimirListaAsistenciaVigentes() {
        System.out.println("\n=== LISTA DE ASISTENCIA - ALUMNOS VIGENTES ===");
        System.out.println("(Máximo un mes de atraso en pagos)");
        System.out.println("Expediente | Nombre | Asistencia");
        System.out.println("----------------------------------");
        
        ArrayList<Alumno> vigentes = gestor.getAlumnosVigentes();
        if (vigentes.isEmpty()) {
            System.out.println("No hay alumnos vigentes");
            return;
        }
        
        for (Alumno a : vigentes) {
            System.out.printf("%s | %s | [ ]%n", 
                a.getNumeroExpediente(), 
                a.getNombre());
        }
        System.out.println("\nTotal de alumnos vigentes: " + vigentes.size());
    }
    
 public void imprimirListaAreas() {
    System.out.println("\n=== LISTA DE ÁREAS FÍSICAS ===");
    System.out.println("Identificador | Nombre | Detalles");
    System.out.println("-----------------------------------");

    for (AreaFisica area : gestor.getAreas()) {
        System.out.printf("%s | %s | %s%n",
            area.getIdentificador(),
            area.getNombre(),
            area.getDetalles()
        );
    }
}
}

