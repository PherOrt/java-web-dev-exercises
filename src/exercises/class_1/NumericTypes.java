package exercises.class_1;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle");
        Integer length = input.nextInt();
        System.out.println("What is the width of the rectangle");
        Integer width = input.nextInt();
        Integer sum = length * width;
        System.out.println("The area of the rectangle is:" + sum);
    }
}
