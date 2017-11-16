package classes;

import objects.Ball;
import objects.Goal;
import objects.Head;
import objects.Wall;

public class Field {
	double screenW = Constants.ScreenW;
	double screenH = Constants.ScreenH;
	public Wall wall1;
	public Wall wall2;
	public Wall roof;
	public Wall floor;
	public Head head1;
	public Head head2;
	public Ball ball;
	public Goal goal1;
	public Goal goal2;
	public Score score1;
	public Score score2;
	public Field() {
		wall1 = new Wall(0,0,0,0);
		wall2 = new Wall(0,0, 0,0);
		floor = new Wall(0,0,0,0);
		roof = new Wall(0,0,0,0);
		head1 = new Head();
		head2 = new Head();
		ball = new Ball();
		goal1 = new Goal();
		goal2 = new Goal();
		score1 = new Score();
		score2 = new Score();
	}
}
