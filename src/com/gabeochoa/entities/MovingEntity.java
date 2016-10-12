package com.gabeochoa.entities;

import java.awt.Graphics;

public abstract class MovingEntity extends Entity{

	public int xspeed;
	public int yspeed;
	
	public MovingEntity(int X, int Y, int R)
	{
		super(X, Y, R);
	}
	
	public MovingEntity(int X, int Y, int R, String name)
	{
		super(X, Y, R, name);
	}
	
	public abstract void move();

	public void paint(Graphics gr) {
		super.paint(gr);
	}
	public void drawEntity(){
		super.drawEntity();
	}
	
}


