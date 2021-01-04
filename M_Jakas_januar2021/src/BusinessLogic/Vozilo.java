package BusinessLogic;


/**
 *
 * @author m.jakas
 * koristimo abstract da zabranimo instanciranje ove klase
 * posto je ovoosnovna klasa  sluzi za nasledjivanje
 * Klase Automobil,Motor i Kamion se nasledjuju od ove klase 
 * Enum EN_TipVlasnistva cuva u sebi moguce vrednosti za tip vlasnistva
 * Privatno,Sluzbeno, Vojno, JavniPrevoz  
 */
public abstract class Vozilo {
    //region VARIABLES
   // 
    private String registracionaOznaka;             //BG-258OL
    private java.time.LocalDate godinaProizvodnje;  //30.12.2007
    private String markaVozila;                     //Skoda
    private String modelVozila;                       //Fabia II
	/**
	 * Ceska
	 */
    private String zemljaPoreklaVozila;             //Ceska
      // IVlasnikVozila
    private VlasnikVozila vlasnikVozila;
    //endregion
    
    //region Constructor
    public void Vozilo()
    {
        
    }
    public void Vozilo(String registracionaOznaka)
    {
        this.registracionaOznaka=registracionaOznaka;
        
    }
    //endregion


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
                case "Skoda": this.zemljaPoreklaVozila="Ceska"; break;
                default: this.zemljaPoreklaVozila="Ostalo";

            }
    }

    /**
     * @return the tipVozila
     */
    public String getModelVozila() {
        return modelVozila;
    }

    /**
     * @param tipVozila the tipVozila to set
     */
    public void setModelVozila(String tipVozila) {
        this.modelVozila = tipVozila;
    }

    /**
     * @return the zemljaPoreklaVozila
     */
    public String getZemljaPoreklaVozila() {
        return zemljaPoreklaVozila;
    }

//    /**
//     * @param zemljaPoreklaVozila the zemljaPoreklaVozila to set
//     */
//    public void setZemljaPoreklaVozila(String zemljaPoreklaVozila) {
//        this.zemljaPoreklaVozila = zemljaPoreklaVozila;
//    }

    /**
     * @return the registracionaOznaka
     */
    public String getRegistracionaOznaka() {
        return registracionaOznaka;
    }

    /**
     * @param registracionaOznaka the registracionaOznaka to set
     */
    public void setRegistracionaOznaka(String registracionaOznaka) {
        //set metoda je zastina mera da se nebi podatak menjao direktno iz objekta
        //ovde moze da se uradi backup podatka pre promene, da se upise u Log ko menja i sta menja
        //i samo ako prodje validaciju da tek onda i promeni vrednost
        this.registracionaOznaka = registracionaOznaka;
    }

    /**
     * @return the GodinaProizvodnje
     */
    public java.time.LocalDate getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    /**
     * @param GodinaProizvodnje the GodinaProizvodnje to set
     */
    public void setGodinaProizvodnje(java.time.LocalDate GodinaProizvodnje) {
        this.godinaProizvodnje = GodinaProizvodnje;
    }

    /**
     * @return the vlasnikVozila
     */
    public VlasnikVozila getVlasnikVozila() {
        return vlasnikVozila;
    }

    /**
     * @param vlasnikVozila the vlasnikVozila to set
     */
    public void setVlasnikVozila(VlasnikVozila vlasnikVozila) {
        this.vlasnikVozila = vlasnikVozila;
    }
  
}
