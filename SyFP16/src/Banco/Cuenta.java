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

    public Cuenta() {
        this.saldo = 0.0;
    }
    private double checksaldo()
    {return saldo;}
    private double saldo;

    public void deposito(double money)throws WrongAmountException
    {
        if(money <= 0.0)
        {
            throw new WrongAmountException("wrong");
        }
        else
        {
            saldo = saldo + money;
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
            saldo = saldo - dollar;
        }
        
    }
    public static void main (String[]args) throws WrongAmountException
    {
        Cuenta c = new Cuenta();
    }
    
 }
