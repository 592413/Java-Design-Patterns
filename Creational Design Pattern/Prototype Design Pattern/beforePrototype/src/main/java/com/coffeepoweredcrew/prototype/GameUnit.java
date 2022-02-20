package com.coffeepoweredcrew.prototype;


/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit {
	
	private String position;
	
	public GameUnit() {
		position ="Zero";
	}
	
	public GameUnit(String newPos) {
		position = newPos;
	}

	public void move(String changedPos) {
		position = changedPos;
	}
	
	public String getPosition() {
		return position;
	}
}
