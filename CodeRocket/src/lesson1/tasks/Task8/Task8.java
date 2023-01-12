package lesson1.tasks.Task8;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        int integer1;
        int integer2;

        Scanner UserInput = new Scanner(System.in);
        System.out.print("Insert integer 1: ");
         integer1 = UserInput.nextInt();
        System.out.print("Insert integer 2: ");
         integer2 = UserInput.nextInt();


        int sumOfIntegers = integer1 + integer2;
        System.out.println("Sum of two integers is: " +sumOfIntegers);

        int differenceOfIntegers = integer1 - integer2;
        System.out.println("Difference of Integers is: " +differenceOfIntegers);

        int productOfIntegers = integer1 * integer2;
        System.out.println("Product of integers is: " +productOfIntegers);

        double averageOfIntegers = (integer1 + integer2) / 2;
        System.out.printf("Average of integers is: %.2f%n" ,averageOfIntegers);


        int distanceOfIntegers = Math.abs(integer1 - integer2);
        System.out.printf("distance:  "  +distanceOfIntegers +"%n");


        System.out.println("Max integer: " +Math.max(integer1, integer2));
        System.out.println("Min integer: " +Math.min(integer1, integer2));





    }
}
