package testModel;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Bezeroa;
import model.Sarrera;
import model.SarreraKudeatzailea;
import model.Zinema;
import model.ZinemaKudeatzailea;

public class SarreraKudeatzaileaTest {

	private static ArrayList<Sarrera> sarreraListProba;
	private static Bezeroa bezeroProba;
	
	private static SarreraKudeatzailea sarreraKudeatzaileaProba;
	private static SarreraKudeatzailea sarreraKudeatzaileaSetGetProba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sarreraListProba = new ArrayList<Sarrera>();
		
		sarreraKudeatzaileaProba = new SarreraKudeatzailea(sarreraListProba, 10.5, bezeroProba);
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
	
	

}
