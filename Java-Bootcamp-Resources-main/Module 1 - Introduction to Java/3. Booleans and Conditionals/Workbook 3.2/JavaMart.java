public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        //if you have enough money
            //       print: Sure!
            //       pay for the toy car 

        //else:  Sorry, I only have <wallet> left.

        if(wallet>=toyCar){
            System.out.println("Yes, I can buy the Toycar.");
            wallet = (wallet-toyCar);
        }
        else{
            System.out.println("Sorry, I only have " + wallet + " left.");
        }

        
        double nike = 95.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");
        //if you have enough money
            //       print: Sure!
            //       pay for the nike shoes 

        //else: Sorry, I only have <wallet> left.
        if (wallet>= nike){
            System.out.println("Sure!");
            wallet = (wallet-nike);
        }
        else{
            System.out.println("Sorry, I only have " + wallet + " left.");
        }

    }
}