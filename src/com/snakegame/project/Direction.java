package com.snakegame.project;

/**
 *  This class will pass the Up, down, left or right
 *  values to the game controller.
 */

public enum Direction {
	// ===========================================================
	// Elements
	// ===========================================================

	UP, DOWN, LEFT, RIGHT;

	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * This method adds the controller option to the X's Linkedlist
	 */
	
	public static int addToX(final Direction pDirection, final int pX) {
		switch(pDirection) {
			case UP:
			case DOWN:
				return pX;
			case LEFT:
				return pX - 1;
			case RIGHT:
				return pX + 1;
			default:
				throw new IllegalArgumentException();
		}
	}

	/**
	 *  This method adds the controller option to the Y's Linkedlist 
	 */
	
	public static int addToY(final Direction pDirection, final int pY) {
		switch(pDirection) {
			case LEFT:
			case RIGHT:
				return pY;
			case UP:
				return pY - 1;
			case DOWN:
				return pY + 1;
			default:
				throw new IllegalArgumentException();
		}
	}

	/**
	 *  This method will return the opposite controller direction,
	 *  the snake cannot move in the opposite direction because this
	 *  will make the snake to eat its tail.
	 */
	
	public static Direction opposite(final Direction pDirection) {
		switch(pDirection) {
			case UP:
				return DOWN;
			case DOWN:
				return UP;
			case LEFT:
				return RIGHT;
			case RIGHT:
				return LEFT;
			default:
				return null;
		}
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
