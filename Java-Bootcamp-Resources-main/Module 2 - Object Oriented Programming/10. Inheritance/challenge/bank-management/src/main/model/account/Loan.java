package src.main.model.account;

public class Loan extends Account {

    private static final double MAX_DEBT = 10000;
    private static final double INTEREST_RATE = 0.02;

    public Loan(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Loan(Loan source) {
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
