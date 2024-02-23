package testModel;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Filma;
import model.FilmaKudeatzailea;
import model.Zinema;
import model.ZinemaKudeatzailea;
import model.sql.KontsultakSQL;

public class ZinemaKudeatzaileaTest {
	private static Zinema[] zinemaListProba;
	
	private static ZinemaKudeatzailea zinemaKudeatzaileaProba;
	private static ZinemaKudeatzailea zinemaKudeatzaileaSetGetProba;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		zinemaKudeatzaileaProba = new ZinemaKudeatzailea(zinemaListProba);
		zinemaKudeatzaileaSetGetProba = new ZinemaKudeatzailea(zinemaListProba);
	}
	
	/*-----EQUALS TEST-----*/
	
	@Test
	public void zinemaKudatzaileaEqualsTrueTest() {				
		ZinemaKudeatzailea zinemaKudatzaileaProbaEquals = new ZinemaKudeatzailea(zinemaListProba);
		assertTrue(zinemaKudeatzaileaProba.equals(zinemaKudatzaileaProbaEquals));
	}
	
	@Test
	public void zinemaKudatzaileaEqualsPunteroTest() {	
		assertTrue(zinemaKudeatzaileaProba.equals(zinemaKudeatzaileaProba));
	}
	
	@Test
	public void zinemaKudatzaileaEqualsNullTest() {			
		ZinemaKudeatzailea zinemaKudatzaileaProbaNull = null;
		assertFalse(zinemaKudeatzaileaProba.equals(zinemaKudatzaileaProbaNull));
	}
	
	@Test
	public void zinemaKudatzaileaEqualsDifClassTest() {			
		String zinemaKudatzaileaProbaDifClass = "";
		assertFalse(zinemaKudeatzaileaProba.equals(zinemaKudatzaileaProbaDifClass));
	}
	
	/*-----TOSTRING TEST-----*/
	
	@Test
	public void zinemaKudeatzaileaToStringTest() {
		String txt = "ZinemaKudeatzailea [zinemaList=" + Arrays.toString(zinemaListProba) + "]";
		assertEquals(zinemaKudeatzaileaProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void zinemaKudeatzaileaGetSetTest() {
		Zinema[] zinemaKudeatzaileaListProba = new Zinema[KontsultakSQL.kont_zinemak];
		zinemaKudeatzaileaSetGetProba.setZinemaList(zinemaKudeatzaileaListProba);
		assertArrayEquals(zinemaKudeatzaileaListProba, zinemaKudeatzaileaSetGetProba.getZinemaList());
	}
	
	
}
