package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Programmer programmer = new Programmer("Hacker",19,"1,75","IT Park");
        programmer.show();
        programmer.eat();
       programmer.toWalk();
       programmer.setCompany();
       programmer.Code();
       programmer.toStop();

        System.out.println("-------------------------");

       Dancer dancer = new Dancer("Dancer",16,"1,65","Kaka");

       dancer.show();
       dancer.eat();
       dancer.toWalk();
       dancer.setGroupName();
       dancer.toStop();

        System.out.println("-------------------------");

        Singer singer = new Singer("Singer",20,"1,70","XAVELI");
        singer.show();
        singer.eat();
        singer.toWalk();
        singer.setBandName();
        singer.toSing();
        singer.toStop();
    }
    }
