import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import javax.sound.sampled.Line;

public class Main {
 
    static String[] files = new String[] { "data/sales1.csv", "data/sales2.csv", "data/sales3.csv"};

    static AtomicInteger sampleSize = new AtomicInteger(0);
    static AtomicInteger quantitySold = new AtomicInteger(0);


    public static void main(String[] args) throws Exception {

        
        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executor = Executors.newFixedThreadPool(3);
        // execute tasks here

        for (String string : files) {
            executor.submit(() -> increment(string, latch));
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name to access the Global Superstore data: ");
        String name = scan.nextLine();
        System.out.println("\nThank you " + name + ".\n");
        scan.close();

        latch.await();
        executor.shutdown();

        System.out.println("Sample size" + sampleSize);
        System.out.println("Quantity Sold" + quantitySold);
    }
    
    public static void increment(String file, CountDownLatch latch) {
        try{
            Paths.get(Thread.currentThread().getContextClassLoader().getResource(file).toURI());
            Files.lines(path)
            .skip(1)
            .mapToInt((Line) -> Integer.parseInt(line.split(",")[2])) 
                    .forEach((quantity) -> {
                        sampleSize.addAndGet(1);
                        quantitySold.addAndGet(1);
            });
        }
        catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }
        catch(IOException e ){
            System.out.println(e.getMessage());
        }
        latch.countDown();
        
    }

}
