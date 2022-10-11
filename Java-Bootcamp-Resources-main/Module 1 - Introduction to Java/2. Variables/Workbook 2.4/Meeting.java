public class Meeting {
    public static void main(String[] args) {
        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        int truSales = (int)sales;
        int truProfit = (int)profit;
        int truRefunds = (int)refunds;
        int truShipping = (int)shipping;

        System.out.println("This month, we made $"+(truSales)+" in sales");
        System.out.println("Factoring in costs, we made $"+(truProfit)+" in profit");
        System.out.println("The refunds are at a low $"+(truRefunds)+" This is a good sign!." );
        System.out.println("Shipping costs were high. We paid $"+(truShipping)+" in shipping");


    }
}