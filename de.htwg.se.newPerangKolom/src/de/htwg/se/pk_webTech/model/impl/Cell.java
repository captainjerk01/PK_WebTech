package de.htwg.se.pk_webTech.model.impl;

import de.htwg.se.pk_webTech.model.AbstractCell;

public class Cell extends AbstractCell{
	
	public Cell(final int indexX, final int indexY) {
		this.liesInRow = indexX;
		this.liesInCol = indexY;
		this.cellValue = this.makeRandomNumber();
		cellOutputStringArray = new char[CELL_SIZE][CELL_SIZE];
	}


}
