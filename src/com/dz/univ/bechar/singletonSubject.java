/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dz.univ.bechar;

/**
 *
 * @author Malyane
 */
public class singletonSubject extends Subject {

    private static singletonSubject instance = null;

    private singletonSubject() {
        super();
    }

    public static singletonSubject getinstance() {
        if (instance == null) {
            instance = new singletonSubject();
        }
        return instance;
    }
}
