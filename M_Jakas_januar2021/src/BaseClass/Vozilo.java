package BaseClass;
//import java.time.LocalDate;
import Enum.enTipVlasnistva;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m.jakas
 */
public abstract class Vozilo {
    //region VARIABLES
   // 
    private java.time.LocalDate GodinaProizvodnje;
    private int duzina;
    private double tezina;   
    private int brojSedista;
    private String markaVozila;
    private String tipVozila;
    private String zemljaPoreklaVozila;
    //private enTipVlasnistva TipVlasnistva;
    //endregion
    
    //region Constructor
    public void Vozilo()
    {
        
    }
    public void Vozilo(String Registracija, int Duzina,double Tezina,enTipVlasnistva TipVlasnistva)
    {
        //this.Registracija=Registracija;
        this.duzina=Duzina;
        this.tezina=Tezina;   
        //this.TipVlasnistva=TipVlasnistva;
    }
    //endregion
    //region GET/SET
//    public String getRegistracija() {
//        return Registracija;
//    }
//   
//    public void setRegistracija(String Registracija) {
//        this.Registracija = Registracija;
//    }
 
    public int getDuzina() {
        return duzina;
    }
    
    public void setDuzina(int Duzina) {
        this.duzina = Duzina;
    }
   
    public double getTezina() {
        return tezina;
    }
  
    public void setTezina(double Tezina) {
        this.tezina = Tezina;
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
     * @return the markaVozila
     */
    public String getMarkaVozila() {
        return markaVozila;
    }

    /**
     * @param markaVozila the markaVozila to set
     */
    public void setMarkaVozila(String markaVozila) {
        this.markaVozila = markaVozila;
        
          switch(markaVozila)
            {
                case "Audi": this.zemljaPoreklaVozila="Nemacka"; break;
                case "BMW": this.zemljaPoreklaVozila="Nemacka"; break;
                case "VW": this.zemljaPoreklaVozila="Nemacka"; break;
                case "Peugeot": this.zemljaPoreklaVozila="Fransuska"; break;
                case "Citroen": this.zemljaPoreklaVozila="Fransuska"; break;
                case "Renault": this.zemljaPoreklaVozila="Fransuska"; break;
                case "Seat": this.zemljaPoreklaVozila="Spanija"; break;
                case "AlfaRomeo": this.zemljaPoreklaVozila="Italija"; break;
                case "Fiat": this.zemljaPoreklaVozila="Italija"; break;
                case "Lamburgini": this.zemljaPoreklaVozila="Italija"; break;
                case "Ikarus": this.zemljaPoreklaVozila="Srbija"; break;
                case "Zastava": this.zemljaPoreklaVozila="Srbija"; break;
                case "Lada": this.zemljaPoreklaVozila="Rusija"; break;
                default: this.zemljaPoreklaVozila="Ostalo";

            }
    }

    /**
     * @return the tipVozila
     */
    public String getTipVozila() {
        return tipVozila;
    }

    /**
     * @param tipVozila the tipVozila to set
     */
    public void setTipVozila(String tipVozila) {
        this.tipVozila = tipVozila;
    }

    /**
     * @return the zemljaPoreklaVozila
     */
    public String getZemljaPoreklaVozila() {
        return zemljaPoreklaVozila;
    }

    /**
     * @param zemljaPoreklaVozila the zemljaPoreklaVozila to set
     */
    public void setZemljaPoreklaVozila(String zemljaPoreklaVozila) {
        this.zemljaPoreklaVozila = zemljaPoreklaVozila;
    }
  
}
