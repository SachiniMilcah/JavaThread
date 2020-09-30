package mavenpac;

public class App {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
                new Thread(new Runnable() {
                    public void run() {
                        System.err.println("Thread Id:"+ Thread.currentThread().getId());    
                    }
                }).start();
     
                try {
                    int random = (int)(5000 * Math.random() + 0);
                    long start = System.currentTimeMillis();
                
                    Thread.sleep(random);
                    
                    System.out.println("Sleep time = "+(System.currentTimeMillis()-start)+" "+ "ms");

                } catch (InterruptedException ex) {
                         
                }
            }
        }
}
        
