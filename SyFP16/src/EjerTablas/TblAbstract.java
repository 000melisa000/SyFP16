/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerTablas;

import E8.TryResource;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dilan
 */
public class TblAbstract extends AbstractTableModel
{
    String m [][]; //matriz

    public TblAbstract(String s) throws IOException 
    {
        int i = 0;
        m = new String[101][6];
        String row[];//variable arreglo[]
        BufferedReader br = null;
            try 
            {
                br = new BufferedReader(new FileReader(s));
                String linea;
                linea = br.readLine();
                while(linea != null)
                {
                    row = linea.split(",");
                    m [i] = row;
                    i=i+1;
                    linea = br.readLine();
                }
            } 
            catch (FileNotFoundException ex) 
            {
            
        }
    }
    
    @Override
    public int getRowCount() 
    {
        return 100;
    }

    @Override
    public int getColumnCount() 
    {
        return 100;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        return m [rowIndex][columnIndex];
    }
}
