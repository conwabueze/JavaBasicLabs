public class CheckingAccount extends Account {
    private double overDraftlimit;

    public CheckingAccount(double overDraftlimit) {
        this.overDraftlimit = overDraftlimit;
    }

    public CheckingAccount(int id, double balance, double overDraftlimit) {
        super(id, balance);
        this.overDraftlimit = overDraftlimit;
    }

    public CheckingAccount(int id, double balance, double annualInterestRate, double overDraftlimit) {
        super(id, balance, annualInterestRate);
        this.overDraftlimit = overDraftlimit;
    }

    public CheckingAccount(int id, double overDraftlimit) {
        super(id);
        this.overDraftlimit = overDraftlimit;
    }

    public double getOverDraftlimit() {
        return overDraftlimit;
    }

    public void setOverDraftlimit(double overDraftlimit) {
        this.overDraftlimit = overDraftlimit;
    }

    @Override
    public void withdraw(double deduct){
        double limit = getBalance()+overDraftlimit;
        if(limit<deduct){
            System.out.println("Insufficient funds");
        }else {
            limit-=deduct;
            setBalance(limit);
        }
    }

    @Override
    public String toString(){
       return super.toString() +" with a overdraft limit of "+ overDraftlimit;
    }



}
