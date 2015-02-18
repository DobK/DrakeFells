package com.drakeofthefells.graphics;

import java.util.Random;

import com.drakeofthefells.level.tile.Tile;

public class Screen {
	
	public int width, height;
	public int[] pixels;
	
	final int MAP_SIZE = 64;
	final int MAP_SIZE_MASK = MAP_SIZE - 1;
	public int[] tiles = new int [MAP_SIZE * MAP_SIZE];
	public int xOffset, yOffset;
	
	private Random random = new Random();
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		
		pixels = new int[width * height];
		
		for (int i = 0; i < MAP_SIZE * MAP_SIZE; i++) {
			tiles[i] = random.nextInt(0xffffff);
		}
	}
	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	
	public void renderTile(int xPos, int yPos, Tile tile) {
		xPos -= xOffset;
		yPos -= yOffset;
		for (int y = 0; y < tile.sprite.SIZE; y++) {
			int yAbs = y + yPos;
			for (int x = 0; x < tile.sprite.SIZE; x++) {
				int xAbs = x + xPos;
				if (xAbs < -tile.sprite.SIZE || xAbs >= width || yAbs < 0 || yAbs >= height) break;
				if (xAbs < 0) xAbs = 0;
				pixels[xAbs +yAbs * width] = tile.sprite.pixels[x + y * tile.sprite.SIZE];
			}
		}
		
	
	}
	
	public void setOffset(int xOffset, int yOffset) {
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}
	
}


