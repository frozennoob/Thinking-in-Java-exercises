package dynamic_proxy_transactions;

import java.util.regex.*;

public class TransactionProxy implements Transaction {
	Transaction tm;
	TransactionProxy(Transaction t){tm = t;}
	private boolean check(String transact) {
		Pattern p = Pattern.compile("Transaction\\s\\d+.*");
		Matcher m = p.matcher(transact);
		return m.matches();
	}

	public void save(String transact) {
		if (check(transact))
			tm.save(transact);
	}

}
