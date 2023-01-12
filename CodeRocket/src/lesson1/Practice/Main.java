package lesson1.Practice;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        String userName = "Vector";
        String currency = "INR";

        BigDecimal amount = new BigDecimal(1000);
        BigDecimal bankAccount = new BigDecimal("1000.10");

        System.out.println(userName);
        System.out.println(currency);
        System.out.println(amount);
        System.out.println(bankAccount);

        BigDecimal doubleValue = new BigDecimal(1000.01);
        BigDecimal stringValueBigdecimal = new BigDecimal("1000.01");
        System.out.println(doubleValue);
        System.out.println(stringValueBigdecimal);

        boolean isHungry = true;

        double weight = 60.5;
        System.out.println(weight);
        System.out.println(isHungry);

    }

}