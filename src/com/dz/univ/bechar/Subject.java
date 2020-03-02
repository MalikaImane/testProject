/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dz.univ.bechar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Malyane
 */
class Subject implements Isubject {

    int flog;

    // List<Observer> observers = new ArrayList<>(this.observers);
    private List<Observer> observers;

    Subject() {
        this.observers = new ArrayList<>();
    }

    public int getflog() {
        return flog;
    }

    public void setflog(int flog) {
        this.flog = flog;
        this.notifyObservers();
    }

    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        for (Observer obj : observersLocal) {
            obj.update();
        }

    }
}
