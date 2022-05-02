package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String[] args){
        HouseCat garfield = new HouseCat("Garfield", 12);
        //garfield.eat();
        System.out.println(garfield.isTired());   // prints true
        System.out.println(garfield.noise());
        System.out.println(garfield.purr());
        System.out.println(garfield.isSatisfied());

        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise()); // Hello, my name is Suki!
        System.out.println(((HouseCat) suki).isSatisfied());
    }
}
