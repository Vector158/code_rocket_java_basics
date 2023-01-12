package lesson1.Practice;

import java.util.Date;



public class CreditCard {
        String paymentNetwork;
        String cardNumber;
        String cardholder;
        String cvv;
        Date expieryDate;
        boolean blocked;

        public CreditCard(){
        };


        public CreditCard(String paymentNetwork, String cardNumber, String cardholder, String cvv, Date expieryDate) {
                this.paymentNetwork = paymentNetwork;
                this.cardNumber = cardNumber;
                this.cardholder = cardholder;
                this.cvv = cvv;
                this.expieryDate = expieryDate;
        };

}
