package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutoGumaTest {

	private AutoGuma guma;
	
	@Before
	public void setUp() throws Exception {
		guma = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		guma = null;
	}

	@Test
	public void testSetMarkaModel() {
		guma.setMarkaModel("GoodYear");
		assertEquals("GoodYear", guma.getMarkaModel());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		guma.setMarkaModel(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKratakNaziv() {
		guma.setMarkaModel("gy");
	}
	
	@Test
	public void testSetPrecnik() {
		guma.setPrecnik(20);
		assertEquals(20, guma.getPrecnik());
	}
	
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetPrecnikMaliPrecnik() {
		guma.setPrecnik(10);
	}
	
	@Test(expected=java.lang.RuntimeException.class)
	public void testSetPrecnikVelikiPrecnik() {
		guma.setPrecnik(25);
	}

	@Test
	public void testSetSirina() {
		guma.setSirina(200);
		assertEquals(200, guma.getSirina());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaMalaSirina() {
		guma.setSirina(134);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVelikaSirina() {
		guma.setSirina(356);
	}

	@Test
	public void testSetVisina() {
		guma.setVisina(50);
		assertEquals(50, guma.getVisina());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaMalaVisina() {
		guma.setVisina(24);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVelikaVisina() {
		guma.setVisina(96);
	}
	
	@Test
	public void testToString() {
		guma.setMarkaModel("GoodYear");
		guma.setPrecnik(20);
		guma.setSirina(200);
		guma.setVisina(50);
		String result = "AutoGuma [markaModel=GoodYear, precnik=20, sirina=200, visina=50]";
		assertEquals(result, guma.toString());
	}

	@Test
	public void testEqualsObjectTrue() {
		guma.setMarkaModel("GoodYear");
		guma.setPrecnik(20);
		guma.setSirina(200);
		guma.setVisina(50);
		AutoGuma novaGuma = new AutoGuma();
		novaGuma.setMarkaModel("GoodYear");
		novaGuma.setPrecnik(20);
		novaGuma.setSirina(200);
		novaGuma.setVisina(50);
		assertTrue(guma.equals(novaGuma));
	}
	
	@Test
	public void testEqualsObjectFalse() {
		guma.setMarkaModel("GoodYear");
		guma.setPrecnik(20);
		guma.setSirina(200);
		guma.setVisina(50);
		AutoGuma novaGuma = new AutoGuma();
		novaGuma.setMarkaModel("GoodYear");
		novaGuma.setPrecnik(20);
		novaGuma.setSirina(195);
		novaGuma.setVisina(50);
		assertFalse(guma.equals(novaGuma));
	}

}
