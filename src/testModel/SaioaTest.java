package testModel;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import model.*
;
public class SaioaTest {
	
	private static Date dataGetSetProba;
	private static Filma filmaProba;
	private static Saioa saioaProba;
	private static Saioa saioaSetGetProba;
	private static Aretoa aretoaProba;
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		filmaProba = new Filma();
		saioaSetGetProba = new Saioa();
		dataGetSetProba = new Date();
		aretoaProba = new Aretoa();
		saioaProba = new Saioa(dataGetSetProba, filmaProba, aretoaProba, 7.65);
	}

	@Test
	public void saioaDataGetSetTest() {
		saioaSetGetProba.setData(dataGetSetProba);
		assertEquals(dataGetSetProba,saioaSetGetProba.getData());
	}

	@Test
	public void saioaFilmaGetSetTest() {
		Filma filmaProba = new Filma();
		saioaSetGetProba.setFilma(filmaProba);
		assertEquals(filmaProba, saioaSetGetProba.getFilma());
	}
	
	@Test
	public void saioaGetSetTest() {
		Aretoa aretoProba = new Aretoa();
		saioaSetGetProba.setAretoa(aretoProba);
		assertEquals(aretoProba, saioaSetGetProba.getAretoa());
	}
	
	@Test
	public void saioaFilma_PrezioaGetSetTest() {
		saioaSetGetProba.setFilma_prezioa(6.50);
		assertEquals(6.50, saioaSetGetProba.getFilma_prezioa(), 0.00);
	}
	
	@Test
	public void saioaEqualsTrueTest() {				
		Saioa saioaProbaEquals = new Saioa(dataGetSetProba, filmaProba, aretoaProba, 7.65);
		assertTrue(saioaProba.equals(saioaProbaEquals));
	}
	
	@Test
	public void saioaEqualsPunteroTest() {	
		assertTrue(saioaProba.equals(saioaProba));
	}
	
	@Test
	public void saioaEqualsNullTest() {			
		Saioa saioaNullProba = null;
		assertFalse(saioaProba.equals(saioaNullProba));
	}
	
	@Test
	public void saioaEqualsDifClassTest() {			
		String saioaDifClassProba = "";
		assertFalse(saioaProba.equals(saioaDifClassProba));
	}
	
	@Test
	public void saioaToStringTest() {
		String txt = "Saioa [data=" + dataGetSetProba + ", filma=" + filmaProba + ", aretoa=" + aretoaProba + ", filma_prezioa=7.65]";
		assertEquals(saioaProba.toString(), txt);
	}
}