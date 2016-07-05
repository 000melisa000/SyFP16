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
    String nombredelarchivo;
    String m [][]; //matriz
    int i =0;
   
    public int contarRenglones ()
    {
        int i = 0;
        {
            BufferedReader br = null;
            String linea;
            linea = readline();
            while(linea != null)
            {
                i=1+1;
                try {
                    linea = br.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(TblAbstract.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } return i;
    }
    public int contarColumnas()
    {
        String linea;
        linea = readline();
        String cols [];
        cols = linea.split(",");
        i = cols.length;
        return i;
    }

    public TblAbstract(String s)
    {
        int i = 0;
        m = new String[contarRenglones()][contarColumnas()];
        String row[];//variable arreglo[]
        BufferedReader br = null;
            try 
            {
                br = new BufferedReader(new FileReader(s));
                String linea = null;
            try {
                linea = br.readLine();
            } catch (IOException ex) {
               
            }
                while(linea != null)
                {
                    row = linea.split(",");
                    m [i] = row;
                    i=i+1;
                    try {
                        linea = br.readLine();
                    } catch (IOException ex) {
                        
                    }
                }
            } 
            catch (FileNotFoundException ex) 
            {
            
        }
    }
    
    @Override
    public int getRowCount() 
    {
        return contarRenglones();
    }

    @Override
    public int getColumnCount() 
    {
        return contarColumnas();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        return m [rowIndex][columnIndex];
    }

    private String readline() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
