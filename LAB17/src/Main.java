public class Main {
    public static void main(String[] args) {
    Account account1 = new Account();
    System.out.println(account1.toString());
    Account account2 = new Account(1111102,20.0);
    account2.deposit(200);
    account2.withdraw(30000);
    System.out.println(account2.toString());
    CheckingAccount account3 = new CheckingAccount(11223,350,500);
    account3.withdraw(850);
    System.out.println(account3.toString());

    //part2
        StackOfObjects stack1=new StackOfObjects();
        stack1.push("Yerr");
        stack1.push("hurd");
        stack1.push("cut it");
        stack1.pop();
        stack1.printOut();


    }
}
