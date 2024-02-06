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
		zinemaProba = new Zinema("IzenaProba","HelbideProba","TelProba", aretoakProba, saioakProba);
		zinemaSetGetProba = new Zinema("IzenaProba","HelbideProba","TelProba", aretoakProba, saioakProba);
	}
	
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
	public void zinemaTelGetSetTest() {
		zinemaSetGetProba.setZinema_telefonoa("ZinemaTelProba");
		assertEquals("ZinemaTelProba", zinemaSetGetProba.getZinema_telefonoa());
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
	
	@Test
	public void zinemaEqualsTrueTest() {				
		Zinema zinemaProbaEquals = new Zinema("IzenaProba","HelbideProba","TelProba", aretoakProba, saioakProba);
		assertTrue(zinemaProba.equals(zinemaProbaEquals));
	}
	
	@Test
	public void zinemaEqualsPunteroTest() {	
		assertTrue(zinemaProba.equals(zinemaProba));
	}
	
	@Test
	public void zinemaEqualsNullTest() {			
		Zinema zinemaNullProba = null;
		assertFalse(zinemaProba.equals(zinemaNullProba));
	}
	
	@Test
	public void zinemaEqualsDifClassTest() {			
		String zinemaDifClassProba = "";
		assertFalse(zinemaProba.equals(zinemaDifClassProba));
	}
	
	@Test
	public void zinemaToStringTest() {
		String txt = "Zinema [zinema_izena=IzenaProba, zinema_helbidea=HelbideProba, zinema_telefonoa=TelProba, zinema_aretoak=" + Arrays.toString(aretoakProba) + ", saioak="
				+ Arrays.toString(saioakProba) + "]";
		assertEquals(zinemaProba.toString(), txt);
	}
	
	
}
