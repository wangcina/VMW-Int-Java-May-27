package banking;

public class CheckingWithdrawalStrategy implements WithdrawalStrategy {
	private long overdraftLimit;
	
	public CheckingWithdrawalStrategy(long overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public boolean permitWithdrawal(long balance, long amount) {
		return balance - amount >= overdraftLimit;
	}

}
