package com.nvztcrk.observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class Observable {
    private List<Observer> observers;

    public Observable() {
        observers = new CopyOnWriteArrayList<Observer>();
    }

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    abstract void notifyObservers();
}
