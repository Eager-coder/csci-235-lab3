package banking_system;

public class ATM {
    private int currentAccNumber;
    private int currentAccBalance;
    private Bank bank;

    public boolean loginToAccount(int acctNum) {
        try {
            currentAccBalance = bank.accessAcctInfo(acctNum);
            currentAccNumber = acctNum;
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean deposit(int amount) {
        if (currentAccNumber == 0) {
            return false;
        }
        try {
            bank.updateAcctBal(currentAccNumber, currentAccBalance + amount);
        } catch (Exception ex) {
            return false;
        }
        currentAccBalance = currentAccBalance + amount;
        System.out.println("Current balance in atm " + currentAccBalance);
        return true;
    }

    public boolean withdraw(int amount) {
        if (currentAccNumber == 0) {
            return false;
        }
        try {
            bank.updateAcctBal(currentAccNumber, currentAccBalance - amount);

        } catch (Exception ex) {
            return false;
        }
        currentAccBalance = currentAccBalance - amount;
        return true;
    }

    public int getBalance() {
        return currentAccBalance;
    }

    public void logout() {
        currentAccNumber = 0;
        currentAccBalance = 0;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
