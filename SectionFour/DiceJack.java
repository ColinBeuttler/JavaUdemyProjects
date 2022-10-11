import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("\nEnter three numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("\nNumbers cannot be less than 1");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("\nnumbers cannot be larger than 6");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDice = roll1 + roll2 + roll3;

        System.out.println("\nDice Sum = " + sumOfDice + ". Number sum = " + sumOfNumbers + ".");

        if (checkWin(sumOfDice, sumOfNumbers)) {
            System.out.println("\nCongratz you Won!!");
        } else {
            System.out.println("\nyOu lOSt, SoO SAd");
        }

        scan.close();

    }

    public static int rollDice() {
        double randomNum = (Math.random() * 6) + 1;
        return (int) randomNum;
    }

    public static boolean checkWin(int sumOfDice, int sumOfNumbers) {
        return (sumOfNumbers > sumOfDice && sumOfNumbers - sumOfDice < 3);

    };
}