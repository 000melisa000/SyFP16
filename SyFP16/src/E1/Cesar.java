/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E1;

/**
 *
 * @author dilan
 */
public class Cesar
{
    public String cifrar(int constante, String mensaje)
    {
        String resultado = "";
        for(int i=0; i<=mensaje.length(); i=i +1)
       {
            resultado = resultado + (char)(mensaje.charAt(i)+ constante);
            
               
        }
        return resultado;
        
    }
    public static void main (String[] args)
    {
        Cesar c = new Cesar();
        String cifrar = c.cifrar(3,"hola");
        System.out.println(c.cifrar(3,"hola"));
        String a1= c.descifrar(3,"");
        System.out.println(a1);
        
    }
    public String descifrar(int letra, String codigo)
    {
        String diferencia = "";
        for(int i=0; i<=codigo.length(); i=i +1)
        {
            diferencia = diferencia + (char)(codigo.charAt(i)- letra);
        }
        return diferencia;
    }
}
 
