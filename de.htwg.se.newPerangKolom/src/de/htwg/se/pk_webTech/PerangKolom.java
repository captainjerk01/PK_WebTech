package de.htwg.se.pk_webTech;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import de.htwg.se.pk_webTech.aview.GUI.GraphicalUI;
import de.htwg.se.pk_webTech.aview.tui.TextUI2;
import de.htwg.se.pk_webTech.controller.IPKController;
import de.htwg.se.pk_webTech.controller.impl.PKController;
import de.htwg.se.pk_webTech.model.impl.MessagesForUser2;


public final class PerangKolom<E> {

	private static Scanner scanner;
	private IPKController controller;
	private static GraphicalUI graphicalUI;
	private static TextUI2 tui;
	private static PerangKolom instance = null;
	private Logger logger;
	
	private PerangKolom() {
		controller = new PKController();
		graphicalUI = new GraphicalUI<E>();
		tui = new TextUI2(new PKController());
		logger = Logger.getLogger("de.htwg.se.PerangKolom.PerangKolom");
	}
	
	public static PerangKolom getInstance() {
		if (instance == null) {
			instance = new PerangKolom();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// Set up logging through log4j
		PropertyConfigurator.configure("log4j.properties");
		
		PerangKolom.getInstance();
		
		//print the welcome-string
		PerangKolom.getInstance().logger.info(MessagesForUser2.startOfTheGame);
		
		// continue to read user input on the TUI until the user decides to quit
		boolean continueGame = true;
		scanner = new Scanner(System.in);
		while (continueGame) {
			continueGame = tui.processInputLine(scanner.next());
		}
		//DELETETHISLINE
	}
	
}

