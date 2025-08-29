public class Bank {
    private int balance=100000;
    public void withdraw(int amt){
        if(amt>balance){
            throw new InsufficientBalanceException("Cannot withdraw amount more than balance");
        }
        else{
            balance-=amt;
            System.out.println("Withdraw succesfull, remaining balance:"+balance);
        }
    }
}
