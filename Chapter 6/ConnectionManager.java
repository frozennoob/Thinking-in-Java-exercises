
public class ConnectionManager {
	private static int i = 0;
	private static Connection[] conn = new Connection[10];
	private ConnectionManager(){}
	public static Connection newConnection(){
		if (i >= 10) return null;
		conn[i] = Connection.newConn();
		i++;
		return conn[i-1];
	}
	
}

class Connection{
	private Connection(){}
	public static Connection newConn(){
		return new Connection();
	}
	
}