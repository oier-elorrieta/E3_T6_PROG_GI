package testModel;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import model.*;

public class SarreraTest {
	
	private static Saioa saioaProba;
	
	private static Sarrera sarreraProba;
	private static Sarrera sarreraSetGetProba;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {		
		saioaProba = new Saioa();
		
		sarreraProba = new Sarrera(saioaProba, 2);
		sarreraSetGetProba = new Sarrera(saioaProba, 2);
	}
	
	/*-----EQUALS TEST-----*/
	
	@Test
	public void sarreraEqualsTrueTest() {				
		Sarrera sarreraProbaEquals = new Sarrera(saioaProba, 2);
		assertTrue(sarreraProba.equals(sarreraProbaEquals));
	}
	
	@Test
	public void sarreraEqualsPunteroTest() {	
		assertTrue(sarreraProba.equals(sarreraProba));
	}
	
	@Test
	public void sarreraEqualsNullTest() {			
		Ticket sarreraProbaNull = null;
		assertFalse(sarreraProba.equals(sarreraProbaNull));
	}
	
	@Test
	public void sarreraEqualsDifClassTest() {			
		String ticketProbaDifClass = "";
		assertFalse(sarreraProba.equals(ticketProbaDifClass));
	}

	/*-----TOSTRING TEST-----*/
	
	@Test
	public void sarreraToStringTest() {
		String txt = "Sarrera [saioa=" + saioaProba + ", pertsonaKopurua=2]";
		assertEquals(sarreraProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void sarreraSaioaGetSetTest() {
		Saioa sarreraSaioaProba = new Saioa();
		sarreraSetGetProba.setSaioa(sarreraSaioaProba);
		assertEquals(sarreraSaioaProba, sarreraSetGetProba.getSaioa());
	}
	
	@Test
	public void sarreraPertsonaKopuruaGetSetTest() {
		sarreraSetGetProba.setPertsonaKopurua(3);
		assertEquals(3, sarreraSetGetProba.getPertsonaKopurua());
	}
}
