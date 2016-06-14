/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Er1;

/**
 *
 * @author dilan
 */
public abstract class Aclase implements Iclase {
     protected String descripcion;
     
     public void print()
     {
         System.out.println(descripcion);
     }

    public Aclase(String descripcion) {
        this.descripcion = descripcion;
    }
     
    
}
   
   
      
    
    


