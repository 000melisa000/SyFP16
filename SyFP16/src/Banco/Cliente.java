/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author dilan
 */
public class Cliente 
{

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public Cliente(String nombre, String apellido, int numcuenta, int idcliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numcuenta = numcuenta;
        this.idcliente = idcliente;
    }

    
    
    
    private String nombre;
    private String apellido;
    private int numCuenta;
    private int edad;
    public int numcuenta;
    public int idcliente;
    
}
