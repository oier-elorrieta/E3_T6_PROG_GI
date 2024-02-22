package testModel;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Aretoa;
import model.Bezeroa;
import model.Filma;
import model.Saioa;
import model.Sarrera;
import model.SarreraKudeatzailea;
import model.Zinema;
import model.ZinemaKudeatzailea;
import model.sql.KontsultakSQL;

public class SarreraKudeatzaileaTest {

	private static ArrayList<Sarrera> sarreraListProba;
	private static Bezeroa bezeroProba;
	
	private static SarreraKudeatzailea sarreraKudeatzaileaProba;
	private static SarreraKudeatzailea sarreraKudeatzaileaSetGetProba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sarreraListProba = new ArrayList<Sarrera>();
		
		sarreraKudeatzaileaProba = new SarreraKudeatzailea(sarreraListProba, 10.5, bezeroProba);
		sarreraKudeatzaileaSetGetProba = new SarreraKudeatzailea();
	}

	/*-----EQUALS TEST-----*/
	
	@Test
	public void sarreraKudatzaileaEqualsTrueTest() {				
		SarreraKudeatzailea sarreraKudatzaileaProbaEquals = new SarreraKudeatzailea(sarreraListProba, 10.5, bezeroProba);
		assertTrue(sarreraKudeatzaileaProba.equals(sarreraKudatzaileaProbaEquals));
	}
	
	@Test
	public void sarreraKudatzaileaEqualsPunteroTest() {	
		assertTrue(sarreraKudeatzaileaProba.equals(sarreraKudeatzaileaProba));
	}
	
	@Test
	public void sarreraKudatzaileaEqualsNullTest() {			
		SarreraKudeatzailea sarreraKudatzaileaProbaNull = null;
		assertFalse(sarreraKudeatzaileaProba.equals(sarreraKudatzaileaProbaNull));
	}
	
	@Test
	public void sarreraKudatzaileaEqualsDifClassTest() {			
		String sarreraKudatzaileaProbaDifClass = "";
		assertFalse(sarreraKudeatzaileaProba.equals(sarreraKudatzaileaProbaDifClass));
	}
	
/*-----TOSTRING TEST-----*/
	
	@Test
	public void sarreraKudeatzaileaToStringTest() {
		String txt = "Ticket [SarreraLista=" + sarreraListProba + ", ticket_prezioa=10.5, bezeroa=" + bezeroProba
				+ "]";
		assertEquals(sarreraKudeatzaileaProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void sarreraKudeatzaileaSarreraListGetSetTest() {
		ArrayList<Sarrera> sarreraKudeatzaileaListProba = new ArrayList<Sarrera>();
		sarreraKudeatzaileaSetGetProba.setSarreraLista(sarreraKudeatzaileaListProba);
		assertEquals(sarreraKudeatzaileaListProba, sarreraKudeatzaileaSetGetProba.getSarreraLista());		
	}
	
	@Test
	public void sarreraKudeatzaileaPrezioaGetSetTest() {
		sarreraKudeatzaileaSetGetProba.setTicket_prezioa(8.8);
		assertEquals(8.8, sarreraKudeatzaileaSetGetProba.getTicket_prezioa(),0);		
	}
	@Test
	public void sarreraKudeatzaileaBezeroaGetSetTest() {
		Bezeroa sarreraKudatzaileaBezeroaProba = new Bezeroa ("12345678A","izena","abizena","pasahitza",'E');
		sarreraKudeatzaileaSetGetProba.setBezeroa(sarreraKudatzaileaBezeroaProba);
		assertEquals(sarreraKudatzaileaBezeroaProba, sarreraKudeatzaileaSetGetProba.getBezeroa());		
	}
	
	/*-----METODOAK-----*/
	
	@Test
	public void kalkulatuPrezioaTest() {
		Date dateProba = new Date();
		Aretoa aretoaProba = new Aretoa();
		Filma filmaProba = new Filma();
		
		Saioa saioaProba = new Saioa(dateProba, aretoaProba, filmaProba, 10.0);		
		assertEquals(20, SarreraKudeatzailea.kalkulatuPrezioa(saioaProba,2), 0);
		
		
		
	}
}
