/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E6;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;

/**
 *
 * @author dilan
 */
public class Convertidor 
{
    Map <String,Double> lista = new HashMap();

    public Convertidor() 
    {
        lista = new HashMap();
        lista.put("centimetros", 0.01);
        lista.put("metros",1.00);
        lista.put("kilometros", 1000.00);
        lista.put("pulgadas",.0254);
        lista.put("pies",.305);
        lista.put("yardas",.914);
        lista.put("millas",1613.00);
    }
    
    public double convertir(String s, double d,String s1)
    {
        if(lista.containsKey(s))
        {
            double cm = lista.get(s);
            cm= cm * d;
            double inch = lista.get(s1);
            return cm/inch;
        }
        return 0.0; 
    }
    public static void main (String[]args)
    {
        Convertidor c = new Convertidor();
        double r = c.convertir("centrimetros", 30.00, "pies");
        System.out.println(r);
        
    }

    Convertidor(JComboBox<String> cb1, double valor, JComboBox<String> cb2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}
