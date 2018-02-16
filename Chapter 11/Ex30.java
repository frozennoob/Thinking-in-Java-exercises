import java.util.*;

public class Ex30 {
	public static void start(){
		CollectionSequence c = new CollectionSequence();
		display(c);
		display(c.iterator());
		NonCollectionSequence nc = new NonCollectionSequence();
		display(nc.iterator());
		for(Pet p: nc.reversed())
			System.out.print(p.name + ", ");
		System.out.println();
		for(Pet p: nc.randomized())
			System.out.print(p.name + ", ");
	}
	public static void display(Collection<Pet>pets){
		for (Pet p: pets)
			System.out.print(p.name + ", ");
	}
	public static void display (Iterator <Pet> it){
		while (it.hasNext()){
			Pet p = it.next();
			System.out.print(p.name + ", ");
		}
		System.out.println();
	}
	
}

class CollectionSequence
	extends AbstractCollection<Pet>{
	private Pet[] pets = {new Pet("Gus"), new Pet("Jus"), 
			new Pet("Dog"), new Pet("Chimera")};
	public int size() { return pets.length;}
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>(){
			private int index = 0;
			public boolean hasNext(){
				return index < pets.length;
			}
			public Pet next() { return pets[index++];}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
}
class NonCollectionSequence extends PetSequence implements Iterable{
	public Iterator<Pet> iterator(){
		return new Iterator<Pet>(){
			private int index = 0;
			public boolean hasNext(){
				return index < pets.length;
			}
			public Pet next() { return pets[index++];}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	public Iterable<Pet> reversed(){
		return new Iterable<Pet>(){
			public Iterator<Pet> iterator(){
				return new Iterator<Pet>(){
					int current = pets.length - 1;
					public boolean hasNext() { return current > -1;}
					public Pet next() { return pets[current--];}
					public void remove(){
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	public Iterable<Pet> randomized(){
		return new Iterable<Pet>(){
			public Iterator<Pet> iterator(){
				List<Pet> shuffled = 
						new ArrayList<Pet>(Arrays.asList(pets));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
}
class PetSequence{
	protected Pet[] pets = {new Pet("Gus"), new Pet("Jus"), 
			new Pet("Dog"), new Pet("Chimera")};
}
class Pet{
	public final String name;
	Pet(String n){name = n;}
}

















