/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kj.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.kj.interfaces.ArrayPrinter;
import com.kj.interfaces.Caller;
import com.kj.libs.SecondPrinter;
import com.kj.libs.RunCaller;
import com.kj.objs.Person;
import com.kj.factories.PeopleFactory;
import com.kj.libs.Utils;
import com.kj.games.BasketGame;
/**
 *
 * @author kalolo
 */
public class japp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //checkLambdas();
        //JavaApplication1.sorting();
        testThreads();
    }
    
    private static void testThreads(){
        
        Person player1 = new Person("kalolo","Lopez", "kalolo@gmail.com", 18);
        Person player2 = new Person("Carlos","L","carlos@lopezr.net", 34);
        
        
        Map people = PeopleFactory.create(25);
        
        people.forEach((p,id) -> {
            new BasketGame((Person)p).play();
        });   
    
    }
    
    private static void sorting() {
        
        Map people = PeopleFactory.create(15);
        Set<Person> sPeople = people.keySet();//new HashSet<>();
        
        List orderedPeople = new ArrayList(people.keySet());
        
        List<Integer> ages = new ArrayList<>();
        
        ages.add(Utils.randomAge());
        ages.add(Utils.randomAge());
        ages.add(Utils.randomAge());
        ages.add(Utils.randomAge());
        ages.add(Utils.randomAge());
        
        List<Integer>ages2 = new ArrayList<>(ages);
        
        System.out.println(ages);        
        ages = Utils.bubbleSort(ages);        
        System.out.println(ages);
        
        System.out.println(ages2);        
        ages2 = Utils.bubbleSort2(ages2);        
        System.out.println(ages2);
        
        System.out.println("--- Normal:");
        orderedPeople.forEach((p) -> System.out.println(((Person)p).getUid() + " " + ((Person)p).getAge()));
        orderedPeople = Utils.sortPeople(orderedPeople);
        System.out.println("--- Ordered:");
        orderedPeople.forEach((p) -> System.out.println(((Person)p).getUid() + " " + ((Person)p).getAge()));
        
    }
        
    private static void collections() {
     //   Collection c = Collection;
    }
    
    private static void checkLambdas() {
        List<String> lists = new ArrayList<>();
        
        lists.add("Something 1");
        lists.add("Something 2");
        lists.add("Something 3");
        
        ArrayPrinter p = new SecondPrinter();
        
        
        japp.printMyArray(p, lists);
                  
        RunCaller rc = new RunCaller();
        //checkingCaller(rc);
        
        // anonymous class...
        checkingCaller(new Caller(){
            public void run(){
                System.out.println(":: Running via anonymous class");
            }
        });  
        
        checkingCaller(()-> System.out.println("From lambda"));
        
        printMyArray(new ArrayPrinter(){
            public void print(List<String> arr){
                System.out.println(arr.size());  
                System.out.println("From anonymous");
            }
        }, lists);    
        
        lists.add("Carlos lopez");
        
        printMyArray((List<String> a) -> { System.out.println("From lambda..."); p.print(a); }, lists );
    }
    
    
    public static void printMyArray(ArrayPrinter printer, List arr) {
        System.out.println("PrintMyArray!");
        printer.print(arr);        
    }

    public static void checkingCaller(Caller c) {
        c.run();
    }

}
