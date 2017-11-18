package classes;

import objects.Ball;
import objects.Goal;
import objects.Head;
import objects.Player;
import objects.Wall;

public class Field {
	double screenW = Constants.ScreenW;
	double screenH = Constants.ScreenH;
	public Wall wall1;
	public Wall wall2;
	public Wall roof;
	public Wall floor;
	public Player p2;
	public Player p1;
	public Ball ball;
	public Wall goal1;
	public Wall goal2;
	public Score score1;
	public Score score2;
	public Field() {
		wall1 = new Wall(0,0,0,0);
		wall2 = new Wall(0,0, 0,0);
		floor = new Wall(0,0,0,0);
		roof = new Wall(0,0,0,0);
		p1 = new Player();
		p2 = new Player();
		ball = new Ball();
		goal1 = new Wall();
		goal2 = new Wall();
		score1 = new Score();
		score2 = new Score();
	}
}
