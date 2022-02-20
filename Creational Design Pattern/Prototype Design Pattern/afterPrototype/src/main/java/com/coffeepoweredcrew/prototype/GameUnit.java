package com.coffeepoweredcrew.prototype;

/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable {
	
	private String position;
	
	public GameUnit() {
		position = "Zero";
	}
	
	
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		GameUnit unit = (GameUnit)super.clone();
		unit.initialize();
		return unit;
	}

	protected void initialize() {
		this.position = "Zero";
		reset();
	}
	
	protected abstract void reset();
	
	public GameUnit(String pos) {
		position = pos;
	}

	public void move(String toPos) {
		position = toPos;
	}
	
	public String getPosition() {
		return position;
	}
}
