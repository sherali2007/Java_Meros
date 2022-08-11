package com.company;

public class Person {
    String name;
    int young;
    String height;

    public Person() {
    }

    public Person(String name, int young,String height) {
        this.name = name;
        this.young = young;
        this.height = height;
    }
    public void toWalk(){
        System.out.println("Yurmoq");
    }
    public void toStop(){
        System.out.println("To'xtamoq");
    }
    public void eat(){
        System.out.println("Yemoq");
    }
}
