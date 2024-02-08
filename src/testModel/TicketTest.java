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
	private static Bezeroa bezeroaProba;
	
	private static Ticket ticketProba;
	private static Ticket ticketSetGetProba;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		saioaProba = new ArrayList<Saioa>();
		pertsonaKantitateaProba = new ArrayList<Integer>();
		bezeroaProba = new Bezeroa();
		
		ticketProba = new Ticket(saioaProba,pertsonaKantitateaProba, 7.75, bezeroaProba);
		ticketSetGetProba = new Ticket(saioaProba,pertsonaKantitateaProba, 7.75, bezeroaProba);
	}

	/*-----EQUALS TEST-----*/
	
	@Test
	public void ticketEqualsTrueTest() {				
		Ticket ticketProbaEquals = new Ticket(saioaProba,pertsonaKantitateaProba, 7.75, bezeroaProba);
		assertTrue(ticketProba.equals(ticketProbaEquals));
	}
	
	@Test
	public void ticketEqualsPunteroTest() {	
		assertTrue(ticketProba.equals(ticketProba));
	}
	
	@Test
	public void ticketEqualsNullTest() {			
		Ticket ticketProbaNull = null;
		assertFalse(ticketProba.equals(ticketProbaNull));
	}
	
	@Test
	public void ticketEqualsDifClassTest() {			
		String ticketProbaDifClass = "";
		assertFalse(ticketProba.equals(ticketProbaDifClass));
	}
	
	/*-----TOSTRING TEST-----*/
	
	@Test
	public void zinemaToStringTest() {
		String txt = "Ticket [saioa=" + saioaProba + ", pertsonaKantitatea=" + pertsonaKantitateaProba + ", ticket_prezioa=7.75, bezeroa=" + bezeroaProba + "]";
		assertEquals(ticketProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
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
		Bezeroa ticketBezeroProba = new Bezeroa();
		ticketSetGetProba.setBezeroa(ticketBezeroProba);
		assertEquals(ticketBezeroProba, ticketSetGetProba.getBezeroa());
	}	
}

