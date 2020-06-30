
// package concurrency;
// import java.util.concurrent.*;
import java.util.ArrayList;

class TeamTC1 implements Runnable {

    ArrayList<String> team = new ArrayList<>();

    // @Override
    public void run() {
        team.add("Emilios");
        team.add("Devon");
        team.add("Abigail");
        team.add("Adam");
        team.add("Christian");
        team.add("Jose");
        team.add("Julian");
        team.add("Monica");
        team.add("Phoenix");
        team.add("Gabe");
        team.add("Michael");

        for (String i : team) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("waiting...");
            }
            System.out.println(i);
        }
    }

    //This thread should be created by implementing the Runnable interface, NOT by extending the Thread class.
    //  In the run method of this thread, print out the name of each student in your TA group, (starting with your TA).
    //  There should be a pause of 1 second before each name is printed to the console.The name should then be pushed to
    // the team List  After all the names have been pushed to this List, print out the entire list of all the students in
    // your TA group. Don't forget your TA as well!  All of these steps should be done whenever the thread is started.
    // (i.e. it can be done directly in the run()method of the thread itself).  Kick off the thread in the Main class of the concurrency package.  
}