package Assignment;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class HasMapVSConcurrentHashMap {
    private static Map<Integer, String> hashMap = new HashMap<>();
    private static Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
    public static void main(String[] args) throws InterruptedException {
        System.out.println("---- Using HashMap (Not Thread-Safe) ----");
        Runnable hashMapTask = () -> {
            for (int i = 0; i < 5; i++) {
                hashMap.put(i, Thread.currentThread().getName() + "-" + i);
                System.out.println(Thread.currentThread().getName() + " inserted: " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Thread t1 = new Thread(hashMapTask, "Thread-1");
        Thread t2 = new Thread(hashMapTask, "Thread-2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final HashMap content: " + hashMap);
        System.out.println("\n---- Using ConcurrentHashMap (Thread-Safe) ----");
        Runnable concurrentMapTask = () -> {
            for (int i = 0; i < 5; i++) {
                concurrentMap.put(i, Thread.currentThread().getName() + "-" + i);
                System.out.println(Thread.currentThread().getName() + " inserted: " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Thread t3 = new Thread(concurrentMapTask, "Thread-3");
        Thread t4 = new Thread(concurrentMapTask, "Thread-4");
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("Final ConcurrentHashMap content: " + concurrentMap);
    }
}
