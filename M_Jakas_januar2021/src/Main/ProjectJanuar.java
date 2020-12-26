/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Enum.enTipVlasnistva;
import Jakas.Automobil;
import Jakas.Stek;


/**
 *
 * @author d.jakas
 */
public class ProjectJanuar {
    //region VARIABLES
   
    private Stek listaDozvola;
    //endregion
    public ProjectJanuar()
    {
       listaDozvola= new Stek();
    }
    /**
     * @return the ListaVozila
     */
  

    /**
     * @param tipVozila
     * @param TipVlasnistva
     * @param MarkaVozila
     * @param namenaVozila
     * @param RegistarskaOznaka
     * @param Ime
     * @param Prezime
     * @param Adresa
     * @return 
     */
//    public void setListaVozila(List ListaVozila) {
//        this.ListaVozila = ListaVozila;
//    }
    
    public boolean addVozilo(
            String tipVozila,
            enTipVlasnistva TipVlasnistva,
            String MarkaVozila,
            String namenaVozila,
            String RegistarskaOznaka,
            String Ime, 
            String Prezime,
            String Adresa)
    {
        boolean res=true;
//        
        Jakas.Automobil novaSaobracajnaDozvola = new Jakas.Automobil();
//        novaSaobracajnaDozvola.SetMarkaVozila(MarkaVozila);
//        novaSaobracajnaDozvola.getVlaskikVozila(Ime, Prezime, Adresa);
//        novaSaobracajnaDozvola.setTipVlasnistva(TipVlasnistva);
//        
//        novaSaobracajnaDozvola.setRegistracija(RegistarskaOznaka);
//        
//            
//        System.out.println("tipVozila: " + tipVozila);
//
//        //String namenaVozila = ;
//        System.out.println("namenaVozila: " + namenaVozila);
//
        if(listaDozvola==null)
        {
            listaDozvola= new Stek();
        }
        listaDozvola.dodajUListu(novaSaobracajnaDozvola);
        
        Jakas.Kamion novaSaobracajnaDozvola2 = new Jakas.Kamion();
       listaDozvola.dodajUListu(novaSaobracajnaDozvola2);
       
       Jakas.Motor novaSaobracajnaDozvola3 = new Jakas.Motor();
       listaDozvola.dodajUListu(novaSaobracajnaDozvola3);
       
        return res;
    }
}
