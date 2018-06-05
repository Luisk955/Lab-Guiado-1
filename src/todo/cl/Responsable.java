/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.cl;

/**
 *
 * @author Luisk
 */
public class Responsable {
    private String nombre;
    private String apellidos;
    private String identificacion;

    public Responsable(String identificacion) {
        this.identificacion = identificacion;
    }

    public Responsable(String nombre, String apellidos, String identificacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Responsable: nombre: " + nombre + ", apellidos: " + apellidos + ", identificacion: " + identificacion;
    }
    
    
}
