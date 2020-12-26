/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jakas;

import BaseClass.Vozilo;


/**
 *
 * @author m.jakas
 */
public class Stek {
    private final int MAX=5;
    private int brojac=0;
    private Vozilo[] lista;

    /**
     *
     */
    public Stek()
    {
        lista = new Vozilo[MAX];
    }
    /**
     * @return the lista
     */
    public Vozilo[] getLista() {
        return lista;
    }

    public boolean dodajUListu(Vozilo novaSaobracajnaDozvola)
    {
        
        try
        {
            //provera da li postoji
            if(brojac < MAX)
            {
                lista[brojac] = novaSaobracajnaDozvola;
                brojac++;                
            }
        }
        catch(Exception e)
        {
            String test=e.getMessage();
            return false;
        }
        return true;
    }
}
