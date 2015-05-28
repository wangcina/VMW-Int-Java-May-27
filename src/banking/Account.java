package banking;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class Account {
	private static final Logger log = Logger.getLogger("banking.Account");
	private static AtomicInteger nextAccountId = new AtomicInteger();
	
	private int accountId = nextAccountId.getAndIncrement();
	private long balance;
	private WithdrawalStrategy withdrawalStrategy;
	
	public Account(long initialBalance, WithdrawalStrategy withdrawalStrategy) {
		this.balance = initialBalance;
		this.withdrawalStrategy = withdrawalStrategy;
	}
	
	public void setWithdrawalStrategy(WithdrawalStrategy withdrawalStrategy) {
		this.withdrawalStrategy = withdrawalStrategy;
	}
	
	public long withdraw(long amount) {
		if (withdrawalStrategy.permitWithdrawal(balance, amount)) {
			log.info("A/C id " + accountId + " balance " + balance + " Withdrawing " + amount);
			balance -= amount;
		} else {
			log.info("A/C id " + accountId + " balance " + balance + " Withdrawal of " + amount + " refused");
			amount = 0;
		}
		return amount;
	}
}
