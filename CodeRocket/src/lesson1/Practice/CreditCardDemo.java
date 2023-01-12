package lesson1.Practice;

import java.util.Date;
public class CreditCardDemo {
    public static void main(String[] args){
        CreditCard firstCreditCard = new CreditCard();
        System.out.println(firstCreditCard.paymentNetwork);
        System.out.println(firstCreditCard.cardNumber);
        System.out.println(firstCreditCard.cardholder);
        System.out.println(firstCreditCard.cvv);
        System.out.println(firstCreditCard.expieryDate);
        System.out.println(firstCreditCard.blocked);
        firstCreditCard.paymentNetwork = "MASTERCARD";
        System.out.println(firstCreditCard.paymentNetwork);

        Date expiryDate = new Date();

        CreditCard secondCreditCard = new CreditCard("SWED", "123456678","victor", "123", expiryDate);

        System.out.println(secondCreditCard.paymentNetwork);
        System.out.println(secondCreditCard.cardNumber);
        System.out.println(secondCreditCard.cardholder);
        System.out.println(secondCreditCard.cvv);
        System.out.println(secondCreditCard.expieryDate);
        System.out.println(secondCreditCard.blocked);



    }
}
