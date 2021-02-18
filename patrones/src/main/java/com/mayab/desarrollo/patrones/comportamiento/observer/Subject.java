package com.mayab.desarrollo.patrones.comportamiento.observer;

public interface Subject {
	public void registerObserver(Observers o);
	public void removeObserver(Observers o);
	public void notifyObservers();
}
