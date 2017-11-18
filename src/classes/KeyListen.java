package classes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import objects.Player;

public class KeyListen implements KeyListener {
	public void keyPressed(KeyEvent a) {
		System.out.println(a.getKeyCode());
		if (a.getKeyCode() == 81) {
			Player.playerMoveLeft();
		}
		if (a.getKeyCode() == 82) {
			Player.playerMoveRight();
		}
	}
	public void keyTyped(KeyEvent a) {

	}
	public void keyReleased(KeyEvent a) {
		
	}
}
