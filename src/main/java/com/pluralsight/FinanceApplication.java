package com.pluralsight;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", 12345, 12500);
        Valuble account2 = new BankAccount("Gary", 456789, 1500);

        System.out.println("Account 1 Total: $" + account1.getBalance());
        System.out.println("Account 2 Total: $" + ((BankAccount)(account2)).getBalance());

        account1.deposit(100);
        ((BankAccount)(account2)).deposit(1000);

        System.out.println("Account 1 Total: $" + account1.getBalance());
        System.out.println("Account 2 Total: $" + ((BankAccount)(account2)).getBalance());
    }
}
