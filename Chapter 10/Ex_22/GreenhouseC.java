package Ex_22;

import Ex_22.GreenHouseControls.Bell;

public class GreenhouseC {

	public static void main(String[] args) {
		GreenHC gc = new GreenHC();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
				gc.new OrangeWaterOn(500),
				gc.new OrangeWaterOff(1000)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		gc.run();
	}

}
