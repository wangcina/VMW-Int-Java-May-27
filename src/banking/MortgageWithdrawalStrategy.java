package banking;

public class MortgageWithdrawalStrategy implements WithdrawalStrategy {

	@Override
	public boolean permitWithdrawal(long balance, long amount) {
		return false;
	}

}
