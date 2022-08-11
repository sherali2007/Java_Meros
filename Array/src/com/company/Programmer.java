package com.company;

public class Programmer extends Person {
    String company;

    public Programmer(String name, int young, String height, String company) {
        super(name, young, height);

        this.company = company;
    }
    public void Code() {
        System.out.println(name + " Writing code");
    }
public void setCompany(){
    System.out.println(" Company name: "+company);
}
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("Young: "+young);
        System.out.println("Height: "+height);
    }

}
