/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import Interfaces.IRegistracija;

/**
 *
 * @author m.jakas
 */
public class Motor extends Vozilo implements IRegistracija  {
     //region Promenjive
    
    private int kubikaza;
   
    public Motor()
    {
       
    }
    public Motor(String MarkaVozila,String modelVozila) {
        super.setMarkaVozila(MarkaVozila);
        super.setModelVozila(modelVozila);
    }
    //endregion
    
    
    public void setKubikaza(int kubikaza)
    {
        this.kubikaza=kubikaza;
    }
    public int getKubikaza()
    {
        return this.kubikaza;
    }
    /**
     * @return the RegistracionaOznaka
     */
    public String getRegistracija() {
        return super.getRegistracionaOznaka();
    }

    /**
     * @param Registracija the RegistracionaOznaka to set
     */
    public void setRegistracija(String Registracija) {
        //da bi baznoj klasi dodeli vrednost ne mozemo sa =
        //nego se koristi set metoda pa je nova vrednost parametar set metode
        //setRegistracionaOznaka
        super.setRegistracionaOznaka(Registracija);
        
    }


    
}
