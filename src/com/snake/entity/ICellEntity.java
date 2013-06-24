package com.snake.entity;

/**
 *  This is an interface that will be implemented
 *  by "CellEntity", "AnimatedCellEntity" classes.
 *  The game will have Animated cells for both objects
 *  frog and snake.
 */
public interface ICellEntity {
	// ===========================================================
	// Constants
	// ===========================================================
	
	public abstract int getCellX();
	public abstract int getCellY();

	public abstract void setCell(final ICellEntity pCellEntity);
	public abstract void setCell(final int pCellX, final int pCellY);

	public abstract boolean isInSameCell(final ICellEntity pCellEntity);
}