package com.kj.libs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import com.kj.interfaces.ArrayPrinter;

/**
 *
 * @author kalolo
 */
public class PrintArray implements ArrayPrinter {
    
    public void print(List<String> arr){
        for (String elm : arr) {            
            System.out.println(">> from PrintArray.print Val: " + elm);            
        }        
    }
    
}
