/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.cl;

import java.time.LocalDate;

/**
 *
 * @author Luisk
 */
public class Proyecto {
    private String nombre;
    private LocalDate fechaCreacion;

    public Proyecto() {
    }

    public Proyecto(String nombre, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Proyecto: nombre: " + nombre + ", fechaCreacion: " + fechaCreacion;
    }
    
    
}
