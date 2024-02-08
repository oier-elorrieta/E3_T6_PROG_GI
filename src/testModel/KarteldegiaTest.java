package testModel;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Aretoa;
import model.Filma;
import model.Karteldegia;
import model.Saioa;
import model.Zinema;

public class KarteldegiaTest {
	private static Filma[] filmaListProba;
	
	private static Karteldegia karteldegiaProba;
	private static Karteldegia karteldegiaSetGetProba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		karteldegiaProba = new Karteldegia(filmaListProba);
		karteldegiaSetGetProba = new Karteldegia(filmaListProba);
	}

	/*-----EQUALS TEST-----*/
	
	@Test
	public void karteldegiaEqualsTrueTest() {				
		Karteldegia karteldegiaProbaEquals = new Karteldegia(filmaListProba);
		assertTrue(karteldegiaProba.equals(karteldegiaProbaEquals));
	}
	
	@Test
	public void karteldegiaEqualsPunteroTest() {	
		assertTrue(karteldegiaProba.equals(karteldegiaProba));
	}
	
	@Test
	public void karteldegiaEqualsNullTest() {			
		Karteldegia karteldegiaProbaNull = null;
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
