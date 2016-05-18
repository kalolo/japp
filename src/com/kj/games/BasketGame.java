/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kj.games;

import java.util.logging.Level;
import java.util.logging.Logger;
import com.kj.pkg.Game;
import com.kj.objs.Person;

/**
 *
 * @author kalolo
 */
public class BasketGame extends Game implements Runnable {
    
    protected Person player;
    
    private String gameName;
    private Thread t;
    
    public BasketGame(Person player) {
        this.player     = player;
        this.goalPoints = 90;
        this.score      = 0;
        this.gameName   = this.player.getUid()+"::basketgame";
    }

    @Override
    public void run() {
        System.out.println("Running "+this.gameName);
        
       while( this.playable() ) {
           this.tryToScore();
            try {           
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
       }
       
       System.out.println("Game "+this.gameName+ " player: " + this.player.getName() + " ended");
    }
    
    public void play() {
        if ( t == null) {
            t = new Thread(this, this.gameName);
            t.start();
        }
    }
    
}
