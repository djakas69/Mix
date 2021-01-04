package BusinessLogic;

import Interfaces.IRegistracija;
import Interfaces.ISluzbenoVozilo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author d.jakas 9 i 10 tacke zahteva
 */
public class Automobil extends Vozilo implements ISluzbenoVozilo, IRegistracija {

    //region Promenjive
    private int brojSedista;
    private int brojVrata;
    private String sluzbenaOznaka;
    private String registracija;
    //endregion

    //region Konstruktor
    public Automobil() {

    }
    public Automobil(String MarkaVozila,String modelVozila) {
        super.setMarkaVozila(MarkaVozila);
        super.setModelVozila(modelVozila);
    }
    //endregion
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

//------------------- INTERFACES ---------------------------------
    @Override
    public String getFirma() {
        return "";
    }

    @Override
    public String getSluzbenaOznaka() {
        return this.sluzbenaOznaka;
    }

    /**
     *
     * @param firma firma
     */
    @Override
    public void setFirma(String firma) {

    }

    /**
     *
     * @param sluzbenaOznaka sluzbenaOznaka
     */
    @Override
    public void setSluzbenaOznaka(String sluzbenaOznaka) {
        this.sluzbenaOznaka = sluzbenaOznaka;
    }

    @Override
    public String getRegistracija() {
        return this.registracija;
    }

    /**
     *
     * @param registracija registracija
     */
    @Override
    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

}
