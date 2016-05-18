/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kj.libs;

import java.util.List;
import com.kj.interfaces.ArrayPrinter;

/**
 *
 * @author kalolo
 */
public class SecondPrinter implements ArrayPrinter  {
    
    public void print(List<String> l){
        System.out.println("From second printer");
        for (String elm : l) {            
            System.out.println(">>" + elm);            
        } 
    }
    
}
