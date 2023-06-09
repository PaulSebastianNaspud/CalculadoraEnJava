/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.up.edu.java.ejemplo.diez.modelo;

import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class Persona {
    private String cedeula;
    private String nombre;
    private GregorianCalendar fechaNacimiento;

    public Persona() {
    }

    public Persona(String cedeula, String nombre, GregorianCalendar fechaNacimiento) {
        this.cedeula = cedeula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedeula() {
        return cedeula;
    }

    public void setCedeula(String cedeula) {
        this.cedeula = cedeula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.cedeula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.cedeula, other.cedeula);
    }

    @Override
    public String toString() {
        return "Persona{" + "cedeula=" + cedeula + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
