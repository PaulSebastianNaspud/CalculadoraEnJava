/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.up.edu.java.ejemplo.diez.dao;

import ec.up.edu.java.ejemplo.diez.idao.IPersondaDAO;
import ec.up.edu.java.ejemplo.diez.modelo.Persona;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class PersonaDAO implements IPersondaDAO{
    private List<Persona> listaPersonas;
    
    
    @Override
    public void create(Persona persona) {
        listaPersonas.add(persona);
    }

    @Override
    public Persona read(String cedula) {
        for (Persona persona : listaPersonas) {
            if(persona.getCedeula().equals(cedula)){
                return persona;
            }
        }return null;
    }

    @Override
    public void update(Persona persona) {
        if(listaPersonas.contains(persona)){
            listaPersonas.set(listaPersonas.indexOf(persona), persona);
        }
    }

    @Override
    public void delete(Persona persona) {
        if(listaPersonas.contains(persona)){
            listaPersonas.remove(persona);
        }
    }

    @Override
    public List<Persona> listar() {
        return listaPersonas;
    }
    
}
