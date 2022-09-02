package banking_system;

import java.util.ArrayList;


public class Bank {

    ArrayList<Account> allAccounts = new ArrayList<Account>();
    ArrayList<ATM> allATMs = new ArrayList<ATM>();

    public int createAccount() {
        Account newAccount = new Account(this.allAccounts.size());
        allAccounts.add(newAccount);
        return newAccount.number;
    }

    public void attachATM(ATM atm) {
        allATMs.add(atm);
    }

    public int accessAcctInfo(int acctNum) throws Exception {

        for (Account account : allAccounts) {
            if (account.number == acctNum) {
                return account.balance;
            }
        }
        throw new Exception("No account found with that account number");
    }

    public void updateAcctBal(int acctNum, int diff) throws Exception {
        for (Account account : allAccounts) {
            if (account.number == acctNum) {

                int total = account.balance + diff;

                if (total < 0) {
                    throw new Exception("The balance cannot be negative");
                } else {
                    account.updateAccountBalance(total);
                }
            }
        }
        throw new Exception("No account found with that account number");

    }
}
