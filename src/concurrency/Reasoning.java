// package concurrency;

class Reasoning extends Thread {
    //set up this class so it can become a valid thread. 
    @Override
    public void run() {
        distinguish();
        //print to the console the difference between a thread and a process
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.

    }

    void distinguish() {
        System.out.println(
                "A thread is a subset of a process. So a multi-threaded program in execution would be a process");
        System.out.println(
                "You would get an error if you called the run() method because no new Thread would be created");
    }
}
