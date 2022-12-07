package src.main.model.account;


public class Chequing extends Account{
    
    private static final double OVERDRAFT_FEE = 5.5;
    private static final double OVERDRAFT_LIMIT = 200;

    private static final double TAXABLE_INCOME = 3000;
    private static final double TAX_RATE = 0.15;


    public Chequing(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Chequing(Chequing source) {
        super(source);
    }

    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.getBalance() - amount < OVERDRAFT_LIMIT) {
            return false;
        }
        else if (super.getBalance() - amount < 0) {
            super.setBalance(super.round(super.getBalance() - amount - OVERDRAFT_FEE));
        }
        else {
            super.setBalance(super.round(super.getBalance() - amount));
        }
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public Account clone() {
        // TODO Auto-generated method stub
        return null;
    }

}
