/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package E9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dilan
 */
public class TestMyException 
{
    public static void main (String[]args)
    {
        TestMyException m = new TestMyException();
        try {
            m.test(null);
        } catch (MyException ex) 
        {
            System.out.println(ex.toString());
        }
    }
    public void test (String t)throws MyException
    {
        if (t == null)
        {
            throw new MyException("mi excepcion fue lanzada");
        }
        else
        {
            System.out.println("si es nulo imprime msn");
        }
    }
}
    

