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
public class Tarea {
    private int id;
    private String descripcion;
    private LocalDate fechaCreacion;
    private LocalDate fechaVencimiento;
    private String responsable;
    private String proyecto;

    public Tarea() {
    }

    public Tarea(int id, String descripcion, LocalDate fechaCreacion, LocalDate fechaVencimiento, String responsable, String proyecto) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.fechaVencimiento = fechaVencimiento;
        this.responsable = responsable;
        this.proyecto = proyecto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Taera: id: " + id + ", descripcion: " + descripcion + ", fechaCreacion: " + fechaCreacion + ", fechaVencimiento: " + fechaVencimiento + ", responsable: " + responsable + ", proyecto: " + proyecto;
    }
    
    
    

}
