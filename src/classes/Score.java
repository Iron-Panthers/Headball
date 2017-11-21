package classes;

import main.Main;

public class Score {
	int score;
	public Score() {
	}
	public void scored(double x1,double x2,double y1, double y2) {
		score++;
		Main.field.ball.setPosition(0,0,1,1);
	}
	public void initialize() {
		score = 0;
	}
}
