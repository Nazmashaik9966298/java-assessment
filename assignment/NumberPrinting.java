package Assignment;

public class NumberPrinting {
    private int number = 1;
    private final int MAX = 20;

    public void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("Odd Thread: " + number);
                number++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 == 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } else {
                System.out.println("Even Thread: " + number);
                number++;
                notify();
            }
        }
    }
}
class OddEvenThreads {
    public static void main(String[] args) {
        NumberPrinting printing = new NumberPrinting();

        Thread oddThread = new Thread(() -> printing.printOdd());
        Thread evenThread = new Thread(() -> printing.printEven());

        oddThread.start();
        evenThread.start();
    }
}

