package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Toppings> toppings = menu.getToppings();
        //Comparator comparator = new FlavorComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
//        System.out.println(flavors);
//        //flavors.sort(comparator);
//        flavors.sort(new FlavorComparator()); //Allows us to initialize and declare at the same time
//        System.out.println("\n" + flavors);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
//        System.out.println(cones);
//        cones.sort(new ConeComparator());
//        System.out.println("\n" + cones);
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println(toppings);
        toppings.sort(new ToppingComparator());
        System.out.println("\n" +
                "-----------" + "\n" +
                toppings.get(0) + "\n" +
                toppings.get(1) + "\n" +
                toppings.get(2) + "\n" +
                toppings.get(3) +
                "-----------");
    }
}
