package lesson1.Practice;

public class SimpleCalculatorDemo {
    public static void main(String[] args){
        SimpleCalculator calculator = new SimpleCalculator();

        int a = 10;
        int b = 20;

        int calculationResult = calculator.addition (a,b);
        System.out.println(calculationResult);

    }
}
