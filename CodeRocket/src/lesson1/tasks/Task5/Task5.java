package lesson1.tasks.Task5;

// 1. Ask user weight in pounds
// 2. Ask user height in inches
// 3. Use Body mass index calculator to find out BMI
// 4. Print out user BMI

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        //Import formula
        BodyMassIndexCalculator formula = new BodyMassIndexCalculator();
        //Create object. This will be scanned
        Scanner UserInput = new Scanner(System.in);

        //Ask for input 1. Save input
        System.out.print("Input weight in pounds: ");
        double pounds = UserInput.nextDouble();
        //Ask for input 2. Save input
        System.out.print("Input height in inches: ");
        double inches = UserInput.nextDouble();


        //Print result with formula below
        System.out.print("Your BMI is: ");
        formula.conversion(pounds, inches);
    }
}
