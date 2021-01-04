/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import BusinessLogic.Vozilo;


/**
 *
 * @author m.jakas
 */
public class Stek {

    private final int MAX=20;   //final znaci da nema promene = konstanta
    private int brojac=0;       //brojac liste,
    private Vozilo[] lista;     //[] predstavlja niz, Vozilo je tip podatka za niz

    /**
     *Konstruktor, default
     * Konsruktor se izvrsava kada objekat Instancira , new Stek();
     */
    public Stek()
    {
        lista = new Vozilo[MAX];
    }
   
    
    
       /**
     * @return the MAX
     */
    public int getMAX() {
        return MAX;
    }
    /**
     * @return the lista
     */
    public Vozilo[] getLista() {
        return lista;
    }

    public boolean dodajUListu(Vozilo novoVozilo)
    {
        
        try
        {
            //todo: provera da li postoji
            
            //provera da li je lista popunjena, i dodaje samo ako ima mesta
            if(brojac < getMAX())
            {
                lista[brojac] = novoVozilo;
                brojac++;                
            }
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
}
