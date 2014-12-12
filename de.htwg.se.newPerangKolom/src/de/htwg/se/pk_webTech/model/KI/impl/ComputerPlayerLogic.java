package de.htwg.se.pk_webTech.model.KI.impl;

import de.htwg.se.pk_webTech.model.ICell2;
import de.htwg.se.pk_webTech.model.KI.ICurrentStrategy;
import de.htwg.se.pk_webTech.model.impl.Cell2;

public class ComputerPlayerLogic {

	public ICurrentStrategy strategy;
	
	
	public void chooseStrategy(ICell2 iCell2){
		strategy.StrategyAlgorithm(iCell2);
	}
	
	public void setStrategy(ICurrentStrategy newStrategy){
		strategy = newStrategy;
	}


}
