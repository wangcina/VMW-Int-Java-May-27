package banking;

public class TestAccounts {

	public static void main(String[] args) {
		Account a = new Account(1000, new CheckingWithdrawalStrategy(0));
		
		a.withdraw(800);
		a.withdraw(300);
		
		System.out.println("Granting $1,000 overdraft");
		a.setWithdrawalStrategy(new CheckingWithdrawalStrategy(-1_000));
		a.withdraw(300);
		
		Account m = new Account(-200_000, new MortgageWithdrawalStrategy());
		m.withdraw(0);
		m.setWithdrawalStrategy(new CheckingWithdrawalStrategy(-1_000_000));
		m.withdraw(1_000);
	}

}
