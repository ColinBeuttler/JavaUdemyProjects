import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey.");

        int counter = 0;
        
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nHow much do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow much do you spend on food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name +" for answering all " + counter + " questions.");
        System.out.println("Your food expenses are " + (foodPrice/coffeePrice) + " times more on food than coffee.");
        System.out.println("Weekly you spend $" + (foodAmount*foodPrice) + " on fast food.");
        scan.close();

    }
}
