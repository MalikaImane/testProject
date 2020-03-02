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
public interface Isubject {

    //methods to register and unregister observers
    public void register(Observer o);

    public void unregister(Observer obj);

    public void notifyObservers();

}
