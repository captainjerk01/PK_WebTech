package de.htwg.se.pk_webTech.model;

public class AbstractPlayer2 implements IPlayer2 {

	private String nameOfPlayer;
	private char playersTuiChar;
	private boolean isHuman;
	private int sumOfPoints;
	

	@Override
	public void setPlayerHuman(boolean isHuman) {
		this.isHuman = isHuman;
	}	
			
	
	@Override
	public boolean isPlayerAHuman() {
		return isHuman;
	}

	
	@Override
	public int getNumberOfPoints() {
		return sumOfPoints;
	}

	
	@Override
	public void addPointsToPlayersAccount(int newPoints) {
		sumOfPoints += newPoints;
	}


	@Override
	public void setPlayersName(String name) {
		nameOfPlayer = name;
	}


	@Override
	public String getPlayersName() {
		return nameOfPlayer;
	}
	
}
