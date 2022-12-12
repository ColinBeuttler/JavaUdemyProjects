package src.main.model.account;

public class Savings extends Account {

    private static final double WITHDRAWAL_FEE = 5.00;

    public Savings(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Savings(Savings source) {
        super(source);
    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        super.setBalance(super.round(super.getBalance() + amount));

    }

    @Override
    public boolean withdraw(double amount) {
        // TODO Auto-generated method stub
        super.setBalance(super.round(super.getBalance() - amount - WITHDRAWAL_FEE));
        return true;
    }

    @Override
    public Account clone() {
        // TODO Auto-generated method stub
        return new Savings(this);
    }

}
