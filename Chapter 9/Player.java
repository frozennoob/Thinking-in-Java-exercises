
public class Player extends Controllable  {
	public void moveX(){}
	public void moveY(){}
	public void prepare(){}
	public void battle(){}
	public void kill(){}
	public void grave(){}
	public void live(){}
	void startmove(Move x){}
	void startFight(Fight x){}
	void startDie(Die x){}
	void startUnit(Unit x){}
	public static void start(){
		Player pl = new Player();
		pl.startmove(pl);
		pl.startFight(pl);
		pl.startDie(pl);
		pl.startUnit(pl);
	}
}

abstract class Controllable implements Unit {
	void control(){}
}

interface Move{
	void moveX();
	void moveY();
}

interface Fight{
	void prepare();
	void battle();
}

interface Die{
	void kill();
	void grave();
}

interface Unit extends Move, Fight, Die{
	void live();
}