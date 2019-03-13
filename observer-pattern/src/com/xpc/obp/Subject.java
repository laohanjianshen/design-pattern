package com.xpc.obp;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者对象
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private Integer state;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    private void notifyALLObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        this.notifyALLObserver();
    }
}
