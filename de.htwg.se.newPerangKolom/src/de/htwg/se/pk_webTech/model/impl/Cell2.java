package de.htwg.se.pk_webTech.model.impl;

import de.htwg.se.pk_webTech.model.AbstractCell2;

public class Cell2 extends AbstractCell2{
		
	public Cell2(final int x, final int y) {
			this.setPositionX(x);
			this.setPositionY(y);
			this.setCellValue(this.makeRandomNumber());
		}

}
