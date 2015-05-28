package tests;

import org.junit.Assert;
import org.junit.Test;

import banking.Account;
import banking.CheckingWithdrawalStrategy;
import banking.MortgageWithdrawalStrategy;

public class TestAccounts {
	private Account acc = new Account(0, null);
	{
		System.out.println("Creating TestAccounts instance, acc.id is " + acc.getAccountId());
	}
	
	@Test
	public void testCannotWithdrawFromAMortgage() {
		Account a = new Account(1000, new MortgageWithdrawalStrategy());
		long withdrawnAmount = a.withdraw(10);
		Assert.assertEquals("Withdrawal from any mortgage should always fail", 0, withdrawnAmount);
	}
	
	@Test
	public void testCanBorrowFromAnOverdraftEnabledCheckingAccount() {
		final long ONE_HUNDRED = 100;
		Account a = new Account(0, new CheckingWithdrawalStrategy(-1000));
		long withdrawnAmount = a.withdraw(ONE_HUNDRED);
		Assert.assertEquals("Withdrawal within overdraft should succeed", ONE_HUNDRED, withdrawnAmount);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNonPositiveWithdrawalThrowsException(){
		boolean exceptionWorked = false;
		try {
			// blah
		} catch (Exception e) {
			exceptionWorked = true;
		}
		Assert.assertTrue(exceptionWorked);
		new Account(1000, new CheckingWithdrawalStrategy(0)).withdraw(0);
	}

}
