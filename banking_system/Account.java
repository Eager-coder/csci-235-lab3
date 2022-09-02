package banking_system;

public class Account {
    private int number;
    private int balance;

    public Account(){
        this.number = 12345;
        this.balance = 0;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }
    public  void updateAccountBalance(int newBalance){
        this.balance = newBalance;
    }

}
