package testModel;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import model.BezeroKudeatzailea;
import model.Bezeroa;
import model.Zinema;
import model.ZinemaKudeatzailea;
import model.sql.ConexioaSQL;
import model.sql.KontsultakSQL;

public class BezeroKudeatzaileaTest {
	private static ArrayList<Bezeroa> bezeroaListProba;
	
	private static BezeroKudeatzailea bezeroKudeatzaileaProba;
	private static BezeroKudeatzailea bezeroKudeatzaileaSetGetProba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bezeroKudeatzaileaProba = new BezeroKudeatzailea(bezeroaListProba);
		bezeroKudeatzaileaSetGetProba = new BezeroKudeatzailea(bezeroaListProba);
		ConexioaSQL.datuakKargatu();
	}
	
/*-----EQUALS TEST-----*/
	
	@Test
	public void bezeroKudatzaileaEqualsTrueTest() {				
		BezeroKudeatzailea bezeroKudatzaileaProbaEquals = new BezeroKudeatzailea(bezeroaListProba);
		assertTrue(bezeroKudeatzaileaProba.equals(bezeroKudatzaileaProbaEquals));
	}
	
	@Test
	public void bezeroKudatzaileaEqualsPunteroTest() {	
		assertTrue(bezeroKudeatzaileaProba.equals(bezeroKudeatzaileaProba));
	}
	
	@Test
	public void bezeroKudatzaileaEqualsNullTest() {			
		BezeroKudeatzailea bezeroKudatzaileaProbaNull = null;
		assertFalse(bezeroKudeatzaileaProba.equals(bezeroKudatzaileaProbaNull));
	}
	
	@Test
	public void bezeroKudatzaileaEqualsDifClassTest() {			
		String bezeroKudatzaileaProbaDifClass = "";
		assertFalse(bezeroKudeatzaileaProba.equals(bezeroKudatzaileaProbaDifClass));
	}
	
/*-----TOSTRING TEST-----*/
	
	@Test
	public void bezeroKudeatzaileaToStringTest() {
		String txt = "BezeroKudeatzailea [bezeroaList=" + bezeroaListProba + "]";
		assertEquals(bezeroKudeatzaileaProba.toString(), txt);
	}
	
/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void bezeroKudeatzaileaGetSetTest() {
		ArrayList<Bezeroa> bezeroKudeatzaileaListProba = new ArrayList<Bezeroa>();
		bezeroKudeatzaileaSetGetProba.setBezeroaList(bezeroKudeatzaileaListProba);
		assertEquals(bezeroKudeatzaileaListProba, bezeroKudeatzaileaSetGetProba.getBezeroaList());
	}
	
	/*-----METODOAK-----*/
	
	@Test
	public void bezeroaOndoTest() {
		assertTrue(BezeroKudeatzailea.komprobatuPasahitza("12345678Z", "markel"));
	}
	
	@Test
	public void bezeroaNanTxartoTest() {
		assertFalse(BezeroKudeatzailea.komprobatuPasahitza("12345678I", "markel"));
	}
	
	@Test
	public void bezeroaPwdTxartoTest() {
		assertFalse(BezeroKudeatzailea.komprobatuPasahitza("12345678Z", "magkel"));
	}
	
}
