package com.gabeochoa.entities;

import java.awt.Graphics;
import java.util.Random;

import com.gabeochoa.Evo;
import com.gabeochoa.engine.Art;

public class Human extends MovingEntity {

	Random r=  new Random();
	Graphics g;
	String pic;
	
	public Human(int X, int Y, int R, String picture) {
		super(X, Y, R, "human");
		pic = picture;
	}

	@Override
	public void move() {
		int dir = r.nextBoolean()? 1 : -1;
		int dir2 = r.nextBoolean()? 1 : -1;
		this.x += dir * r.nextInt(2);
		this.y += dir2 * r.nextInt(2);
	
		if(x < 0) x = 5;
		if(y < 0) y = 5;
		if(x > 260) x = 260;
		if(y > 260) y = 260;
		
	}

	public void paint(Graphics gr) {
		g = gr;
		drawEntity();
	}
	public void drawEntity(){
		//super.drawEntity();
		g.drawImage(Art.getImage(pic), x,y, this.radius, this.radius ,null);
	}

}
