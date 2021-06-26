/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usaralumno;

;
import ico.fes.herencia.Alumno;


/**
 *
 * @author Orlando
 */
public class UsarAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno a = new Alumno("Orlando" , 20 , 1.70f, "419104427", "ICO", 2);
        
        a.mostrarDatos();
        
       
    }
    
}
