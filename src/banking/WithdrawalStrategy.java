package banking;

public interface WithdrawalStrategy {
	boolean permitWithdrawal(long balance, long amount);
}
