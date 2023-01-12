package lesson1.tasks.Task1;
import java.util.Scanner;  // Import the Scanner class


// 1. Ask user for input
// 2. Function: input * 0.00254 = result
// 3. Print result

public class Task1 {

    public static void main(String[] args) {
        // import custom formula
        MathOperator math = new MathOperator();

        // ask input
        Scanner input = new Scanner(System.in);
        double number;
        System.out.print("Enter inches: ");
        number = input.nextDouble();

        //Print out result
        System.out.print("Meters: ");
        math.addition (number);

    }
}
