package de.htwg.se.pk_webTech.model;

public interface IPlayer2 {
	
	void setPlayerHuman(boolean isHuman);
	
	boolean isPlayerAHuman();
	
	int getNumberOfPoints();
	
	void addPointsToPlayersAccount(int newPoints);	
	
	void setPlayersName(String name);
	
	String getPlayersName();
	 
}
