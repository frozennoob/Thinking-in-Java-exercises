
public class Starship {
	private AlertStatus alertStatus = new GreenAlert();
	public void changeRed(){alertStatus = new RedAlert();}
	public void changeYellow(){alertStatus = new YellowAlert();}
	public void alertInfo(){alertStatus.alert();}
	public static void start(){
		Starship ship = new Starship();
		ship.alertInfo();
		ship.changeRed();
		ship.alertInfo();
		ship.changeYellow();
		ship.alertInfo();
	}
}
class AlertStatus{
	public void alert(){}
}
class GreenAlert extends AlertStatus{
	public void alert(){System.out.println("Alert status is Green");}
}
class RedAlert extends AlertStatus{
	public void alert(){System.out.println("Alert status is Red");}
}
class YellowAlert extends AlertStatus{
	public void alert(){System.out.println("Alert status is Yellow");}
}