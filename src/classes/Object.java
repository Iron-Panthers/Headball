package classes;

public abstract class Object {
	double mass;
	double xVelocity;
	double yVelocity;
	double xAcceleration;
	double yAcceleration;
	double xPosition;
	double yPosition;
	double width;
	double height;
	public Object(double mass, double xVelocity, double yVelocity, double xAcceleration, double yAcceleration, double xPosition, double yPosition, double width, double height) {
		this.mass = mass;
		this.xVelocity = xVelocity;
		this.yVelocity = yVelocity;
		this.xAcceleration = xAcceleration;
		this.yAcceleration = yAcceleration;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.width = width;
		this.height = height;
	}
	public void move(double time) {
		xVelocity += (xAcceleration* time );
		yVelocity += (yAcceleration* time);
		xPosition += (xVelocity * time);
		yPosition += (yVelocity * time);
		
		xAcceleration = 0;
		yAcceleration = 0;
		
	}
	public void applyForce(double nx[], double ny[]) {
		for(int i =0; i < nx.length; i++) {
			xAcceleration += nx[i]/mass;
		}
		for(int i = 0; i < ny.length; i++) {
			yAcceleration += ny[i]/mass;
		}
	}
}
