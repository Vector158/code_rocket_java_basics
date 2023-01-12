package lesson1.tasks.Task3;


//1. Ask user for input
//2. Convert input/minutes to years and days
//3. print result


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //import formula (convert minutes to years)
        TimeCalculator math = new TimeCalculator();

        // ask for user input
        Scanner UserInput = new Scanner(System.in);
        double Minutes;
        System.out.print("Enter minutes: ");
        Minutes = UserInput.nextDouble();

        //print result
        System.out.print("Result: ");
        math.division(Minutes);

    }
}
