package de.htwg.se.pk_webTech.util.observer;

import de.htwg.se.pk_webTech.util.observer.Event;
import de.htwg.se.pk_webTech.util.observer.IObserver;

public interface IObservable {
	 void addObserver(IObserver s);
	 void removeObserver(IObserver s);
	 void removeAllObservers();
	 void notifyObservers();
	 void notifyObservers(Event e);
}
