package testModel;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Aretoa;
import model.Zinema;

public class AretoaTest {

	private static Aretoa aretoaProba;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		aretoaProba = new Aretoa("IzenaProba");
	}

	@Test
	public void aretoaIzenaSetGetTest() {
		aretoaProba.setAreto_izena("AretoaIzenaProba");
		assertEquals("AretoaIzenaProba", aretoaProba.getAreto_izena());
	}
	
	@Test
	public void aretoaToStringTest() {
		String txt = "Aretoa [areto_izena=IzenaProba]";
		assertEquals(aretoaProba.toString(), txt);
	}
	
	@Test
	public void aretoaEqualsTrueTest() {
		Aretoa aretoProbaEquals = new Aretoa("IzenaProba");
		assertTrue(aretoaProba.equals(aretoProbaEquals));
	}
	
	@Test
	public void aretoaEqualsPunteroTest() {	
		assertTrue(aretoaProba.equals(aretoaProba));
	}
	
	@Test
	public void zinemaEqualsNullTest() {			
		Aretoa aretoaNullProba = null;
		assertFalse(aretoaProba.equals(aretoaNullProba));
	}
	
	@Test
	public void zinemaEqualsDifClassTest() {			
		String aretoaDifClassProba = "";
		assertFalse(aretoaProba.equals(aretoaDifClassProba));
	}
	
}
