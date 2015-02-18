package com.drakeofthefells.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
	
	private boolean[] keys = new boolean[65536];
	public boolean up, down, left, right, home, store, visit;
	
	public void update() {
		up = keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_DOWN] || keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_LEFT] || keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_RIGHT] || keys[KeyEvent.VK_D];
		home = keys[KeyEvent.VK_H];
		store = keys[KeyEvent.VK_P];
		visit = keys[KeyEvent.VK_V];
		
	}
	
	public void keyPressed (KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}
	
	public void keyReleased (KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}
	
	public void keyTyped (KeyEvent e) {
	}

}
