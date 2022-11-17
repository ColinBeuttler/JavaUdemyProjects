import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.Cart;
import models.Item;
import models.Store;

public class Main {
    
    static Cart cart = new Cart();
    
    static Store store = new Store();
    public static void main(String[] args) {

        try{
            loadItems("products.txt");    
            manageItems();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
       

        

    
    }

    /**
     * Name: manageItems
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. Creates an infinite loop:     
     *   •        The user can choose to a) add or b) remove c) checkout.
     *   •          case a: asks for the aisle and item number. Then, adds item to cart.
     *   •          case b: asks for the name. Then, removes item from cart.
     *   •          case c: prints the receipt and closes Scanner.
     *   •        Prints the updated shopping cart.
     */

    public static void manageItems() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\n\t******************************JAVA GROCERS******************************\n");
            System.out.println(store + "\n");    
            System.out.println("Type \na) add \nb) remove \nc) checkout");
            String res = scan.nextLine();

            switch (res) {
                case "a": {
                    System.out.println("Enter the aisle number of the item you want to add.");
                    int aisleNum = scan.hasNextInt() ? scan.nextInt() - 1 : 404;
                    scan.nextLine();
                    System.out.println(" Enter the item number of the item you want to add.");
                    int itemNum = scan.hasNextInt() ? scan.nextInt() - 1 : 404;
                    scan.nextLine();
                    if (aisleNum == 404 || itemNum == 404) {
                        System.out.println("Not a Valid input");
                        continue;
                    }
                    else if (aisleNum < 0 || aisleNum > 6 || itemNum < 0 || itemNum > 6) {
                        System.out.println("Not a Valid input");
                        continue;
                    }

                    Item item = store.getItem(aisleNum, itemNum);
                    if (cart.add(item)) {
                        System.out.println(item.getName() + " was added to your shopping cart.");
                    } else {
                        System.out.println(item.getName() + " is already in your shopping cart.");
                    }
                    break;
                }
                case "b": {
                    if (cart.isEmpty()) {
                        continue;
                    }
                    System.out.println("Which item?");
                    String itemName = scan.nextLine();
                    cart.remove(itemName);
                    break;
                }
                case "c": {
                    if (cart.isEmpty()) {
                        continue;
                    }
                    System.out.println(cart.checkout());
                    scan.close();
                    return;
                }
                default: {
                    continue;
                }
                    
            }
            System.out.println("\n\nSHOPPING CART\n\n" + cart);
            System.out.print("Enter anything to continue: ");
            scan.nextLine();
        }
    }
     
 

    /**
     * Name: loadItems
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   1. loads items from <fileName>.txt.
     *      • while loop runs through every line in <fileName>
     *      • scan.nextLine() picks up the entire line.
     *      • splits each String using the ";" separator.
     *      • splits both fields in each String using the "=" separator.
     *      • Parse each price into a Double.
     *   2. adds all items to the store object's items field.
     */

    public static void loadItems(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        for (int i = 0; scanFile.hasNextLine(); i++) {
            String itemScan = scanFile.nextLine();
            String[] arrOfItems = itemScan.split(";");    
                for (int j = 0; j < arrOfItems.length; j++) {
                String[] fields = arrOfItems[j].split("=");
                store.setItem(i, j, new Item(fields[0], Double.parseDouble(fields[1])));
            } 
            
        }
        scanFile.close();
    }
}
