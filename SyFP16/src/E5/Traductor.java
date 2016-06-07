/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E5;

import java.util.ArrayList;

/**
 *
 * @author dilan
 */
public class Traductor 
{
    public Traductor(){
        arregloPalabras = new ArrayList();
        arregloTraducciones = new ArrayList();
    }
   
    public String traducir (String input)
    {
        int i= arregloPalabras.indexOf(input);
        if(i == -1){
            return input;
        }
        else {
            return arregloTraducciones.get(i);
        }
    }
    
    public void agregar (String palabraTraducir, String palabraTraducida)
    {
        arregloPalabras.add(palabraTraducir);
        arregloTraducciones.add(palabraTraducida);
        
    }
    
    public String eliminar (String palabraAE)
    {
        return palabraAE;
    }
    
    public static void main (String[]args)
    {
        ArrayList <Traductor> arregloTraductor;
    
        Traductor t = new Traductor ();
        arregloTraductor = new ArrayList <Traductor>();
        
    }
    
    ArrayList <String> arregloPalabras;
    ArrayList <String> arregloTraducciones;
    
    
}
