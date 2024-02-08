package testModel;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;


import model.*;

public class TicketTest {
	
	private static ArrayList<Sarrera> sarreraListaProba;
	private static Bezeroa bezeroaProba;
	
	private static Ticket ticketProba;
	private static Ticket ticketSetGetProba;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sarreraListaProba = new ArrayList<Sarrera>();
		bezeroaProba = new Bezeroa();
		
		ticketProba = new Ticket(sarreraListaProba, 7.75, bezeroaProba);
		ticketSetGetProba = new Ticket(sarreraListaProba, 7.75, bezeroaProba);
	}

	/*-----EQUALS TEST-----*/
	
	@Test
	public void ticketEqualsTrueTest() {				
		Ticket ticketProbaEquals = new Ticket(sarreraListaProba, 7.75, bezeroaProba);
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
	public void ticketToStringTest() {
		String txt = "Ticket [SarreraLista=" + sarreraListaProba + ", ticket_prezioa=7.75, bezeroa=" + bezeroaProba
				+ "]";
		assertEquals(ticketProba.toString(), txt);
	}
	
	/*-----GETTERS/SETTERS TEST-----*/
	
	@Test
	public void ticketSaioaGetSetTest() {
		ArrayList<Sarrera> ticketSarreraListProba = new ArrayList<Sarrera>();
		ticketSetGetProba.setSarreraLista(ticketSarreraListProba);
		assertEquals(ticketSarreraListProba, ticketSetGetProba.getSarreraLista());
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

