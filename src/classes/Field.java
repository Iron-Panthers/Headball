package classes;

import objects.Wall;

public class Field {
	double screenW;
	double screenH;
	public Wall wall;
	public Object head2;
	public Object ball;
	public Field() {
		this.wall = new Wall(0,0,0,0);
	}
}
