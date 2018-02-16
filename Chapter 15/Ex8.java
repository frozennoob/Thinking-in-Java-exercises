import java.util.*;

public class Ex8 {
	public static void start(){
		StoryCharactersGenerator gen = new StoryCharactersGenerator();
		for (int i = 0; i < 5; i ++)
			System.out.println(gen.next());
		for (StoryCharacters c : new StoryCharactersGenerator(5))
			System.out.println(c);
	}
}

class StoryCharactersGenerator 
implements Generator<StoryCharacters>, Iterable<StoryCharacters>{
	private Class[] types = {Garosh.class, Silvana.class, Voljin.class, 
			Anduin.class, Varian.class, Tyrande.class};
	private static Random rand = new Random(47);
	public StoryCharactersGenerator (){}
	private int size = 0;
	public StoryCharactersGenerator(int sz) { size = sz;}
	public StoryCharacters next(){
		try{
			return (StoryCharacters)
					types[rand.nextInt(types.length)].newInstance();
		} catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	class StoryCharactersIterator implements Iterator<StoryCharacters>{
		int count = size;
		public boolean hasNext() { return count > 0;}
		public StoryCharacters next() {
			count--;
			return StoryCharactersGenerator.this.next();
		}
		public void remove(){
			throw new UnsupportedOperationException();
		}
	};
	public Iterator<StoryCharacters> iterator(){
		return new StoryCharactersIterator();
	}
	
}
class StoryCharacters {
	private static long counter = 0;
	private final long id = counter++;
	public String toString(){
		return getClass().getSimpleName() + " " + id;
	}
}

class GoodGuys extends StoryCharacters{}
class BadGuys extends StoryCharacters{}
class Garosh extends BadGuys{}
class Silvana extends BadGuys{}
class Voljin extends BadGuys{}
class Anduin extends GoodGuys{}
class Varian extends GoodGuys{}
class Tyrande extends GoodGuys{}