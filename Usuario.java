/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.centrocultural;

/**
 *
 * @author almasofiahernandez
 */
public class Usuario {
    private String username;
    private String password;
    private String perfil; // "ADMINISTRACION", "CONTABILIDAD"
    
    public Usuario(String username, String password, String perfil) {
        this.username = username;
        this.password = password;
        this.perfil = perfil;
    }
    
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getPerfil() { return perfil; }
    
    public boolean validarCredenciales(String user, String pass) {
        return this.username.equals(user) && this.password.equals(pass);
    }
}
