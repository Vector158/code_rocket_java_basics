package lesson1.tasks.Task7;

import java.util.Scanner;
import static lesson1.tasks.Task7.PowerFormula.power;




// This is not exactly how

public class Task7 {
    public static void main(String[] args) {


        int base, exponent;

        Scanner UserInput = new Scanner(System.in);

        System.out.print("Enter number: ");
        base = UserInput.nextInt();

        System.out.print("Enter the power of number: ");
        exponent = UserInput.nextInt();

        int result = power(base,exponent);
        System.out.println("Result is: " + result);





    }
}
