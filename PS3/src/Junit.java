import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class Junit {

	Account a;
	
	@Before
	public void setUp() throws Exception {
		a = new Account(1122,20000);
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test(expected=InsufficientFundsException.class)
	public final void testwithdraw1() throws InsufficientFundsException {
		a.deposit(3000.00);
		assertEquals("$2500 Expected, actual is $3000",(long)a.getbalance(),(long)3000.00);
        a.withdraw(2500);
	}

	@Test
	public final void testdeposit() {
		a.deposit(3000.00);
	}

	

	@Test
	public final void testwithdraw() throws InsufficientFundsException {
		a.withdraw(2500.00); // TODO
	}

	@Test
	public final void testGetBalance() {
		a.getbalance(); // TODO
	}

	@Test
	public final void testgetid() {
		a.getid(); // TODO
	}



}
