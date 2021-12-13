/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heredar;

/**
 *
 * @author canow
 */
public abstract class Persona {
    public String apellidos;
    public String nombres;
    public String telefono;
    public String email;
    public String password;
    public String direccion;
    
    public Persona(){}

    public Persona(String apellidos, String nombres, String telefono, String email, String password, String direccion) {
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
        this.direccion = direccion;
    }
    
    
}
