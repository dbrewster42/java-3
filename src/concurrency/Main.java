// package concurrency;

public class Main {

    public static void main(String[] args) {
        //run all of your threads from this main class.

        Reasoning t1 = new Reasoning();
        t1.start();
        TeamTC1 t2 = new TeamTC1();
        Thread thread = new Thread(t2);
        thread.run();

    }
}