package gume.radnja;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {

	private VulkanizerskaRadnja vulkanizerskaRadnja;
	
	@Before
	public void setUp() throws Exception {
		vulkanizerskaRadnja = new VulkanizerskaRadnja();
	}

	@After
	public void tearDown() throws Exception {
		vulkanizerskaRadnja = null;
	}

	@Test
	public void testDodajGumu() {
		
	}

	@Test
	public void testPronadjiGumu() {
		AutoGuma guma = new AutoGuma();
		guma.setMarkaModel("GoodYear");
		guma.setPrecnik(20);
		guma.setSirina(200);
		guma.setVisina(50);
		vulkanizerskaRadnja.dodajGumu(guma);
		List<AutoGuma> gume = vulkanizerskaRadnja.pronadjiGumu(guma.getMarkaModel());
		assertEquals(gume.get(0), guma);
	}
	
	@Test
	public void testPronadjiGumuNull() {
		List<AutoGuma> gume = vulkanizerskaRadnja.pronadjiGumu(null);
		assertNull(gume);	
	}
	
	@Test
	public void testPronadjiGumuEmpty() {
		AutoGuma guma1 = new AutoGuma();
		guma1.setMarkaModel("GoodYear");
		guma1.setPrecnik(20);
		guma1.setSirina(200);
		guma1.setVisina(50);
		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Tigar");
		guma2.setPrecnik(19);
		guma2.setSirina(210);
		guma2.setVisina(60);
		List<AutoGuma> gume = vulkanizerskaRadnja.pronadjiGumu("gy");
		assertTrue(gume.isEmpty());
	}

}
