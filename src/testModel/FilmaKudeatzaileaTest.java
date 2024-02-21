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

public class FilmaKudeatzaileaTest {
	private static Filma[] filmaListProba;
	
	private static FilmaKudeatzailea filmaKudeatzaileaProba;
	private static FilmaKudeatzailea filmaKudeatzaileaSetGetProba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		filmaKudeatzaileaProba = new FilmaKudeatzailea(filmaListProba);
		filmaKudeatzaileaSetGetProba = new FilmaKudeatzailea();
	}

	/*-----EQUALS TEST-----*/
	
	@Test
	public void karteldegiaEqualsTrueTest() {				
		FilmaKudeatzailea karteldegiaProbaEquals = new FilmaKudeatzailea(filmaListProba);
		assertTrue(filmaKudeatzaileaProba.equals(karteldegiaProbaEquals));
	}
	
	@Test
	public void karteldegiaEqualsPunteroTest() {	
		assertTrue(filmaKudeatzaileaProba.equals(filmaKudeatzaileaProba));
	}
	
	@Test
	public void karteldegiaEqualsNullTest() {			
		FilmaKudeatzailea karteldegiaProbaNull = null;
		assertFalse(filmaKudeatzaileaProba.equals(karteldegiaProbaNull));
	}
	
	@Test
	public void karteldegiaEqualsDifClassTest() {			
		String karteldegiaProbaDifClass = "";
		assertFalse(filmaKudeatzaileaProba.equals(karteldegiaProbaDifClass));
	}
	
	/*-----TOSTRING TEST-----*/
	
	@Test
	public void karteldegiaToStringTest() {
		String txt = "Karteldegia [filmaList=" + Arrays.toString(filmaListProba) + "]";
		assertEquals(filmaKudeatzaileaProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void karteldegiaFilmaListGetSetTest() {
		Filma[] karteldegiaFilmaListProba = new Filma[20];
		filmaKudeatzaileaSetGetProba.setFilmaList(karteldegiaFilmaListProba);
		assertArrayEquals(karteldegiaFilmaListProba, filmaKudeatzaileaSetGetProba.getFilmaList());
	}
}
