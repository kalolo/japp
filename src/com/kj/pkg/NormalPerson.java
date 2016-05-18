/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kj.pkg;

import java.util.UUID;
import com.kj.objs.Person;

/**
 *
 * @author kalolo
 */
public abstract class NormalPerson {
    
    protected String uid;
    protected String name;
    protected String email;
    protected String lastName;
    protected int age;
    
    public NormalPerson() {
        this.uid = UUID.randomUUID().toString();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
     * @return the uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(String uid) {
        this.uid = uid;
    }
    
    public boolean equals(Object o){
        if (! (o instanceof Person)) return false;
        if (this == o )return true;
        Person p = (Person)o;
        return ( (this.uid.equals(p.getUid())) &&
                (this.name.equals(p.getName())) && 
                (this.email.equals(p.getEmail())) && 
                ( this.lastName.equals(p.getLastName()) ) );
    }
    
    public String toString() {
        return "["+this.uid + "] " + this.name + ", " + this.lastName + " Age:" + this.age + " <" + this.email + ">";
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    
    
}
