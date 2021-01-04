package BusinessLogic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Interfaces.IRegistracija;
import Interfaces.ISluzbenoVozilo;

/**
 *
 * @author m.jakas
 */
public class Kamion extends Vozilo implements ISluzbenoVozilo, IRegistracija{
    //region Promenjive
    private int kapacitet;
    private boolean imaPrikolicu;
    private int brojOsovina;

    private String firma;
     private String sluzbenaOznaka;
    //endregion
    
    //region Konstruktor
    public Kamion()
    {
       
    }
    public Kamion(String MarkaVozila,String modelVozila) {
        super.setMarkaVozila(MarkaVozila);
        super.setModelVozila(modelVozila);
    }
    //endregion
    /**
     * @return the kapacitet
     */
    public int getKapacitet() {
        return kapacitet;
    }

    /**
     * @param kapacitet the kapacitet to set
     */
    public void setKapacitet(int kapacitet) {
        this.kapacitet = kapacitet;
    }

    /**
     * @return the imaPrikolikcu
     */
    public boolean getImaPrikolicu() {
        return imaPrikolicu;
    }

    /**
     * @param imaPrikolikcu the imaPrikolikcu to set
     */
    public void setImaPrikolicu(boolean imaPrikolikcu) {
        this.imaPrikolicu = imaPrikolikcu;
    }

    /**
     * @return the brojOsovina
     */
    public int getBrojOsovina() {
        return brojOsovina;
    }

    /**
     * @param brojOsovina the brojOsovina to set
     */
    public void setBrojOsovina(int brojOsovina) {
        this.brojOsovina = brojOsovina;
    }
   
   //region Implementacija Interfejsa


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
        super.setRegistracionaOznaka(Registracija);
    }

////ISluzbenoVozilo
    
    @Override
	public String getFirma(){
		return this.firma;
	}

    @Override
	public String getSluzbenaOznaka(){
		return this.sluzbenaOznaka;
	}

	/**
	 * 
	 * @param firma    firma
	 */
    @Override
	public void setFirma(String firma){
             this.firma=firma;
	}

	/**
	 * 
	 * @param sluzbenaOznaka    sluzbenaOznaka
	 */
    @Override
	public void setSluzbenaOznaka(String sluzbenaOznaka){
           this.sluzbenaOznaka=sluzbenaOznaka;
	}



}
