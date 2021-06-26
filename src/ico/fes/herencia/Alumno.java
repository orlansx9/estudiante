/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author Orlando
 */
public class Alumno extends Persona {
    private String numeroCuenta;
    private String carrera;
    private int semestre;

    public Alumno(String nombre,int edad, float altura, String numeroCuenta, String carrera, int semestre){
        super(nombre,edad,altura);
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.semestre = semestre;
        
        
    }
     
    public void mostrarDatos(){
        System.out.println("Nombre" + getNombre() + "la edad es" + getEdad() + "la altura es" + getAltura() + "la carrera es" + carrera + "el numero de cuenta es" + numeroCuenta + "el semestre es el" + semestre);
    }
  
}
