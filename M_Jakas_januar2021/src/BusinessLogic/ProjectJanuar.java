/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import Data.Stek;


/**
 *
 * @author d.jakas
 */
public class ProjectJanuar {
    //region VARIABLES

    private Stek listaNarucenihVozila;
	private Stek listaDozvola;

    //endregion
    public ProjectJanuar() {
        listaNarucenihVozila = new Stek();
    }

    /**
     * @return the ListaVozila
     */
    /**
     * @param tipVozila
     * @param markaVozila
     * @param modelVozila
     * @param brojSedista
     * @param brojVrata
     * @param registarskaOznaka
     * @param ime
     * @param prezime
     * @param adresa
     * @param sluzbenaOznaka
     * @param firma
     * @param kubikaza
     * @param kapacitet
     * @param prikolica
     * @param brojOsovina
     * @return
     */
//    public void setListaVozila(List ListaVozila) {
//        this.ListaVozila = ListaVozila;
//    }
    public boolean naruciVozilo(
            String tipVozila,
            String markaVozila,
            String modelVozila,
            int brojSedista,
            int brojVrata,
            String registarskaOznaka,
            String ime,
            String prezime,
            String adresa,
            String sluzbenaOznaka,
            String firma,
            int kubikaza,
            int kapacitet,
            boolean prikolica,
            int brojOsovina
            ) {
        boolean res = true;
        try{
            
            //ako listaNarucenihVozila nije inicijalizovana
            if (listaNarucenihVozila == null) {
                listaNarucenihVozila = new Stek();
            }

            switch(tipVozila)
            {
                case "automobil": 
                    BusinessLogic.Automobil noviAutomobil = new Automobil(markaVozila, modelVozila);
                    noviAutomobil.setRegistracija(registarskaOznaka);
                    VlasnikVozila noviVlasnik = new VlasnikVozila(ime, prezime, adresa);
                    noviAutomobil.setVlasnikVozila(noviVlasnik);
                    noviAutomobil.setBrojSedista(brojSedista);
                    noviAutomobil.setBrojVrata(brojVrata);
                    noviAutomobil.setSluzbenaOznaka(sluzbenaOznaka);
                    noviAutomobil.setFirma(firma);
                    res=listaNarucenihVozila.dodajUListu(noviAutomobil);
                    break;
                case "motocikl": 
                    BusinessLogic.Motor noviMotor = new Motor(markaVozila, modelVozila);
                    noviMotor.setKubikaza(kubikaza);
                    noviMotor.setRegistracija(registarskaOznaka);
                    VlasnikVozila noviVlasnikMotora = new VlasnikVozila(ime, prezime, adresa);
                    noviMotor.setVlasnikVozila(noviVlasnikMotora);
                    res=listaNarucenihVozila.dodajUListu(noviMotor);
                    break;
                case "kamion": 
                    BusinessLogic.Kamion noviKamion = new Kamion(markaVozila, modelVozila);                        noviKamion.setKapacitet(kapacitet);
                    noviKamion.setImaPrikolicu(prikolica);
                    noviKamion.setBrojOsovina(brojOsovina);
                    noviKamion.setRegistracija(registarskaOznaka);
                    noviKamion.setSluzbenaOznaka(sluzbenaOznaka);
                    noviKamion.setFirma(firma);
                    VlasnikVozila noviVlasnikKamiona= new VlasnikVozila(ime, prezime, adresa);
                    noviKamion.setVlasnikVozila(noviVlasnikKamiona);
                    res=listaNarucenihVozila.dodajUListu(noviKamion);
                    break;
            }
        }
        catch(Exception ee)
        {
            res=false;
        }
        return res;
    }
}