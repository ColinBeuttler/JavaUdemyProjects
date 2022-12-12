package src.main.model.account;

public class Savings extends Account {

    private static final double WITHDRAWAL_FEE = 0.05;

    public Savings(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Savings(Savings source) {
        super(source);
    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean withdraw(double amount) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Account clone() {
        // TODO Auto-generated method stub
        return null;
    }

}
