package classes;

import main.Main;
import objects.Ball;

public class Score {
	int score;
	public Score() {
	}
	public void scored() {
		if (Main.field.ball.xPosition = Main.field.goal1.xPosition && Main.field.ball.yPosition = 100) {
			score++;
		}
	}
	public void initialize() {
		score = 0;
	}
}
