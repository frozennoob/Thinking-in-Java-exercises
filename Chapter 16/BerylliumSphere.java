
public class BerylliumSphere implements Comparable{
	  private static long counter;
	  private final long id = counter++;
	  public long GetId(){
		  return id;
	  }
	  public String toString() { return "Sphere " + id; }
	@Override
	public int compareTo(Object o) {
		if ( id > (((BerylliumSphere)o).GetId()))
			return 1;
		if ( id == (((BerylliumSphere)o).GetId()))
			return 0;
		return -1;
	}
}
