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
public class Persona {
    
    private String nombre;
    private int edad;
    
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    

    
    
    
    
}
