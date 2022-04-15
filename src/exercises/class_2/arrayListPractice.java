package exercises.class_2;


import java.util.ArrayList;
import java.util.Scanner;


public class arrayListPractice {

    public static void sumOfEven(ArrayList<Integer> List){
        int sum = 0;

        for(int i =0; i < List.size(); i++){
            if(List.get(i) % 2 == 0) {
                sum += List.get(i);
            }
        }
        System.out.println("Total for numList: " + sum);
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);
        numList.add(10);

        sumOfEven(numList);


        ArrayList<String> words = new ArrayList<>();
        words.add("cat");
        words.add("dog");
        words.add("bird");
        words.add("horse");
        words.add("hippo");
        words.add("deer");

        System.out.println("Pick the length of the words you want to find.");
        int wordLength = input.nextInt();
        input.close();

        for(int i = 0; i < words.size(); i++){
            if(words.get(i).length() == wordLength) {
                System.out.println(words.get(i));
            }
        }
    }
}
