/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dilan
 */
public class TryResource 
{
    public static void main (String[]args)
    {
        try(BufferedReader br = new BufferedReader(new FileReader("ejemplo .txt")))
        {
            String Linea;
            Linea = br.readLine();
            System.out.println("imprimir linea");
        }
        
        catch (IOException ex) {
            Logger.getLogger(TryResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
