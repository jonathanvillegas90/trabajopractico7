/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP7;

/**
 *
 * @author Chony
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Materia ingles=new Materia(1,"Ingles I",1);
        Materia matematicas=new Materia(2,"Matemáticas",1);
        Materia laboratorio=new Materia(3,"Laboratorio I",1);
        //nueva materia
        
        
        Alumno a1=new Alumno(1001,"López","Martin");
        Alumno a2=new Alumno(1002,"Martínez","Brenda");
        

//inscripcion a martinez
        a2.agregarMateria(ingles);
        a2.agregarMateria(matematicas);
        a2.agregarMateria(laboratorio);
        
//inscripcion a lopez
        a1.agregarMateria(laboratorio);
        a1.agregarMateria(ingles);
        a1.agregarMateria(matematicas);
        a1.agregarMateria(laboratorio);
        
        System.out.println(a1.cantidadMaterias());
        System.out.println(a2.cantidadMaterias());
    }
    
}
