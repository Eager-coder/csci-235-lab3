package outside;

import banking_system.ATM;
import banking_system.Bank;

public class Customer {
    Bank bank;
    ATM atm;

    int accountNumber;

    public Customer(Bank bank, ATM atm) {
        this.bank = bank;
        this.atm = atm;
    }

    public void openAccount() {
        this.accountNumber = bank.createAccount();
    }

    public void depositMoney(int amount) {
        atm.loginToAccount(accountNumber);
        atm.deposit(amount);
        atm.logout();
    }

    public void withdrawMoney(int amount) {
        atm.loginToAccount(accountNumber);
        atm.withdraw(amount);
        atm.logout();
    }

    public int checkBalance() {
        atm.loginToAccount(accountNumber);
        int currentBalance = atm.getBalance();
        atm.logout();
        return currentBalance;
    }
}
