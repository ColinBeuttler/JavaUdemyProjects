import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        
         Item[][] items = new Item[][] {
                 { new Item("Pepsi", 1.99, 3), new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2), new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
         { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
         };
        
         Machine machine = new Machine(items);
         
         System.out.print(machine);

         while(true){
             System.out.print("\nPick a row: ");
         
         // pick up row. 
         int row = scan.nextInt();

         System.out.print("\nPick a spot in the row: ");

         // pick up spot.
         int spot = scan.nextInt();
        
         if (machine.dispense(row, spot)) {
            System.out.print("\n" + machine);
         System.out.println("\nEnjoy your drink. Press 1 to pick another");
         }
         else {
            System.out.print("\nSorry, we're out of this item. Press 1 to purchase another: ");
         }   
         
         int answer = scan.nextInt();
         if (answer != 1) {
             break;
         }

         }
        

    }
}
