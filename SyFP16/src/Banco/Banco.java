/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dilan
 */
public class Banco 
{
    List <Cliente> clientes; //variables
    List <Cuenta> cuentas;

    public Banco() //constructor
    {
        clientes= new ArrayList(); //instancias
        cuentas = new ArrayList();
    }
    
    public void AgregarCliente (Cliente c)
    {
        clientes.add(c); //nombre de la variable add(parametro)
    }
    public void AgregarCuenta(Cuenta a)
    {
       cuentas.add(a);
    }
    
    public void GuardarClientes()
    {
        try(BufferedWriter bw =new BufferedWriter(new FileWriter("clientes.txt",true))) //escribir 
        {
            for(Cliente cl: clientes)
            {
                bw.write(cl.getIdcliente()+ "," + cl.getNumCuenta()+", " + cl.getApellido() + "," + cl.getNombre() +"\n");
            }
            
            
        } catch (IOException ex) {
           
        }
    }
    public void GuardarCuenta()
    {
        try(BufferedWriter bw = new BufferedWriter (new FileWriter("cuentas.txt",true)))//escribir
        {
            for(Cuenta cu :cuentas)
            {
                bw.write(cu.getCliente()+ "," + cu.getNumcuenta()+ "," + cu.getSaldo() + "\n");
            }
            
        } catch (IOException ex) {
            
        }
    }
    
    public static void main (String[]args)
    {
        Banco b = new Banco();
        Cliente t;
        t = new Cliente("juan", "perez", 5 ,1);
        Cliente a;
        a = new Cliente("carlos", "ramirez", 4 ,2);
        Cliente m;
        m = new Cliente("jorge", "jimenez", 3 ,3);
        Cliente n;
        n = new Cliente("jose", "reyes", 2 ,4);
        Cliente z;
        z = new Cliente("ja", "lopez", 9 ,8);
        
        b.AgregarCliente(t);
        b.AgregarCliente(a);
        b.AgregarCliente(m);
        b.AgregarCliente(n);
        b.AgregarCliente(z);
        
        b.GuardarClientes();
        
        Cuenta p;
        p = new Cuenta (1,"juan perez" ,100);
        Cuenta l;
        l = new Cuenta(2, "carlos", 200);
        Cuenta i;
        i = new Cuenta (3, "jorge", 300);
        Cuenta d;
        d= new Cuenta (4,"jose",400);
        Cuenta r;
        r= new Cuenta (5, "ja", 500);
        
        b.AgregarCuenta(p);
        b.AgregarCuenta(l);
        b.AgregarCuenta(i);
        b.AgregarCuenta(d);
        b.AgregarCuenta(r);
        
        b.GuardarCuenta();
    }
    
}

