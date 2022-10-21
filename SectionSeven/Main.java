import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.Style;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] { "tires", "keys" }),
                new Car("Dodge", 8500, 2019, "blue", new String[] { "tires", "keys" }),
                new Car("Nissan", 5000, 2017, "yellow", new String[] { "tires", "filter" }),
                new Car("Honda", 7000, 2019, "orange", new String[] { "tires", "filter" }),
                new Car("Mercedes", 12000, 2015, "Jet Black", new String[] { "tires", "filter" }),

        };

        Dealership dealership = new Dealership(cars);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");

        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String make = scan.nextLine();

        System.out.print("Enter your budget: ");
        int budget = scan.nextInt();
        int index = dealership.search(make, budget);

        switch (index) {
            case 404:
                System.out.println("Feel free to browse thorugh our collection");
                System.out.println(dealership);
                break;

            default:
                scan.nextLine();
                String decision = scan.nextLine();
                if (decision.equalsIgnoreCase("yes")) {
                    dealership.sell(index);
                }
        }
    }
}