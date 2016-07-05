/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ER3;

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

public class Puzzle extends AbstractTableModel
{
    String contar;
    String Frame;
    String Glue;
    String Puzzle;
    String Storage;
    String row[];
    String col;
    String dd[][];
    dd = new String [][]{{"a","e","i"},{"o","u","z"},{"r","l","p"}}{}; 
    
    
    public int FRAME()
    {
        int i =0;
        try
        {
            BufferedReader br = null;
            String FRAME = null;
            br= new BufferedReader(new FileReader(contar));
            Frame = br.readLine();
            while(FRAME != null)
            {
                String[] col = FRAME.split(";");
                if(row[4].equals("FRAME"))
                {
                    Frame = br.readLine();
                    i = i+1;
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("archivo no encontrado");
        } catch (IOException ex) {
            System.out.println("error escritura y lectura");
        }
        return i;
    }

    public int GLUE()
    {
        int i =0;
        try{
            BufferedReader br= null;
            String GLUE = null;
            br = new BufferedReader(new FileReader(contar));
            Glue= br.readLine();
            while(GLUE !=null)
            {
                String[] col = GLUE.split(";");
                if(row[4].equals("GLUE"))
                {
                    Glue = br.readLine();
                    i = i+1;
                }
            }
        } catch (IOException ex) {
            System.out.println("");
            
        }return i;
    }
    public int PUZZLE()
    {
        int i=0;
        try
        {
            BufferedReader br = null;
            String PUZZLE = null;
            br= new BufferedReader(new FileReader(contar));
            Puzzle = br.readLine();
            while(PUZZLE !=null)
            {
                String[] col= PUZZLE.split(";");
                if(row[4].equals("PUZZLE"))
                {
                    Puzzle = br.readLine();
                    i = i+1;
                }
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("");
            
        } catch (IOException ex) {
            System.out.println("");
        }
        return i;
    }
    public int STORAGE()
    {
        int i=0;
        try
        {
            BufferedReader br = null;
            String STORAGE = null;
            br= new BufferedReader(new FileReader(contar));
            Storage = br.readLine();
            while(STORAGE !=null)
            {
                String[] col= STORAGE.split(";");
                if(row[4].equals("STORAGE"))
                {
                    Storage = br.readLine();
                    i = i+1;
                }
            }
            
        } catch (IOException ex) {
            System.out.println("");
        }
        return i;
    }
    @Override
    public int getRowCount() 
    {
        return 4;
        
    }
    @Override
    public int getColumnCount() 
    {
        return 4;
        
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        return [rowIndex][columnIndex];
    }

    public Puzzle(String Frame, String Glue, String Puzzle, String Storage) {
        this.Frame = Frame;
        this.Glue = Glue;
        this.Puzzle = Puzzle;
        this.Storage = Storage;
    }
    
    
    
}
