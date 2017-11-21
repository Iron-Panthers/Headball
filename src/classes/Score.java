package classes;

import main.Main;

public class Score {
	static int score;
	public Score() {
	}
	public static void scored(double x1,double x2) {
		score++;
		Main.field.ball.setPosition(x1,x2);
	}
	public void initialize() {
		score = 0;
	}
}
