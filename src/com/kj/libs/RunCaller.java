/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kj.libs;

import com.kj.interfaces.Caller;

/**
 *
 * @author kalolo
 */
public class RunCaller implements Caller {
    
    public void run(){
        System.out.println(">> Running via RunCaller class");
    }
    
}
