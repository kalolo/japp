/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kj.objs;

import com.kj.pkg.Game;
import com.kj.pkg.NormalPerson;
import com.kj.interfaces.PersonInterface;
import com.kj.games.BasketGame;

/**
 *
 * @author kalolo
 */
public class Person extends NormalPerson implements PersonInterface {
    
    public Person(){
        
    }
    
    public Person(String name, String lastname, String email, int age) {
        super();
        this.name     = name;
        this.lastName = lastname;
        this.email    = email;
        this.age      = age;
    }
    
    public String talk() {
        return "Hello my name is " + this.name;
    }
}
