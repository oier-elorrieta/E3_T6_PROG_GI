package testModel;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Aretoa;
import model.Filma;
import model.Zinema;

public class FilmaTest {
	
	private static Filma filmaProba;
	private static Filma filmaSetGetProba;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		filmaProba = new Filma("IzenaProba", 10, 7.5, "GeneroProba");
		filmaSetGetProba = new Filma("IzenaProba", 10, 7.5, "GeneroProba");
	}
	
	@Test
	public void filmaIzenaTest() {
		filmaSetGetProba.setFilma_izena("FilmaIzenaProba");
		assertEquals("FilmaIzenaProba", filmaSetGetProba.getFilma_izena());
	}
	
	@Test
	public void filmaIraupenaTest() {
		filmaSetGetProba.setFilma_iraupena(100);
		assertEquals(100, filmaSetGetProba.getFilma_iraupena());
	}
	
	@Test
	public void filmaPrezoaTest() {
		filmaSetGetProba.setFilma_prezioa(3.5);
		assertEquals(3.5, filmaSetGetProba.getFilma_prezioa(),0);
	}
	
	@Test
	public void filmaGeneroTest() {
		filmaSetGetProba.setFilma_generoa("FilmaGeneroProba");
		assertEquals("FilmaGeneroProba", filmaSetGetProba.getFilma_generoa());
	}
	
	@Test
	public void filmaToStringTest() {
		String txt = "Filma [filma_izena=IzenaProba, filma_iraupena=10, filma_prezioa=7.5, filma_generoa=GeneroProba]";
		assertEquals(filmaProba.toString(), txt);
	}
	
	@Test
	public void filmaEqualsTrueTest() {				
		Filma filmaProbaEquals = new Filma("IzenaProba", 10, 7.5, "GeneroProba");
		assertTrue(filmaProba.equals(filmaProbaEquals));
	}
	
	@Test
	public void filmaEqualsPunteroTest() {	
		assertTrue(filmaProba.equals(filmaProba));
	}
	
	@Test
	public void filmaEqualsNullTest() {			
		Zinema filmaNullProba = null;
		assertFalse(filmaProba.equals(filmaNullProba));
	}
	
	@Test
	public void filmaEqualsDifClassTest() {			
		String filmaDifClassProba = "";
		assertFalse(filmaProba.equals(filmaDifClassProba));
	}
}
