package gume;
/**
 * Klasa predstavlja automobilsku gumu
 * @author MiroMaric
 * @version 1.0.0
 */
public class AutoGuma {
	
	/**
	 * Marka modela gume kao String
	 */
	private String markaModel = null;
	
	/**
	 * Precnik gume kao int
	 */
	private int precnik = 0;
	
	/**
	 * Sirina gume kao int
	 */
	private int sirina = 0;
	
	/**
	 * Visina gume kao int
	 */
	private int visina = 0;
	
	/**
	 * Metoda vraca marku modela gume
	 * @return marka modela kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Metoda postavlja novu marku modela
	 * @param markaModel nova vrednost za marku modela
	 * @throws java.lang.RuntimeException ako je nova
	 * marka modela null ili ima manje od 3 karaktera 
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Metoda vraca precnik gume
	 * @return precnik gume kao int
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Metoda postavlja novi precnik gume
	 * @param precnik nova vrednost za precnik gume
	 * @throws java.lang.RuntimeException ako je novi
	 * precnik gume manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Metoda vraca sirinu gume
	 * @return sirina gume kao int
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Metoda postavlja novu sirinu gume
	 * @param sirina nova sirina gume
	 * @throws java.lang.RuntimeException ako je nova
	 * sirina gume manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Metoda vraca visinu gume
	 * @return visina gume kao int
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Metoda postavlja novu visinu gume
	 * @param visina nova visina gume
	 * @throws java.lang.RuntimeException ako je nova
	 * visina gume manje od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Metoda opisuje objekat tipa AutoGuma
	 * @return reprezentacija objekta kao String
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Metoda koja poredi dve auto gume po svim parametrima
	 * @return true ako postoji poklpanje svih parametara
	 * ili false u suprotnom
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}