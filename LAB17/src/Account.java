public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(){
        this.id=0;
        this.balance=1000;
        this.annualInterestRate=4.50;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 4.50;
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public Account(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate/12;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double deduct){
        if(this.balance<deduct){
            System.out.println("Insufficient funds");
        }else {
            this.balance-=deduct;
        }
    }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;

    }

    @Override
    public String toString(){
        return "Account id: "+this.id+" has a balance of "+this.balance+" with a annual interest rate of "+this.annualInterestRate;
    }



}
