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

public class AreaTaller extends AreaFisica {
    private ArrayList<String> maquinasEquipo;

    public AreaTaller(String identificador, String nombre) {
        super(identificador, nombre);
        this.maquinasEquipo = new ArrayList<>();
    }

    public void agregarMaquina(String maquina) {
        maquinasEquipo.add(maquina);
    }

    public String getDetalles() {
        return maquinasEquipo.size() + " equipos/máquinas";
    }
}

