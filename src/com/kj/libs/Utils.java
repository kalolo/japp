/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kj.libs;

import java.security.SecureRandom;
import java.util.List;
import com.kj.objs.Person;

/**
 *
 * @author kalolo
 */
public class Utils {
    
    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();
    static final int MAX_AGE = 99;
    static final int MIN_AGE = 1;
    
    public static String randomString(int len) {
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ ) 
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }
    
    public static int randomAge(){
        return (int) ( Math.random() * (MAX_AGE - MIN_AGE) );
    }
    
    
    public static List bubbleSort(List l) {
        int iteration = 0;
        for(int x=0; x< l.size(); x++){
            for (int y=0; y < l.size(); y++) {
                iteration++;
                if ( (Integer)l.get(x) < (Integer)l.get(y) ) {
                    int tmp = (Integer)l.get(x);
                    l.set(x, l.get(y));
                    l.set(y, tmp);
                }
            }
        }
        System.out.println("Runs: "+iteration);
        return l;
    }
    
    
    public static List bubbleSort2(List l) {
        boolean swapped = true;
        int iteration = 0;
        while(swapped) {
            iteration++;
            swapped = false;
            for(int x=0; x < l.size() -1; x++){            
                if ( (Integer)l.get(x) > (Integer)l.get(x+1) ) {
                    int tmp = (Integer)l.get(x);
                    l.set(x, l.get(x+1));
                    l.set(x+1, tmp);
                    swapped = true;
                }
            }        
        }
        System.out.println("Runs: "+iteration);
        return l;
    }
    
    public static List<Person> sortPeople(List<Person> lp) {
        
        for(int x=0; x< lp.size(); x++){
            for (int y=0; y < lp.size(); y++) {
                if ( ((Person)lp.get(x)).getAge() < ((Person)lp.get(y)).getAge() ) {
                    Person tmp = (Person)lp.get(x);
                    lp.set(x, lp.get(y));
                    lp.set(y, tmp);
                }
            }
        }
        
        return lp;
    }
    
}
