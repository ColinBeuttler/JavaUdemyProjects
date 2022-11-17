package main;



public class Main {
    
    static double[] prices = new double[] {2.23, 1.32, 4.32, 11.33};

    public static void main(String[] args) {

    }
    
    public static double getSubTotal() {
        double temp = 0;
        for (int i = 0; i < prices.length; i++) {
            temp += prices[i];
        }
        return temp;
    }

    public static double getTax(double subtotal){
        return subtotal * 0.13;
    }

}
