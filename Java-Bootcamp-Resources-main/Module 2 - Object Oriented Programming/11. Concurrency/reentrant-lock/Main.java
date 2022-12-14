import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    
    static int counter = 0;
    
    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(11);
        ReentrantLock lock = new ReentrantLock();

        int nThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(nThreads);

        for (int i = 0; i < 11; i++) {
            executor.submit(() -> task(lock, latch));
        }
        

        try{
            latch.await();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            executor.shutdown();
        }

    }
    
    public static void task(ReentrantLock lock, CountDownLatch latch) {
        //some really long operations that need to run in the background...
        for (int i = 0; i < 10000; i++) {
            lock.lock();
            counter++; // there happens to be a line that updates the counter variable. 
            lock.unlock();
        }
        //more really long operations...
    }
  
}
