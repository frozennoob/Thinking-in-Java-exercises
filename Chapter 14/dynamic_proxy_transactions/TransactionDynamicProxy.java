package dynamic_proxy_transactions;

import java.lang.reflect.*;
import java.util.regex.*;

public class TransactionDynamicProxy implements InvocationHandler {
	private Object proxied;
	public TransactionDynamicProxy(Object proxied) {
		this.proxied = proxied;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (check((String)args[0]))
			return method.invoke(proxied, args);	
		return null;
	}
	private boolean check(String transact) {
		Pattern p = Pattern.compile("Transaction\\s\\d+.*");
		Matcher m = p.matcher(transact);
		return m.matches();
	}
}
