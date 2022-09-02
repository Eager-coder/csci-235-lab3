package banking_system;

public class Account {
    protected int number;
    protected int balance;

    public Account(int number){
        this.number = number;
        this.balance = 0;
    }

    public  void updateAccountBalance(int newBalance){
        this.balance = newBalance;
    }

}
