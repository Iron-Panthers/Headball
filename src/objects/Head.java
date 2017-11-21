package objects;

import classes.Object;

public class Head extends Object {
	public double movedx;
	public double movedy;
	public Head(double x, double y, double w, double h) {
		super(1000000000, 0, 0, 0, 0, x, y, w, h);
	}
	@Override public void move(double time){
		xVelocity += (xAcceleration* time );
		yVelocity += (yAcceleration* time);
		movedx = xVelocity;
		movedy = yVelocity;
		xPosition += (xVelocity * time);
		yPosition += (yVelocity * time);
		
		xAcceleration = 0;
		yAcceleration = 0;
		
	}
	public void jump() {
		applyforce(0,1-9.8* mass);
	}
}
