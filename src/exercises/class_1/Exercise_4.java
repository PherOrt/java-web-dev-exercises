package exercises.class_1;

import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String LowerCaseAlice = Alice.toLowerCase();
        System.out.println("Pick a word from the story Alice in Wonderland.");
        String word = input.nextLine();
        if(Alice.toLowerCase().contains(word.toLowerCase())){
            System.out.println("The story does contain the chosen word.");
            System.out.println("index:" + Alice.indexOf(word));
            System.out.println("length:" + word.length());
            Alice = Alice.toLowerCase().replace((word + " "),"");
            System.out.println(Alice);
        } else {
            System.out.println("That word is not in the story.");
        }
    }
}
