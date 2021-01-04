package BusinessLogic;

/**
 *
 * @author m.jakas
 */
public class VlasnikVozila {
    private String ime;   
    private String prezime;   
    private String adresa;
    
     public VlasnikVozila() {
     
    }
    public VlasnikVozila(String Ime, String Prezime, String Adresa) {
        this.ime= Ime;
        this.prezime = Prezime;
        this.adresa = Adresa;
    }
    public String getVlaskinVozila() {
        return ime + " " + prezime;
    }

    public String getVlasnikVozilaSaAdresom() {
        String res=ime;
        res = res + " " + prezime;
        res = res + ", " + adresa;
        return res;
    }
   
    public void setVlaskikVozilaSaAdresom(String Ime, String Prezime, String Adresa) {
        this.ime= Ime;
        this.prezime = Prezime;
        this.adresa = Adresa;
    }
    public void setVlaskikVozila(String Ime, String Prezime) {
        this.ime= Ime;
        this.prezime = Prezime;
    }
}
