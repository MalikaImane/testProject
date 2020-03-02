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
public class Mobserver {

    public static void main(String[] args) {

        Subject s = new Subject();
        Observer r1 = new Observer();
        Observer r2 = new Observer();
        Observer r3 = new Observer();
        s.register(r1);
        s.register(r2);
        s.register(r3);
        r1.update();
        r2.update();
        r3.update();
        // singleton
        singletonSubject a1=singletonSubject.getinstance();
             singletonSubject a2 =singletonSubject.getinstance();
             if(a1.equals(a2)){
                 System.out.println(true);
             }else{
               System.out.println(false);  
             }
             
    }

}
