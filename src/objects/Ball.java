package objects;

import classes.Object;

public class Ball extends Object {
	public Ball(double x, double y, double w, double h) {
		super(Double.POSITIVE_INFINITY, 0, 0, 0, 0, x, y, w, h);
	}
	public void setPosition(double vx, double vy) {
		xPosition = 0;
		yPosition = 0;
		xVelocity = vx;
		yVelocity = vy;
	}
}
