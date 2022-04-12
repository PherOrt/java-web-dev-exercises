package exercises.class_2;

import java.util.Arrays;

public class arrayPractice {

    public static void main(String[] args){

        int[] anArray = {1, 1, 2, 3, 5, 8};
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";


        for(int i=0; i < anArray.length; i++){
            if(anArray[i]% 2 != 0)
            System.out.println(anArray[i]);
        }

        String[] arrOfPhrase = phrase.split(" ");
        String[] arrOfPhraseSentence = phrase.split("\\.");

        System.out.println(Arrays.toString(arrOfPhrase));
        System.out.println(Arrays.toString(arrOfPhraseSentence));


    }
}
