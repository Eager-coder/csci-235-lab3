package banking_system;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Account> allAccounts = new ArrayList<Account>();
    List<ATM> allATMs = new ArrayList<ATM>();

    public int createAccount() {
        Account newAccount = new Account();
        allAccounts.add(newAccount);
        return newAccount.getNumber();
    }

    public void attachATM(ATM atm) {
        allATMs.add(atm);
    }

    public int accessAcctInfo(int acctNum) throws Exception{

        for (Account account: allAccounts) {
            if (account.getNumber() == acctNum){
                return account.getBalance();
            }
        }
        throw new Exception("No account found with that account number");
    }

    public void updateAcctBal(int acctNum, int diff)throws Exception {
        for (Account account: allAccounts) {
            if (account.getNumber() == acctNum){

                int total = account.getBalance() + diff;

                if (total < 0){
                    throw new Exception("The balance cannot be negative");
                } else {
                    account.updateAccountBalance(total);
                }
            }
        }
        throw new Exception("No account found with that account number");

    }
}
