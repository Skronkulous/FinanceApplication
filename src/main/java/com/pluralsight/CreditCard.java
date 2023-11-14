package com.pluralsight;

public class CreditCard implements Valuble{
    String name, cardNumber;
    double balance;

    public CreditCard(String name, String cardNumber, double balance) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void charge(double chargeTotal){
        balance -= chargeTotal;
    }

    public void pay(double payTotal){

    }
    public double getValue(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
