package com.drakeofthefells.entities.mob;

import com.drakeofthefells.entities.Entities;
import com.drakeofthefells.graphics.Sprite;

public abstract class Mob extends Entities {
	
	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move(int xa, int ya) {
		if (xa > 0) dir = 1;
		if (xa < 0) dir = 3;
		if (ya > 0) dir = 2;
		if (ya < 0) dir = 0;
	}
	
	public void update() {
	}
	
	private boolean collision() {
		return false;
	}
	
	public void render() {
		
	}

}
