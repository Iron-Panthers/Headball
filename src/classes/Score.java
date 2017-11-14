package classes;

public class Score {
	int score;
	public Score(int score) {
		this.score = score;
	}
	public void add() {
		score++;
	}
	public void initialize() {
		score = 0;
	}
}
