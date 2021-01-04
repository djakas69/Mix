package Interfaces;

/**
 * @author m.jakas
 * @version 1.0
 * @created 04-Jan-2021 01:29:32
 */
public interface ISluzbenoVozilo {

	public String getFirma();

	public String getSluzbenaOznaka();

	/**
	 * 
	 * @param firma    firma
	 */
	public void setFirma(String firma);

	/**
	 * 
	 * @param sluzbenaOznaka    sluzbenaOznaka
	 */
	public void setSluzbenaOznaka(String sluzbenaOznaka);

}