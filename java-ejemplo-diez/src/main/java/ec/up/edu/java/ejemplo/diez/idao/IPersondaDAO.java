/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.up.edu.java.ejemplo.diez.idao;

import ec.up.edu.java.ejemplo.diez.modelo.Persona;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface IPersondaDAO {
    public void create(Persona persona);
    public Persona read(String cedula);
    public void update(Persona persona);
    public void delete(Persona persona);
    public List<Persona> listar();
}
