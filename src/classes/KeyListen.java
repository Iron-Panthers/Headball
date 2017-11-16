package classes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import objects.Player;

public class KeyListen implements KeyListener {
	public void keyPressed(KeyEvent a) {
		Player.playerMoveLeft();
	}
	public void keyTyped(KeyEvent a) {

	}
	public void keyReleased(KeyEvent a) {
		
	}
}
