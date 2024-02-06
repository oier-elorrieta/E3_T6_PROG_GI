package testModel;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;


import model.*;

public class TicketTest {
	
	private static Ticket ticketSetGetProba;
	private static Ticket ticketProba;
	private static Bezeroa bezeroProba;
	private static ArrayList<Saioa> saioaProba;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bezeroProba = new Bezeroa();
		saioaProba = new ArrayList<Saioa>();
		ticketProba = new Ticket(saioaProba, 7.65, bezeroProba);
		ticketSetGetProba = new Ticket(saioaProba, 7.75, bezeroProba);
	}

	@Test
	public void ticketSaioaGetSetTest() {
		ArrayList<Saioa> saioP = new ArrayList<Saioa>();
		ticketSetGetProba.setSaioa(saioP);
		assertEquals(saioP, ticketSetGetProba.getSaioa());
	}
	
	@Test
	public void ticketPrezioaGetSetTest() {
		ticketSetGetProba.setTicket_prezioa(6.00);
		assertEquals(6.00, ticketSetGetProba.getTicket_prezioa(), 0.00);
	}

	@Test
	public void ticketBezeroaGetSetTest() {
		Bezeroa bezeroP = new Bezeroa();
		ticketSetGetProba.setBezeroa(bezeroP);
		assertEquals(bezeroP, ticketSetGetProba.getBezeroa());
	}
	
	@Test
	public void ticketEqualsTrueTest() {				
		Ticket ticketProbaEquals = new Ticket(saioaProba, 7.75, bezeroProba);
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
		String txt = "Ticket [saioa=" + saioaProba + ", ticket_prezioa=7.65, bezeroa=" + bezeroProba + "]";
		assertEquals(ticketProba.toString(), txt);
	}
}

