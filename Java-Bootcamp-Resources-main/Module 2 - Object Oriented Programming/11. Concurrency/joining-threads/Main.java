import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {

    static double[] targets = new double[] { 0.5, 0.8, 0.3 };
    static final double TARGET = 0.5;
    static final double PRECISION = 0.000000001;

    static double result = 0;

    public static void main(String[] args) {

        //call generateNumber here...
        Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<Double> future = executor.submit(() -> generateNumber(0));
        Future<Double> future2 = executor.submit(() -> generateNumber(1));
        Future<Double> future3 = executor.submit(() -> generateNumber(2));
        
      
        //calculate precision level here...
    

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name to generate a number: ");
        scan.nextLine();
        scan.close();

        try {
            future.get();
            future2.get();
            future3.get();
           executor.shutdown();
        }
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Finished running background operations");
        System.out.println("The value was generated to a precision of : " + precision);
    }

    /**
     * Function name: generateNumber
     * @return double
     * 
     * Inside the function:
     *   1. Generates a number close to the TARGET to a precision of PRECISION.
     * 
     */


    public static double generateNumber(int index) {
        double number = Math.random();
        double difference = difference(number, index);
        while (difference > PRECISION) {
            number = Math.random();
            difference = difference(number, index);
        }
        return number;
    }
     
    public static double difference(double number, int index) {
        return Math.abs(targets[index] - number);
    }
}
