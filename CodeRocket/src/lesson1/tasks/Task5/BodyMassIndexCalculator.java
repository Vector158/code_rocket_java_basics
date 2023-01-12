package lesson1.tasks.Task5;

//import static java.lang.Math.sqrt;

public class BodyMassIndexCalculator {
    public double conversion(double weight, double height){
        double result = 703 * (weight /(height * height));
        System.out.println(result);
        return result;
    }
}
