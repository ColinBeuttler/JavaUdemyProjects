import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        double[][] twoDFoodarr = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };
        // Task 2 - Populate your 2D array with values from the table (see article)
        // twoDFoodarr[0][0] = 12.99;
        // twoDFoodarr[0][1] = 8.99;
        // twoDFoodarr[0][2] = 9.99;
        // twoDFoodarr[0][3] = 10.49;
        // twoDFoodarr[0][4] = 11.99;

        // twoDFoodarr[1][0] = 0.99;
        // twoDFoodarr[1][1] = 1.99;
        // twoDFoodarr[1][2] = 2.49;
        // twoDFoodarr[1][3] = 1.49;
        // twoDFoodarr[1][4] = 2.99;

        // twoDFoodarr[2][0] = 8.99;
        // twoDFoodarr[2][1] = 7.99;
        // twoDFoodarr[2][2] = 9.49;
        // twoDFoodarr[2][3] = 9.99;
        // twoDFoodarr[2][4] = 10.99;


        // Task 3 - Print the prices for each department. See the article for the expected output.  

        for (int i = 0; i < twoDFoodarr.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("\nBaking: ");
                    break;
                case 1:
                    System.out.print("\nBeverages: ");
                    break;
                case 2:
                    System.out.print("\nCereals: ");
                    break;
            }
            for(int j= 0; j < twoDFoodarr[i].length; j++){
                System.out.print(twoDFoodarr[i][j] + " ");
            }
        }
       }

    }