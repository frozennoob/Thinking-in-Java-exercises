import java.util.*;

public class Ex27 {
	public static void start(){
		CommandLine cl = new CommandLine();
		cl.commandLine();
	}
}

class Command{
	private final String name;
	Command(String n){
		name = n;
	}
	public String operation(){
		return name;
	}
	
}
class CommandLine{
	private Queue<Command> list = new LinkedList<Command>();
	public void commandLine(){
		for (int i = 0; i < 10; i++)
			list.offer(new Command("Command " + i));
		for (Command i : list)
			System.out.print(i.operation() + " ");
		System.out.println();
		CommandPrint.print(list);
	}
}
class CommandPrint{
	public static void print(Queue<Command> q){
		while(!q.isEmpty())
			System.out.print(q.remove().operation() + " ");
	}
}