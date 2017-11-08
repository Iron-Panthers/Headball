package objects;

import classes.Object;

public class Ground extends Object {
	public Ground(double x, double y, double w, double h) {
		super(Double.POSITIVE_INFINITY, 0, 0, 0, 0, x, y, w, h);
	}
}
