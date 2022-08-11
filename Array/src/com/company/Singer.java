package com.company;

public class Singer extends Person {
    String bandName;

    public Singer(String name, int young, String height, String bandName) {
        super(name, young, height);

        this.bandName = bandName;
    }
public void setBandName(){
    System.out.println("BandName: "+bandName);
}

    public void toSing() {
        System.out.println(name + " Sing a song");
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Young: " + young);
        System.out.println("Height: " + height);
    }
}