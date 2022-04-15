package org.launchcode.java.studio.counting;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class characters {

    public static void main(String [] args){

        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string.");
        String myString = input.nextLine().toLowerCase();

        //char[] charactersInString = hiddenFigures.toCharArray();
        char[] charactersInString = myString.toCharArray();

        HashMap<Character, Integer> letters = new HashMap<>();

        //System.out.println(charactersInString);

        for(char letter: charactersInString){
            if(letter >= 'A' && letter <= 'Z'){
                letter+=32;}
            if(letter<'a' || letter>'z'){
                continue;}

            if(!letters.containsKey(letter)){
                letters.put(letter, 1);
            }
            else {
                letters.put(letter, letters.get(letter) + 1);
            }
            }
        System.out.println(letters);
        }

    }


