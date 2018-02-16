
public abstract class Rodent {
	private Cell cell;
	protected void addCell(Cell cell){
		this.cell = cell;
		cell.addRef();
		}
	protected void finalize (){
		System.out.println("Finalize");
		cell.dispose();
	}
	RodentIncObj s = new RodentIncObj();
	public void msg(){System.out.println("I am Rodent");}
	Rodent(){
		System.out.println("Rodent Constructor");
		}
}
