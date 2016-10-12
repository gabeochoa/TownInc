package com.gabeochoa.entities;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Building {

	int footprint_x;
	int footprint_y;
	int footprint_z; //up, not needed
	
	int pos_x;
	int pos_y;
	
	Graphics g;
	
	public Building(int px, int py, int fx, int fy)
	{
		pos_x = px;
		pos_y = py;
		footprint_x = fx;
		footprint_y = fy;
	}
		
	public abstract void update();

	public void paint(Graphics gr) {
		g = gr;
		drawBuilding();
	}
	
	public void drawBuilding()
	{
		g.setColor(Color.black);
		g.fillRect(pos_x, pos_y, footprint_x, footprint_y);
	}
		
}
