package lesson1.tasks.Task6;

// 1. Ask user to input ( Meters ; Hours ; Minutes ; Seconds )
// 2. Convert given information to:
//      1. Meters / Seconds
//      2. KM / Hour
//      3. Miles / Hour
// 3.Print result


import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {


        Scanner TotalInput = new Scanner(System.in);

        System.out.print("Input meters: ");
        double Meters = TotalInput.nextInt();
        System.out.print("Input hours:");
        double Hours = TotalInput.nextInt();
        System.out.print("Input minutes: ");
        double Minutes = TotalInput.nextInt();
        System.out.print("Input seconds: ");
        double Seconds = TotalInput.nextInt();


        double TotalSeconds = (Hours * 60 * 60) + (Minutes * 60) + Seconds;
        double TotalMiles = (Meters / 1609);


        double MetersPerSecond = Meters / TotalSeconds;

        double KilometersPerHour = (Meters / 1000) / (TotalSeconds / 60 / 60);

        double MilesPerHour = TotalMiles / (TotalSeconds / 60 / 60);


        System.out.println("Your speed in meters/second is " +MetersPerSecond);
        System.out.println("Your speed in km/h is " +KilometersPerHour);
        System.out.println("our speed in miles/h is " +MilesPerHour);






    }
}
