package classes;

import main.Main;
import objects.Ball;

public class Score {
	int score;
	public Score() {
	}
	public void scored() {
		if (Main.field.ball.xPosition = 1 && Main.field.ball.yPosition = 1) {
			score++;
		}
	}
	public void initialize() {
		score = 0;
	}
}
