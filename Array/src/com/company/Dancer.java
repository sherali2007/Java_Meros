package com.company;

public class Dancer extends Person {
    String groupName;

    public Dancer(String name, int young, String height, String groupName) {
        super(name, young, height);
        this.groupName = groupName;
    }
public void setGroupName(){
    System.out.println("Group: "+groupName);
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Young: " + young);
        System.out.println("Height: " + height);
    }
}
