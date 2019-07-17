package concurrency;

/**
 * https://leetcode.com/problems/print-in-order/
 */
public class PrintOrder {

    boolean isSecondPrint = false;
    boolean isFirstPrint = false;

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        isFirstPrint = true;

    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        while (!isFirstPrint) {
            Thread.sleep(1);
        }
        printSecond.run();
        isSecondPrint = true;

    }


    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        while (!isSecondPrint) {
            Thread.sleep(1);
        }
        printThird.run();

    }
}
