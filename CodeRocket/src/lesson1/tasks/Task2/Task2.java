package lesson1.tasks.Task2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


// 1. Ask user for input. (integer only / limit 0 - 1000)
// 2. Separate all digits from the number
// 3. Sum all digits
// 4. Print sum


public class Task2 {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);             // Create scanner object
        Integer numberArrays;                                    // Here I will save input into Array



        System.out.println("Enter integer. Range = (0 - 1000)");
        numberArrays = UserInput.nextInt();

        //while loop to sum each digit
        int sum = 0;
        while (numberArrays > 0) {
            sum += numberArrays % 10;
            numberArrays /= 10;
        }

        System.out.println("number sum is: " +sum);
    }
}
