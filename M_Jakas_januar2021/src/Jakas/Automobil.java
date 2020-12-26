package Jakas;

import BaseClass.Vozilo;
import Enum.enTipVlasnistva;
import Interfaces.IMarkaVozila;
import Interfaces.IVlasnikVozila;
import Main.VlasnikVozila;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author d.jakas
 */
public class Automobil extends Vozilo implements IVlasnikVozila,IMarkaVozila  {
    //region Promenjive
    private String registracionaOznaka;
  
    private enTipVlasnistva tipVlasnistva;
    private VlasnikVozila vlasnikVozila;
    private int brojSedista;
    private int brojVrata;
    //endregion
    //region Konstruktor
    public Automobil()
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

    /**
     * @return the brojSedista
     */
    public int getBrojSedista() {
        return brojSedista;
    }

    /**
     * @param brojSedista the brojSedista to set
     */
    public void setBrojSedista(int brojSedista) {
        this.brojSedista = brojSedista;
    }

    /**
     * @return the brojVrata
     */
    public int getBrojVrata() {
        return brojVrata;
    }

    /**
     * @param brojVrata the brojVrata to set
     */
    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

}