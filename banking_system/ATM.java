package banking_system;

public class ATM {
    private int currentAccNumber = -1;
    private int currentAccBalance;
    private Bank bank;

    public boolean loginToAccount(int acctNum) {
        try {
            currentAccBalance = bank.accessAcctInfo(acctNum);
            currentAccNumber = acctNum;
        } catch (Exception ex) {
            return false;
        }
        return true;
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
        if (currentAccNumber == -1) {
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
