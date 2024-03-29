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
		filmaProba = new Filma("IzenaProba","GeneroProba", 10);
		filmaSetGetProba = new Filma();
	}
	
	/*-----EQUALS TEST-----*/
	
	@Test
	public void filmaEqualsTrueTest() {				
		Filma filmaProbaEquals = new Filma("IzenaProba","GeneroProba", 10);
		assertTrue(filmaProba.equals(filmaProbaEquals));
	}
	
	@Test
	public void filmaEqualsPunteroTest() {	
		assertTrue(filmaProba.equals(filmaProba));
	}
	
	@Test
	public void filmaEqualsNullTest() {			
		Zinema filmaProbaNull = null;
		assertFalse(filmaProba.equals(filmaProbaNull));
	}
	
	@Test
	public void filmaEqualsDifClassTest() {			
		String filmaProbaDifClass = "";
		assertFalse(filmaProba.equals(filmaProbaDifClass));
	}
	
	/*-----TOSTRING TEST-----*/
	
	@Test
	public void filmaToStringTest() {
		String txt = "Filma [filma_izena=IzenaProba, filma_generoa=GeneroProba, filma_iraupena=10]";
		assertEquals(filmaProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void filmaIzenaTest() {
		filmaSetGetProba.setFilma_izena("FilmaIzenaProba");
		assertEquals("FilmaIzenaProba", filmaSetGetProba.getFilma_izena());
	}
	
	@Test
	public void filmaGeneroTest() {
		filmaSetGetProba.setFilma_generoa("FilmaGeneroProba");
		assertEquals("FilmaGeneroProba", filmaSetGetProba.getFilma_generoa());
	}
	
	@Test
	public void filmaIraupenaTest() {
		filmaSetGetProba.setFilma_iraupena(100);
		assertEquals(100, filmaSetGetProba.getFilma_iraupena());
	}
}
