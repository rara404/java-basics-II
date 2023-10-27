public abstract class Account {
    protected double balance;
    protected String account_Holder;

    public Account(double balance, String accountHolder) {
        this.balance = balance;
        this.account_Holder = accountHolder;
    }

    public abstract boolean withdraw(double amount);
}