package testModel;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Aretoa;
import model.Filma;
import model.FilmaKudeatzailea;
import model.Saioa;
import model.Zinema;

public class KarteldegiaTest {
	private static Filma[] filmaListProba;
	
	private static FilmaKudeatzailea karteldegiaProba;
	private static FilmaKudeatzailea karteldegiaSetGetProba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		karteldegiaProba = new FilmaKudeatzailea(filmaListProba);
		karteldegiaSetGetProba = new FilmaKudeatzailea(filmaListProba);
	}

	/*-----EQUALS TEST-----*/
	
	@Test
	public void karteldegiaEqualsTrueTest() {				
		FilmaKudeatzailea karteldegiaProbaEquals = new FilmaKudeatzailea(filmaListProba);
		assertTrue(karteldegiaProba.equals(karteldegiaProbaEquals));
	}
	
	@Test
	public void karteldegiaEqualsPunteroTest() {	
		assertTrue(karteldegiaProba.equals(karteldegiaProba));
	}
	
	@Test
	public void karteldegiaEqualsNullTest() {			
		FilmaKudeatzailea karteldegiaProbaNull = null;
		assertFalse(karteldegiaProba.equals(karteldegiaProbaNull));
	}
	
	@Test
	public void karteldegiaEqualsDifClassTest() {			
		String karteldegiaProbaDifClass = "";
		assertFalse(karteldegiaProba.equals(karteldegiaProbaDifClass));
	}
	
	/*-----TOSTRING TEST-----*/
	
	@Test
	public void karteldegiaToStringTest() {
		String txt = "Karteldegia [filmaList=" + Arrays.toString(filmaListProba) + "]";
		assertEquals(karteldegiaProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void karteldegiaFilmaListGetSetTest() {
		Filma[] karteldegiaFilmaListProba = new Filma[20];
		karteldegiaSetGetProba.setFilmaList(karteldegiaFilmaListProba);
		assertArrayEquals(karteldegiaFilmaListProba, karteldegiaSetGetProba.getFilmaList());
	}
}
