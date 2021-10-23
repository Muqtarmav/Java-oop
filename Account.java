package Assesment;

public class Account {
    private String name;
    private int balance;

    public Account(String name, int balance){
        this.name = name;

        if ( balance > 0.0)
        this.balance = balance;

    }

    public Account() {

    }

    public void setName(String name) {
        this.name = name;
    }
        public String getName(){
            return name;
         }
    public void makeDeposit(int setDeposit){

        if (setDeposit > 0.0)
        balance = balance + setDeposit;
    }

    public int getBalance(){
        return balance;
    }

    public void makeWithdrawal(int setWithdrawal ) {
        if (setWithdrawal <= balance) ;
        balance = balance - setWithdrawal;

    }



}
