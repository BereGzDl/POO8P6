/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fi.poo; //tenemos que indicar que la clase se encuentra en este paquete poo8p6 

//para generar un archivo. jar : project(taza)>properties>Build>Packaging>mark en COmpress JAR File> ok
//información de la documentación en html: Generate Javadoc (se encuentra en la carpeta de Javadoc en Finder, es la opción "index.html")
//el martillo con la escoba limpia todo (es como resetear el código por si no funcionaba)

//====Comentarios de documentación====
/**
 * @author Acosta Luna, Calderón Nikole, González Berenice
 */
public class POO8P6 {
    
    //Projects>package>poo8p6>refactor (fi)>renombrarlo en archivos
    //Projects>package>fi>newProject>poo
    //arrastramos la classe poo8p6 a fi.po, se eliminó el paquete fi
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo :) ");
        
        /**
         * Constructor
         */
        Persona persona = new Persona ("Berenice","Ingenieria Computacion",19);
        
        /**
         * Se define lo que hará el método (String o int: var)
         */
        persona.hablar("Hablar: Hola soy una persona!");
        persona.comer("Comer: Pozole");
        persona.correr(30);
        persona.bailar("Bailar: Rock and Roll");
        persona.saludar("Saludar: Holaaaaaa");
    }
}
