package com.example.a2086255.calculator;

/**
 * Created by 2093715 on 3/14/17.
 */

public class PilaArray
{
    private int[] PILA;
    private int TOPE;
    int MAX;

    //-- CUANDO NO SE LE ASIGNA EL TAMAÑO MAXIMO
    public PilaArray()
    {
        this.TOPE = 0;
        this.MAX = 100;
        this.PILA = new int[this.MAX+1];
    }

    //-- CUANDO SE LE ASIGNA EL TAMAÑO MAXIMO
    public PilaArray(int MAX)
    {
        this.TOPE = 0;
        this.MAX = MAX;
        this.PILA = new int[this.MAX+1];
    }

    public int GetTOPE()
    {
        return TOPE;
    }

    public void VaciarPila()
    {
        this.TOPE = 0;
    }

    public boolean IsPilaLlena()
    {
        if(this.MAX == this.TOPE)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean IsPilaVacia()
    {
        if(this.TOPE == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}