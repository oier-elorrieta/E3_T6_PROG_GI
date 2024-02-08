package testModel;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Aretoa;
import model.Zinema;

public class AretoaTest {

	private static Aretoa aretoaProba;
	private static Aretoa aretoaSetGetProba;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		aretoaProba = new Aretoa("IzenaProba");
		aretoaSetGetProba = new Aretoa();
	}
	
	/*-----EQUALS TEST-----*/
	
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
	public void aretoaEqualsNullTest() {			
		Aretoa aretoaProbaNull = null;
		assertFalse(aretoaProba.equals(aretoaProbaNull));
	}
	
	@Test
	public void aretoaEqualsDifClassTest() {			
		String aretoaProbaDifClass = "";
		assertFalse(aretoaProba.equals(aretoaProbaDifClass));
	}
	
	/*-----TOSTRING TEST-----*/
	
	@Test
	public void aretoaToStringTest() {
		String txt = "Aretoa [areto_izena=IzenaProba]";
		assertEquals(aretoaProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void aretoaIzenaSetGetTest() {
		aretoaSetGetProba.setAreto_izena("AretoaIzenaProba");
		assertEquals("AretoaIzenaProba", aretoaSetGetProba.getAreto_izena());
	}	
}
