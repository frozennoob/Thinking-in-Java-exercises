
public class Rodents {
	private static RandomRodentGenerator gen = 
			new RandomRodentGenerator();
	private static Cell cell = new Cell();
	public static void start(){
		Rodent[] s = new Rodent[9];
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next();
		for (int i = 0; i < s.length; i++)
			s[i].addCell(cell);
		for (Rodent shp : s)
			shp.msg();
		for (int i = 0; i < s.length; i++)
			s[i].finalize();
	
	}
}