/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Chony
 */
public class Alumno {
    HashSet<Materia>materias=new HashSet<>();
    int legajo;
    String apellido,nombre;
//constructor
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
//seters y geters

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodos
    
    public void agregarMateria(Materia M){

           if(materias.add(M)){
               materias.add(M);
               JOptionPane.showMessageDialog(null, "Alumno agregado");
           }else{
               JOptionPane.showMessageDialog(null, "Alumno ya se encontraba inscripto");
           }
    }
    public int cantidadMaterias(){
        return materias.size();
    }

    @Override
    public String toString() {
        return this.apellido+", "+this.nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
}
