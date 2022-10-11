public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};

        int wins = 0;
        int loses = 0;
        /** Task 1 
         * 
         *   Using a for loop:
         *       count Java's wins and store the result in a variable: wins. 
         *       count Java's losses and store the result in a variable: losses.
         *
         * 
         * 
         */

        for (int i = 0; i < record.length; i++) {
            if (record[i].equalsIgnoreCase("win")) {
                wins++;
            }
            else{
                loses++;
            }
         }


        /** Task 2
         * Print:
         *     • \nWith a professional record of <wins> Wins and <losses> losses. 
         *     • He is the pride of oracle: Java Fury!
         *
         * 
         */        

         System.out.println("\nWith a professional record of " + wins + " and " + loses + " losses. ");
         System.out.println("He is the pride of oracle: Java Fury!");

    }
}
