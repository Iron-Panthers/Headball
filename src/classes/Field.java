package classes;

import objects.Ball;
import objects.Goal;
import objects.Head;
import objects.Wall;

public class Field {
	double screenW;
	double screenH;
	public Wall wall;
	public Head head1;
	public Head head2;
	public Ball ball;
	public Goal goal1;
	public Goal goal2;
	public Field() {
		this.wall = new Wall(0,0,screenW,screenH);
		this.head1 = new Head();
		this.head2 = new Head();
		this.ball = new Ball();
		this.goal1 = new Goal();
		this.goal2 = new Goal();
	}
}
