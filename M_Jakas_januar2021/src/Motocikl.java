/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m.jakas
 */
public class Motocikl implements Vozilo,TipVozila {
    private String mRegistracija;
    private int mDuzina;
    private double mTezina;
    private String mTipVozila;
    
    public void Motocikl()
    {
     
    }
    public void Motocikl(String Registracija)
    {
       
    }

    @Override
    public void Registracija(String Registracija) {
        this.mRegistracija =Registracija;
    }

    @Override
    public void Duzina(int pDuzina) {
        this.mDuzina=pDuzina;
    }

    //@Override
    public void Tezina(double TezinaVozila) {
        this.mTezina= TezinaVozila;
    }

    @Override
    public void SetTipVozila(String TipVozila) {
        mTipVozila= TipVozila;
    }

}
