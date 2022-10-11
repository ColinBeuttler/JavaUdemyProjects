public class WhileLoops {
    public static void main(String[] args) {
        // int number = 25;

        double choice = 0.01;
        double guess = 0.99;

        while (guess > choice) {
            guess = Math.random();
            System.out.println(guess);
        }

        // for (int i = 25; i <= 30; i++) {
        //     System.out.println(i);
        // }

        // while (number <= 30) {
        //     System.out.println(number);
        //     number++;
        // }
    }
}
