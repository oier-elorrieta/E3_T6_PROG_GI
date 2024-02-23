package testModel;
import static org.junit.Assert.*;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import model.*
;
public class SaioaTest {
	private static final long ONE_MINUTE_IN_MILLIS = 60000;
	
	private static Date dataProba;
	private static Aretoa aretoaProba;
	private static Filma filmaProba;
	
	private static Saioa saioaProba;
	private static Saioa saioaSetGetProba;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dataProba = new Date(2024, 1, 20, 10, 0, 0);
		aretoaProba = new Aretoa();
		filmaProba = new Filma();
		
		saioaProba = new Saioa(dataProba, aretoaProba, filmaProba, 7.75);
		saioaSetGetProba = new Saioa();
	}

	/*-----EQUALS TEST-----*/
	
	@Test
	public void saioaEqualsTrueTest() {				
		Saioa saioaProbaEquals = new Saioa(dataProba, aretoaProba, filmaProba, 7.75);
		assertTrue(saioaProba.equals(saioaProbaEquals));
	}
	
	@Test
	public void saioaEqualsPunteroTest() {	
		assertTrue(saioaProba.equals(saioaProba));
	}
	
	@Test
	public void saioaEqualsNullTest() {			
		Saioa saioaProbaNull = null;
		assertFalse(saioaProba.equals(saioaProbaNull));
	}
	
	@Test
	public void saioaEqualsDifClassTest() {			
		String saioaProbaDifClass = "";
		assertFalse(saioaProba.equals(saioaProbaDifClass));
	}
	
	/*-----TOSTRING TEST-----*/
	
	@Test
	public void saioaToStringTest() {
		String txt = "Saioa [data=" + dataProba + ", aretoa=" + aretoaProba + ", filma=" + filmaProba + ", filma_prezioa=" + 7.75
				+ "]";
		assertEquals(saioaProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void saioaDataGetSetTest() {
		saioaSetGetProba.setData(dataProba);
		assertEquals(dataProba,saioaSetGetProba.getData());
	}

	@Test
	public void saioaAretoaGetSetTest() {
		Aretoa saioaAretoaProba = new Aretoa();
		saioaSetGetProba.setAretoa(saioaAretoaProba);
		assertEquals(saioaAretoaProba, saioaSetGetProba.getAretoa());
	}
	
	@Test
	public void saioaFilmaGetSetTest() {
		Filma saioaFilmaProba = new Filma();
		saioaSetGetProba.setFilma(saioaFilmaProba);
		assertEquals(saioaFilmaProba, saioaSetGetProba.getFilma());
	}
	
	
	
	@Test
	public void saioaPrezioaGetSetTest() {
		saioaSetGetProba.setPrezioa(6.50);
		assertEquals(6.50, saioaSetGetProba.getPrezioa(), 0.00);
	}
	
	/*-----METODOAK-----*/
	
	@Test
	public void	stringToDateTest() {
		String date = "2024-02-20-10-00";
		long dif = Math.abs(saioaProba.stringToDate(date).getTime() - saioaProba.getData().getTime());
		assertTrue(dif < ONE_MINUTE_IN_MILLIS);
	}	
}