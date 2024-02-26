package testModel;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Bezeroa;
import model.Zinema;

public class BezeroaTest {
	
	private static Bezeroa bezeroaProba;
	private static Bezeroa bezeroaSetGetProba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bezeroaProba = new Bezeroa("12345678Z","IzenaProba","AbizenaProba", "PasahitzaProba", 'G');
		bezeroaSetGetProba = new Bezeroa();
	}
	
	/*-----EQUALS TEST-----*/
	
	@Test
	public void bezeroaEqualsTrueTest() {				
		Bezeroa bezeroaProbaEquals = new Bezeroa("12345678Z","IzenaProba","AbizenaProba", "PasahitzaProba", 'G');
		assertTrue(bezeroaProba.equals(bezeroaProbaEquals));
	}
	
	@Test
	public void bezeroaEqualsPunteroTest() {	
		assertTrue(bezeroaProba.equals(bezeroaProba));
	}
	
	@Test
	public void bezeroaEqualsNullTest() {			
		Bezeroa bezeroaProbaNull = null;
		assertFalse(bezeroaProba.equals(bezeroaProbaNull));
	}
	
	@Test
	public void bezeroaEqualsDifClassTest() {			
		String bezeroaProbaDifClass = "";
		assertFalse(bezeroaProba.equals(bezeroaProbaDifClass));
	}
	
	/*-----TOSTRING TEST-----*/
	
	@Test
	public void bezeroaToStringTest() {
		String txt = "Bezeroa [bezeroa_NAN=12345678Z, bezeroa_izena=IzenaProba, bezeroa_abizenak=AbizenaProba, bezeroa_pasahitza=PasahitzaProba, bezeroa_sexua=G]";
		assertEquals(bezeroaProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void bezeroaNanGetSet() {
		bezeroaSetGetProba.setBezeroa_NAN("87654321Z");
		assertEquals(bezeroaSetGetProba.getBezeroa_NAN(),"87654321Z");
	}
	
	@Test
	public void bezeroaIzenaGetSet() {
		bezeroaSetGetProba.setBezeroa_izena("IzenaProba");
		assertEquals(bezeroaSetGetProba.getBezeroa_izena(),"IzenaProba");
	}
	
	@Test
	public void bezeroaAbizenaGetSet() {
		bezeroaSetGetProba.setBezeroa_abizenak("AbizenaProba");
		assertEquals(bezeroaSetGetProba.getBezeroa_abizenak(),"AbizenaProba");
	}
	
	@Test
	public void bezeroaPasahitzaGetSet() {
		bezeroaSetGetProba.setBezeroa_pasahitza("PasahitzaProba");
		assertEquals(bezeroaSetGetProba.getBezeroa_pasahitza(),"PasahitzaProba");
	}
	
	@Test
	public void bezeroaSexuaGetSet() {
		bezeroaSetGetProba.setBezeroa_sexua('E');
		assertEquals(bezeroaSetGetProba.getBezeroa_sexua(),'E');
	}	
	
	/*-----METODOAK-----*/
	
	@Test
	public void nanKomprobatuTrueTest() {
		String nanKonprobatzailea = "93051298Z";
		assertTrue(Bezeroa.nanKomprobatu(nanKonprobatzailea));
	}
	
	@Test
	public void nanKomprobatuFalseTest() {
		String nanKonprobatzailea = "93151298Z";
		assertFalse(Bezeroa.nanKomprobatu(nanKonprobatzailea));
	}
	
	@Test
	public void nanKomprobatuErrorTest() {
		String nanKonprobatzailea = "3151298AZ";
		assertFalse(Bezeroa.nanKomprobatu(nanKonprobatzailea));
	}
}
