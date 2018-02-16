import java.util.*;

public class Ex21 {
	public static <T> void start(){
		System.out.println("-----Ex21------");
		ClassTypeCapture<Building> ctt1 =
			      new ClassTypeCapture<Building>(Building.class);
	    System.out.println(ctt1.f(new Building()));
	    System.out.println(ctt1.f(new House()));
	    ClassTypeCapture<House> ctt2 =
	      new ClassTypeCapture<House>(House.class);
	    System.out.println(ctt2.f(new Building()));
	    System.out.println(ctt2.f(new House()));
	    ClassTypeCapture<Building> ctt3 = ClassTypeCapture.createNew("Building");
	    System.out.println(ctt3.f(new Building()));
	    	System.out.println(ClassTypeCapture.map);	
	    System.out.println("-----Ex21 finish------");
	}
}
class Building {}
class House extends Building {}

class ClassTypeCapture<T> {
  Class<T> kind;
  public static Map<String, Class<?>> map = 
		  new HashMap<String, Class<?>>();
  public ClassTypeCapture(Class<T> kind) {
    this.kind = kind;
  }
  public boolean f(Object arg) {
    return kind.isInstance(arg);
  }	
  public void addType(String typename, Class<?> kind){
	  map.put(typename, kind);
  }
  public static ClassTypeCapture createNew(String typename){
	 try{
		 map.put(typename,Class.forName(typename));
		 return new ClassTypeCapture(Class.forName(typename));
	 } catch (Exception e){
		 e.printStackTrace(System.err);
	 }
	 return null;
  }
}