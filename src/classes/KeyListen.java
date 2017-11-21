package classes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import objects.Player;

public class KeyListen implements KeyListener {
	public void keyPressed(KeyEvent a) {
		System.out.println(a.getKeyCode());
		if (a.getKeyCode() == 97) {
			Player.playerMoveLeft();
		}
		if (a.getKeyCode() == 100) {
			Player.playerMoveRight();
		}
		if (a.getKeyCode() == 119) {
			Player.jump();
		}
	}
	public void keyTyped(KeyEvent a) {

	}
	public void keyReleased(KeyEvent a) {
		
	}
}
