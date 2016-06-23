/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import E9.MyException;
import E9.TestMyException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dilan
 */
public class Cuenta 
{
    public int numcuenta;
    public String cliente;
    public int saldo;

    public int getNumcuenta() {
        return numcuenta;
    }

    public String getCliente() {
        return cliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public Cuenta(int numcuenta, String cliente, int saldo) {
        this.numcuenta = numcuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    

    public Cuenta() {
        this.saldos = 0.0;
    }
    private double checksaldo()
    {return saldos;}
    private double saldos;

    public void deposito(double money)throws WrongAmountException
    {
        if(money <= 0.0)
        {
            throw new WrongAmountException("wrong");
        }
        else
        {
            saldos = saldos + money;
        }
    }
    public void retiro(double dollar)throws SaldoInsuficienteException
    {
        if(dollar >0.0 )
        {
            throw new SaldoInsuficienteException("saldo insuficiente");
        }
        else
        {
            saldos = saldos - dollar;
        }
        
    }
    public static void main (String[]args) throws WrongAmountException
    {
        Cuenta c = new Cuenta();
    }
    
 }
