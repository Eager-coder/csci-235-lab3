package outside;

import banking_system.ATM;
import banking_system.Bank;

public class Tester {
    public static void main(String[] args){
        Bank myBank = new Bank();
        ATM myAtm = new ATM();
        myAtm.setBank(myBank);
        myBank.attachATM(myAtm);

        Customer myCustomer = new Customer(myBank, myAtm);
        myCustomer.openAccount();

        myCustomer.depositMoney(5000);
        System.out.println("Balance is " + myCustomer.checkBalance());
    }
}
