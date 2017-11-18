package objects;

import classes.Object;
import main.Main;

public class Feet extends Object {
	public Feet(double x, double y, double w, double h) {
		super(1000000000, 0, 0, 0, 0, x, y, w, h);
	}
	public void followhead(Object head) {
		xPosition = head.xPosition;
		yPosition = head.yPosition;
	}
	public void kick() {
	}
}
