package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ToppingComparator implements Comparator<Toppings> {
    @Override
    public int compare(Toppings o1, Toppings o2) {
        if(o1.getAllergens().size() - o2.getAllergens().size() < 0){
            return 1;
        } else if (o1.getAllergens().size() - o2.getAllergens().size() > 0){
            return -1;
        } else {
            return 0;
        }
    }
}
