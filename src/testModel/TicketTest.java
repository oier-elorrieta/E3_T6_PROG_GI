package testModel;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;


import model.*;

public class TicketTest {
	private static ArrayList<Saioa> saioaProba;
	private static ArrayList<Integer> pertsonaKantitateaProba;
	private static Bezeroa bezeroProba;
	private static Ticket ticketSetGetProba;
	private static Ticket ticketProba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		saioaProba = new ArrayList<Saioa>();
		pertsonaKantitateaProba = new ArrayList<Integer>();
		bezeroProba = new Bezeroa();
		ticketProba = new Ticket(saioaProba,pertsonaKantitateaProba, 7.75, bezeroProba);
		ticketSetGetProba = new Ticket(saioaProba,pertsonaKantitateaProba, 7.75, bezeroProba);
	}

	@Test
	public void ticketSaioaGetSetTest() {
		ArrayList<Saioa> ticketSaioProba = new ArrayList<Saioa>();
		ticketSetGetProba.setSaioa(ticketSaioProba);
		assertEquals(ticketSaioProba, ticketSetGetProba.getSaioa());
	}
	
	@Test
	public void ticketPertsonaKantitateaGetSetTest() {
		ArrayList<Integer> ticketPertsonaKantitateaProba = new ArrayList<Integer>();
		ticketSetGetProba.setPertsonaKantitatea(ticketPertsonaKantitateaProba);
		assertEquals(ticketPertsonaKantitateaProba, ticketSetGetProba.getPertsonaKantitatea());
	}
	
	@Test
	public void ticketPrezioaGetSetTest() {
		ticketSetGetProba.setTicket_prezioa(6.50);
		assertEquals(6.50, ticketSetGetProba.getTicket_prezioa(), 0.00);
	}

	@Test
	public void ticketBezeroaGetSetTest() {
		Bezeroa bezeroP = new Bezeroa();
		ticketSetGetProba.setBezeroa(bezeroP);
		assertEquals(bezeroP, ticketSetGetProba.getBezeroa());
	}
	
	@Test
	public void ticketEqualsTrueTest() {				
		Ticket ticketProbaEquals = new Ticket(saioaProba,pertsonaKantitateaProba, 7.75, bezeroProba);
		assertTrue(ticketProba.equals(ticketProbaEquals));
	}
	
	@Test
	public void ticketEqualsPunteroTest() {	
		assertTrue(ticketProba.equals(ticketProba));
	}
	
	@Test
	public void ticketEqualsNullTest() {			
		Ticket ticketNullProba = null;
		assertFalse(ticketProba.equals(ticketNullProba));
	}
	
	@Test
	public void ticketEqualsDifClassTest() {			
		String ticketDifClassProba = "";
		assertFalse(ticketProba.equals(ticketDifClassProba));
	}
	
	@Test
	public void zinemaToStringTest() {
		String txt = "Ticket [saioa=" + saioaProba + ", ticket_prezioa=7.75, bezeroa=" + bezeroProba
				+ ", pertsonaKantitatea=" + pertsonaKantitateaProba + "]";
		assertEquals(ticketProba.toString(), txt);
	}
}

