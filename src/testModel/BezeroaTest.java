package testModel;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Bezeroa;
import model.Zinema;

public class BezeroaTest {
	
	private static Bezeroa bezeroProba;
	private static Bezeroa bezeroProbaSetGet;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bezeroProba = new Bezeroa("12345678Z","izena","abizena", "1234", 'G');
		bezeroProbaSetGet = new Bezeroa("12345678Z","izena","abizena", "1234", 'G');
	}
	
	@Test
	public void bezeroaNanGetSet() {
		bezeroProbaSetGet.setBezeroa_NAN("87654321Z");
		assertEquals(bezeroProbaSetGet.getBezeroa_NAN(),"87654321Z");
	}
	@Test
	public void bezeroaIzenaGetSet() {
		bezeroProbaSetGet.setBezeroa_izena("izena1");
		assertEquals(bezeroProbaSetGet.getBezeroa_izena(),"izena1");
	}
	@Test
	public void bezeroaAbizenaGetSet() {
		bezeroProbaSetGet.setBezeroa_abizenak("abizena1");
		assertEquals(bezeroProbaSetGet.getBezeroa_abizenak(),"abizena1");
	}
	@Test
	public void bezeroaPasahitzaGetSet() {
		bezeroProbaSetGet.setBezeroa_pasahitza("pwd");
		assertEquals(bezeroProbaSetGet.getBezeroa_pasahitza(),"pwd");
	}
	@Test
	public void bezeroaSexuaGetSet() {
		bezeroProbaSetGet.setBezeroa_sexua('E');
		assertEquals(bezeroProbaSetGet.getBezeroa_sexua(),'E');
	}
	@Test
	public void bezeroaEqualsTrueTest() {				
		Bezeroa bezeroaProbaEquals = new Bezeroa("12345678Z","izena","abizena", "1234", 'G');
		assertTrue(bezeroProba.equals(bezeroaProbaEquals));
	}
	@Test
	public void bezeroaEqualsPunteroTest() {	
		assertTrue(bezeroProba.equals(bezeroProba));
	}
	@Test
	public void bezeroaEqualsNullTest() {			
		Bezeroa bezeroaNullProba = null;
		assertFalse(bezeroProba.equals(bezeroaNullProba));
	}
	@Test
	public void bezeroaEqualsDifClassTest() {			
		String bezeroaDifClassProba = "";
		assertFalse(bezeroProba.equals(bezeroaDifClassProba));
	}
	@Test
	public void zinemaToStringTest() {
		String txt = "Bezeroa [bezeroa_NAN=12345678Z, bezeroa_izena=izena, bezeroa_abizenak=abizena, bezeroa_pasahitza=1234, bezeroa_sexua=G]";
		assertEquals(bezeroProba.toString(), txt);
	}
}
