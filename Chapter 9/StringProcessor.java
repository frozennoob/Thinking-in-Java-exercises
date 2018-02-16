import java.util.*;
public abstract class StringProcessor implements Processor {

	public String name() {
		return getClass().getSimpleName();
	}

	public abstract String process(Object input);
	public static String s = 
			"If she weights the same as a duck, she's made of wood";
	public static void start(){
		Apply.process(new Upcase(), s);
		Apply.process(new Downcase(), s);
		Apply.process(new Splitter(),s);
		Apply.process(new Swapper(), s);
		Apply.process(Upcase.factory, s);
	}

}

class Upcase extends StringProcessor{
	public String process(Object input){
		return ((String)input).toUpperCase();
	}
	public static StringProcessor factory = new StringProcessor(){
		public String process(final Object input){return ((String)input).toUpperCase();}

	};
}
class Downcase extends StringProcessor{
	public String process(Object input){
		return ((String)input).toLowerCase();
	}
}
class Splitter extends StringProcessor{
	public String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}
class Swapper extends StringProcessor{
	public String process(Object input){
		String msg = ((String)input);
		char [] msgCh = msg.toCharArray();
		char buf1, buf2;
		for (int i = 0; i < msgCh.length - 4; i += 4){
			buf1 = msgCh[i];
			buf2 = msgCh[i+1];
			msgCh[i] = msgCh[i+2];
			msgCh[i+1] = msgCh[i+3];
			msgCh[i+2] = buf1;
			msgCh[i+3] = buf2;
		}
		msg = "";
		for (int i = 0; i < msgCh.length; i ++)
			msg += Character.toString(msgCh[i]);
		return msg;
	}
}