import java.util.*;
import static net.mindview.util.Print.*;
import net.mindview.simple.*;
import static debugoff.Dbg.*;
import access.*;
import ch6.Ch62;
import ch6.Chap6;

public class Ch6 {

	public static void main(String[] args) {
		Chap6 ch = new Chap6();
		Vector v = new Vector();
		v.clear();
		java.util.Vector v1 = new java.util.Vector();
		debug("Debugging mode");
		Ch62.ch62print();
		Widget wdg = new Widget();
		for (int i = 0; i < 12; i++)
			System.out.println(ConnectionManager.newConnection());
			
	}

}
