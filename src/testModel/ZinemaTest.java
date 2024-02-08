package testModel;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

import model.Aretoa;
import model.Saioa;
import model.Zinema;

public class ZinemaTest {
	
	private static Aretoa[] aretoakProba;
	private static Saioa[] saioakProba;
	
	private static Zinema zinemaProba;
	private static Zinema zinemaSetGetProba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		zinemaProba = new Zinema("IzenaProba","HelbideProba",123456789, aretoakProba, saioakProba);
		zinemaSetGetProba = new Zinema();
	}
	
	/*-----EQUALS TEST-----*/
	
	@Test
	public void zinemaEqualsTrueTest() {				
		Zinema zinemaProbaEquals = new Zinema("IzenaProba","HelbideProba",123456789, aretoakProba, saioakProba);
		assertTrue(zinemaProba.equals(zinemaProbaEquals));
	}
	
	@Test
	public void zinemaEqualsPunteroTest() {	
		assertTrue(zinemaProba.equals(zinemaProba));
	}
	
	@Test
	public void zinemaEqualsNullTest() {			
		Zinema zinemaProbaNull = null;
		assertFalse(zinemaProba.equals(zinemaProbaNull));
	}
	
	@Test
	public void zinemaEqualsDifClassTest() {			
		String zinemaProbaDifClass = "";
		assertFalse(zinemaProba.equals(zinemaProbaDifClass));
	}
	
	/*-----TOSTRING TEST-----*/
	
	@Test
	public void zinemaToStringTest() {
		String txt = "Zinema [zinema_izena=IzenaProba, zinema_helbidea=HelbideProba, zinema_telefonoa=123456789, zinema_aretoak=" + Arrays.toString(aretoakProba) + ", saioak="
				+ Arrays.toString(saioakProba) + "]";
		assertEquals(zinemaProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void zinemaIzenaGetSetTest() {
		zinemaSetGetProba.setZinema_izena("ZinemaIzenaProba");
		assertEquals("ZinemaIzenaProba", zinemaSetGetProba.getZinema_izena());
	}
	
	@Test
	public void zinemaHelbideaGetSetTest() {
		zinemaSetGetProba.setZinema_helbidea("ZinemaHelbideaProba");
		assertEquals("ZinemaHelbideaProba", zinemaSetGetProba.getZinema_helbidea());
	}
	
	@Test
	public void zinemaTelefonoaGetSetTest() {
		zinemaSetGetProba.setZinema_telefonoa(123456789);
		assertEquals(123456789, zinemaSetGetProba.getZinema_telefonoa());
	}
	
	@Test
	public void zinemaAretoaGetSetTest() {
		Aretoa[] zinemaAretoaProba = new Aretoa[20];
		zinemaSetGetProba.setZinema_aretoak(zinemaAretoaProba);
		assertArrayEquals(zinemaAretoaProba, zinemaSetGetProba.getZinema_aretoak());
	}
	
	@Test
	public void zinemaSaioaGetSetTest() {
		Saioa[] zinemaSaioaProba = new Saioa[20];
		zinemaSetGetProba.setSaioak(zinemaSaioaProba);
		assertArrayEquals(zinemaSaioaProba, zinemaSetGetProba.getSaioak());
	}	
}
