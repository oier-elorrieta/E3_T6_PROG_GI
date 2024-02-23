package testModel;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import model.*;
import model.metodoak.View_metodoak;
import model.sql.ConexioaSQL;

public class View_metodoakTest {
	
	private static Date dataProba;
	private static Saioa saioaTest;
	private static Filma filmaProba;
	private static Saioa[] saioaListaProba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ConexioaSQL.datuakKargatu();
		dataProba = new Date(2024, 1, 20, 20, 0, 0);
		saioaTest = new Saioa();
		saioaTest.setData(dataProba);
		filmaProba = new Filma("El Padrino", "Drama", 210);
		saioaTest.setFilma(filmaProba);
		saioaListaProba = new Saioa[2];
		saioaListaProba[0] = saioaTest;
		saioaListaProba[1] = saioaTest;
	}

	@Test
	public void dataKonprobatuTestTrue() {
		Date dataKonprobatu = new Date(2024, 1, 20, 10, 0, 0);
		SesioAldagaiak.dataAukeratuta = dataKonprobatu;
		assertTrue(View_metodoak.dataKonprobatu(saioaTest));
	}
	
	@Test
	public void dataKonprobatuTestFalse() {
		Date dataKonprobatuFalse = new Date(2024, 1, 21, 10, 0, 0);
		SesioAldagaiak.dataAukeratuta = dataKonprobatuFalse;
		assertFalse(View_metodoak.dataKonprobatu(saioaTest));
	}
	
	@Test
	public void filmakAteraTest() {	
		Date dataKonprobatu = new Date(2024, 1, 20, 10, 0, 0);
		SesioAldagaiak.dataAukeratuta = dataKonprobatu;
		ArrayList<Integer> karteldegiPosTest = new ArrayList<Integer>();
		karteldegiPosTest.add(0);
		
		assertEquals(karteldegiPosTest, View_metodoak.filmakAtera(saioaListaProba));
	}
	
	@Test
	public void saioakAteraTest() {
		Date dataKonprobatu = new Date(2024, 1, 20, 10, 0, 0);
		SesioAldagaiak.dataAukeratuta = dataKonprobatu;
		ArrayList<Saioa> saioaListTest = new ArrayList<Saioa>();
		saioaListTest.add(saioaTest);
		assertEquals(saioaListTest,View_metodoak.saioakAtera(saioaListaProba, filmaProba));
		
	}

}