/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

// ====Comentarios de documentación====

/**
 * @author Acosta Luna, Calderón Nikole, González Berenice 
 */

/**
 * Clase que contiene los métodos que realiza una persona
 * @private Encapsulamiento de variables
 */
public class Persona {
    private String nombre, carrera;
    private int edad;
    

    /**
     * Constructor vacío de persona
     */
    public Persona() {
    }
    
    /**
     * Constructor con todos los atributos de Persona
     * @param nombre Nombre de la persona (String)
     * @param carrera Nombre de la carrera (String)
     * @param edad Edad primitivo (int)
     */
    public Persona(String nombre, String carrera, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
    }
    
    /**
     * Método getNombre
     * @return Regresa el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre
     * @this.nombre = nombre  Modifica el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getCarrera
     * @return Regresa el carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Método setCarrera
     * @this.carrera = carrera  Modifica el carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Método getEdad
     * @return Regresa el edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método setEdad
     * @this.edad = edad  Modifica el edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Método que realiza el verbo de hablar en la persona
     * @param var Lo que la persona dice 
     */
    public void hablar (String var)
    {
        System.out.println(var);
        
    }
    
    /**
     * Método que realiza el verbo de comer en la persona
     * @param var Lo que la persona comerá  
     */
    public void comer (String var)
    {
        System.out.println(var);
        
    }
    
    /**
     * Método que realiza el verbo de correr en la persona
     * @param var Cuántos minutos corrió
     */
    public void correr (int var)
    {
        System.out.println(var);
        
    }
    
    /**
     * Método que realiza el verbo de bailar en la persona
     * @param var Lo que la persona va a bailar 
     */
    public void bailar (String var)
    {
        System.out.println(var);
        
    }
    
    /**
     * Método que realiza el verbo de saludar en la persona
     * @param var Lo que la persona dice cuando saluda
     */
    public void saludar (String var)
    {
        System.out.println(var);
        
    }
   
    /**
     * Método toString Sobre escrito que muestra los valores de los atributos
     * @return Concatenación de atributos
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", carrera=" + carrera + ", edad=" + edad + '}';
    }
    
}
