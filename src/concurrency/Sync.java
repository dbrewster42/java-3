// package concurrency;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
// import java.util.concurrent.*;

class Sync extends Thread {
    List<Integer> nums = new ArrayList<Integer>();

    Sync(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int randInt = rand.nextInt(100);
            Integer randInteger = Integer.valueOf(randInt);
            this.nums.add(randInt);
        }
    }

    public static void main(String[] args) {
        Sync syncThread = new Sync("sync thread");
        Sync syncThread2 = new Sync("sync thread 2");
        syncThread.start();
        syncThread2.start();

        try {
            syncThread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Waiting");
        }

        System.out.println(syncThread.nums);
        //this prints out an empty list. write some code that will allow the data generated in the syncThread to show up  here.
        //  There is a brute force way and a more sophisticated way.  Either or will work, but strive for sophistication :)

    }

}