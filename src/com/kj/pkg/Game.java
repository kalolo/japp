/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kj.pkg;

/**
 *
 * @author kalolo
 */
public class Game {
    
    protected Integer goalPoints;
    protected Integer score;
    
    protected Game() {
        
    }
    
    public void tryToScore(){ 
        if ( Math.random() < 0.5 ) {
            this.scorePoint(1);
        }
    }
    
    private void scorePoint(Integer point) {        
        this.score += point;
    }
    
    public boolean scoreReached(){
        return (this.score >= this.goalPoints);
    }
    
    public boolean playable() {
        return !this.scoreReached();
    }
    
    
}
