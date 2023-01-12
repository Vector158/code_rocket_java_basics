package lesson1.tasks.Task7;

public class PowerFormula {
        static int power (int base, int exponent){

            // Set power to 1. Because of math....
            int power = 1;

            // If Base exponent is smaller and or equal to user given exponent. Increase base exponent by 1
            // Loop this until BaseExponent is (User given exponent +1)
            for (int BaseExponent = 1; BaseExponent <= exponent; BaseExponent++)
                power = power * base;
                return power;
        }
}
