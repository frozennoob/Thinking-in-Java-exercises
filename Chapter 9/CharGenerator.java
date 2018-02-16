import java.nio.*;
import java.util.*;


public class CharGenerator {
	private static Random rand = new Random(47);
	public char next(){return (char)(rand.nextInt(100));}
	public static void start(){
		Scanner s = new Scanner(new AdaptedCharGenerator(10));
		while (s.hasNext())
			System.out.print(s.next() + " ");
	}
}

class AdaptedCharGenerator extends CharGenerator 
	implements Readable{
	private int count;
	public AdaptedCharGenerator(int count){
		this.count = count;
	}
	public int read(CharBuffer cb){
		if (count-- == 0)
			return -1;
		String result = Character.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
}