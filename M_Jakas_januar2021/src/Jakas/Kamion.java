/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jakas;

import BaseClass.Vozilo;
import Enum.enTipVlasnistva;
import Interfaces.IMarkaVozila;
import Interfaces.IVlasnikVozila;
import Main.VlasnikVozila;

/**
 *
 * @author m.jakas
 */
public class Kamion extends Vozilo implements IVlasnikVozila,IMarkaVozila {
     //region Promenjive
    private String registracionaOznaka;
  
    private enTipVlasnistva tipVlasnistva;
    private VlasnikVozila vlasnikVozila;

    //endregion
    //region Konstruktor
    public Kamion()
    {
       
    }
   
    //endregion
    
    //region Implementacija Interfejsa


    /**
     * @return the RegistracionaOznaka
     */
    public String getRegistracija() {
        return registracionaOznaka;
    }

    /**
     * @param Registracija the RegistracionaOznaka to set
     */
    public void setRegistracija(String Registracija) {
        this.registracionaOznaka = Registracija;
    }

 
    @Override
    public enTipVlasnistva getTipVlasnistva() {
        return this.tipVlasnistva;
    }

    @Override
    public void setTipVlasnistva(enTipVlasnistva TipVlasnistva) {
        this.tipVlasnistva=TipVlasnistva;
    }

    @Override
    public VlasnikVozila getVlaskikVozila() {
        return vlasnikVozila;
    }

    @Override
    public void setVlaskikVozila(VlasnikVozila vlasnikVozila) {
        this.vlasnikVozila=vlasnikVozila;
    }

    @Override
    public void setMarkaVozila(String MarkaVozila) {
        super.setMarkaVozila(MarkaVozila);
    }

    @Override
    public void setZemljaPorekla(String ZemljaPorekla) {
        super.setZemljaPoreklaVozila(ZemljaPorekla);
    }

    @Override
    public String getZemljaPorekla() {
        return super.getZemljaPoreklaVozila();
    }

 

}
