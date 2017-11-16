package classes;

import main.Main;

public class Score {
	int score;
	public Score() {
	}
	public void scored(double x1,double x2,double y1, double y2) {
		if (Main.field.ball.xPosition > x1 && Main.field.ball.xPosition < x2 && Main.field.ball.yPosition > y1 && Main.field.ball.yPosition < y2) {
			score++;
		}
	}
	public void initialize() {
		score = 0;
	}
}
