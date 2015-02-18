package com.drakeofthefells.entities;

import java.util.Random;

import com.drakeofthefells.graphics.Screen;
import com.drakeofthefells.level.Level;

public abstract class Entities {

	public int x, y;
	
	private boolean removed = false;
	protected Level level;
	protected Random random = new Random();
	
	public void update() {
	}
	
	public void render(Screen screen) {
		
	}
	
	public void remove() {
		removed = true;
	}
	
	public boolean isRemoved() {
		return removed;
	}

}
