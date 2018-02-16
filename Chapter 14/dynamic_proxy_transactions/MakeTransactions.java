package dynamic_proxy_transactions;

import java.lang.reflect.*;
import java.util.*;

public class MakeTransactions {

	public static void main(String[] args) {
		TransactionMaker tm = new TransactionMaker("Transact.txt");
		tm.save("Transaction 1");
		TransactionProxy tp = new TransactionProxy(new TransactionMaker("Transact.txt"));
		tp.save("Transact 2");
		tp.save("Transaction 3");
		Transaction proxy = (Transaction)Proxy.newProxyInstance(
				Transaction.class.getClassLoader(),
			      new Class[]{ Transaction.class },
			      new TransactionDynamicProxy(tm));
		proxy.save("Transaction 5");
	}

}
