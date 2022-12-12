public class MultiThread {

    public static class LongTask implements Runnable {
        @Override
        public void run() {
            longTask();
            // TODO Auto-generated method stub

        }
    }

    public static void main(String[] args) {

        LongTask runnable = new LongTask();
        Thread thread2 = new Thread(runnable);

        thread2.start();

        System.out.println("Doing other work on main thread");

    }

    public static void longTask() {
        long t = System.currentTimeMillis();
        long end = t + 3000;

        while (true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("Finished long task");
                break;
            }
        }
    }

}
