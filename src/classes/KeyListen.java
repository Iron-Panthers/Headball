package classes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.Main;
import objects.Player;

public class KeyListen implements KeyListener {
	public Player p1 = Main.field.p1;
	public Player p2 = Main.field.p2;
	public void keyPressed(KeyEvent a) {
		System.out.println(a.getKeyCode());
		if (a.getKeyCode() == KeyEvent.VK_A) {
			p1.playerMoveLeft();
		}
		if (a.getKeyCode() == KeyEvent.VK_D) {
			p1.playerMoveRight();
		}
		if (a.getKeyCode() == KeyEvent.VK_W) {
			p1.jump();
		}
		if (a.getKeyCode() == KeyEvent.VK_SPACE) {
			p1.feet.kick();
		}
		if (a.getKeyCode() == KeyEvent.VK_LEFT) {
			p1.playerMoveLeft();
		}
		if (a.getKeyCode() == KeyEvent.VK_RIGHT) {
			p1.playerMoveRight();
		}
		if (a.getKeyCode() == KeyEvent.VK_UP) {
			p1.jump();
		}
		if (a.getKeyCode() == KeyEvent.VK_P) {
			p1.feet.kick();
		}
	}
	public void keyTyped(KeyEvent a) {

	}
	public void keyReleased(KeyEvent a) {
		
	}
}
