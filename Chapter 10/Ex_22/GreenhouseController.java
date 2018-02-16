package Ex_22;

public class GreenhouseController {

	public static void main(String[] args) {
		GreenHouseControls gc = new GreenHouseControls();
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
				gc.new ThermostatNight(0),
				gc.new LightOn(200),
				gc.new LightOff(400),
				gc.new WaterOn(600),
				gc.new ThermostatDay(1400),
				gc.new WindsOrangeOn(1200),
				gc.new WindsOrangeOff(800)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		if (args.length == 1)
			gc.addEvent(
					new GreenHouseControls.Terminate(
							new Integer(args[0])));
		gc.run();
	}

}
