package Ex_22;

public class GreenHC extends GreenHouseControls {
	private boolean orangewater = false;
	public class OrangeWaterOn extends Event{
		public OrangeWaterOn(long delayTime) { super(delayTime);}
		public void action(){
			orangewater = true;
		}
		public String toString() {return "Увлажнение оранжереи включено";}
	}
	public class OrangeWaterOff extends Event{
		public OrangeWaterOff(long delayTime) { super(delayTime);}
		public void action(){
			orangewater = false;
		}
		public String toString() {return "Увлажнение оранжереи выключено";}
	}
}
