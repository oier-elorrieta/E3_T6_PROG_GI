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
	
	private static Karteldegia karteldegiaProba;
	private static Karteldegia karteldegiaSetGetProba;
	private static Filma[] filmaProba;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		karteldegiaProba = new Karteldegia(filmaProba);
		karteldegiaSetGetProba = new Karteldegia(filmaProba);
	}

	@Test
	public void karteldegiaFilmaListGetSetTest() {
		Filma[] filmatest = new Filma[20];
		karteldegiaSetGetProba.setFilmaList(filmatest);
		assertArrayEquals(filmatest, karteldegiaSetGetProba.getFilmaList());
	}
	
	@Test
	public void karteldegiaEqualsTrueTest() {				
		Karteldegia karteldegiaProbaEquals = new Karteldegia(filmaProba);
		assertTrue(karteldegiaProba.equals(karteldegiaProbaEquals));
	}
	
	@Test
	public void karteldegiaEqualsPunteroTest() {	
		assertTrue(karteldegiaProba.equals(karteldegiaProba));
	}
	
	@Test
	public void karteldegiaEqualsNullTest() {			
		Karteldegia karteldegiaNullProba = null;
		assertFalse(karteldegiaProba.equals(karteldegiaNullProba));
	}
	
	@Test
	public void karteldegiaEqualsDifClassTest() {			
		String karteldegiaDifClassProba = "";
		assertFalse(karteldegiaProba.equals(karteldegiaDifClassProba));
	}
	
	@Test
	public void karteldegiaToStringTest() {
		String txt = "Karteldegia [filmaList=" + Arrays.toString(filmaProba) + "]";
		assertEquals(karteldegiaProba.toString(), txt);
	}
	

}
