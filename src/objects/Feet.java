package objects;

import classes.Object;

public class Feet extends Object {
	public Feet(double x, double y, double w, double h) {
		super(1000000000, 0, 0, 0, 0, x, y, w, h);
	}
	public void followhead(Head head) {
		xPosition = head.movedx;
		yPosition = head.movedy;
	}
	public void kick() {
	}
}
