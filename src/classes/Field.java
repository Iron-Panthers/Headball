package classes;

import objects.Ball;
import objects.Head;
import objects.Wall;

public class Field {
	double screenW;
	double screenH;
	public Wall wall;
	public Head head1;
	public Head head2;
	public Ball ball;
	public Field() {
		this.wall = new Wall(0,0,0,0);
		this.head1 = new Head();
		this.head2 = new Head();
	}
}
