import java.util.*;

public class Ex15 {
	public static void start(){
		String str = "";
		LinkedList<Character> stack = new LinkedList<Character>();
		stack.push('U');
		stack.push('n');
		stack.push('c');
		str = str + stack.pop();
		str = str + stack.pop();
		str = str + stack.pop();
		stack.push('e');
		stack.push('r');
		stack.push('t');
		str = str + stack.pop();
		str = str + stack.pop();
		str = str + stack.pop();
		stack.push('a');
		str = str + stack.pop();
		stack.push('i');
		str = str + stack.pop();
		stack.push('n');
		stack.push('t');
		stack.push('y');
		str = str + stack.pop();
		str = str + stack.pop();
		str = str + stack.pop();
		stack.push(' ');
		str = str + stack.pop();
		stack.push('r');
		stack.push('u');
		str = str + stack.pop();
		str = str + stack.pop();
		stack.push('l');
		stack.push('e');
		stack.push('s');
		str = str + stack.pop();
		str = str + stack.pop();
		str = str + stack.pop();
		System.out.println(str);
	}
}
