package testModel;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import model.*;
import model.metodoak.View_metodoak;

public class View_metodoakTest {
	
	private static Date dataProba;
	private static Saioa saioaTest;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dataProba = new Date(2024, 1, 20, 20, 0, 0);
		saioaTest = new Saioa();
		saioaTest.setData(dataProba);
	}

	@Test
	public void dataKonprobatuTestTrue() {
		Date dataKonprobatu = new Date(2024, 1, 20, 10, 0, 0);
		SesioAldagaiak.dataAukeratuta = dataKonprobatu;
		assertTrue(View_metodoak.dataKonprobatu(saioaTest));
	}
	@Test
	public void dataKonprobatuTestFalse() {
		Date dataKonprobatu = new Date(2024, 1, 21, 10, 0, 0);
		SesioAldagaiak.dataAukeratuta = dataKonprobatu;
		assertFalse(View_metodoak.dataKonprobatu(saioaTest));
	}

}
