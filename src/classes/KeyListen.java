package classes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import objects.Player;

public class KeyListen implements KeyListener {
	public void keyPressed(KeyEvent a) {
		System.out.println(a.getKeyCode());
		if (a.getKeyCode() == KeyEvent.VK_A) {
			Player.playerMoveLeft();
		}
		if (a.getKeyCode() == KeyEvent.VK_D) {
			Player.playerMoveRight();
		}
		if (a.getKeyCode() == KeyEvent.VK_W) {
			Player.jump();
		}
		if (a.getKeyCode() == KeyEvent.VK_SPACE) {
			Player.feet.kick();
		}
	}
	public void keyTyped(KeyEvent a) {

	}
	public void keyReleased(KeyEvent a) {
		
	}
}
