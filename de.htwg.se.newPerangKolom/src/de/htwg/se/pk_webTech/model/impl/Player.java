package de.htwg.se.pk_webTech.model.impl;

import de.htwg.se.pk_webTech.model.AbstractPlayer;

public class Player extends AbstractPlayer{

	public Player(String playerName, boolean isHuman) {

		setName(playerName);
		this.setPlayerHuman(isHuman);
	}



}
