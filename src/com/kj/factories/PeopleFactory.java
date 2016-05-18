/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kj.factories;

import java.util.HashMap;
import java.util.Map;
import com.kj.objs.Person;
import com.kj.libs.Utils;

/**
 *
 * @author kalolo
 */
public class PeopleFactory {
    
    public static Map create(int quantity){
        Map m = new HashMap();
        for (int x = 0; x < quantity; x++) {
            Person p = new Person(
                Utils.randomString(5),
                Utils.randomString(10),
                Utils.randomString(30),
                Utils.randomAge()
            );
            
            m.put(p, p.getUid());
        }
        return m;
    }
    
}
