package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;
/**
 * Klasa predstavlja Vulkanizersku Radnju
 * @author Miro Maric
 * @version 1.1.0
 */
public class VulkanizerskaRadnja {
	/**
	 * Auto gume kao LinkedList kolekcija
	 * @see java.util.LinkedList
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda dodaje novu gumu u kolekciju gume
	 * @param a AutoGuma koja se ubacuje u kolekciju
	 * @throws java.lang.RuntimeException ako je nova guma null
	 * @throws java.lang.RuntimeException ako nova guma vec postoji
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Metoda koja vraca listu guma koje su date marke
	 * @param markaModel marka modela
	 * @return null ukoliko je uneta marka modela null ili
	 * listu auto guma koje su date marke
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
