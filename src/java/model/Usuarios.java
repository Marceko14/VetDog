/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nicolas
 */
public class Usuarios {
    
    // CREAMOS LOS ATRIBUTOS DE LA TABLA USUARIOS
    public Integer id_usuario;
    public String usuario;
    public String email;
    public String clave;
    
    // CONSTRUCTOR VACIO 

    public Usuarios() {
    }

    public Usuarios(Integer id_usuario, String usuario, String email, String clave) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.email = email;
        this.clave = clave;
    }
    
    
    // GETTERS AND SETTERS 

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
    
}
