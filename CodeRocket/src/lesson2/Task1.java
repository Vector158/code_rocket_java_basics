package lesson2;

import java.math.BigDecimal;

public class Task1 {
    private final String bankAccount;
    private final String currency;
    private final BigDecimal amount;

    public Task1(String bankAccount, String currency, BigDecimal amount) {
        this.bankAccount = bankAccount;
        this.currency = currency;
        this.amount = amount;
    }


    public boolean deposit(BigDecimal amountToDeposit){
        amount =  amount.add(amountToDeposit);
        return true;
    }

    public


}
