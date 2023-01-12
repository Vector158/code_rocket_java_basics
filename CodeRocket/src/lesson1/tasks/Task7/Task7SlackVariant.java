package lesson1.tasks.Task7;

import java.util.Scanner;

public class Task7SlackVariant {
    public static void main(String[] args) {


        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int Number = UserInput.nextInt();

        int squareNumber = Number * Number;
        int cubeNumber = Number * Number * Number;
        int forthPower = Number * Number * Number;

        System.out.println("Square: " +squareNumber);
        System.out.println("Cube: " +cubeNumber);
        System.out.println("Forth power: " +forthPower);

    }
}
