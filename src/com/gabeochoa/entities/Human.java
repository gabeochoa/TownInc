package com.gabeochoa.entities;

public class Human extends MovingEntity {

	
	public Human(int X, int Y, int R) {
		super(X, Y, R, "human");
	}

	@Override
	public void move() {
		System.out.println("Human Moving");
	}

}
