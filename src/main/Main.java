package main;

public class Main {

    public static void main(String[] args) {

        Dice dice = new Dice();
        Marker marker = new Marker();

        Thread t1 = new Thread(new SubThread(dice, marker));
        Thread t2 = new Thread(new SubThread(dice, marker));
        Thread t3 = new Thread(new SubThread(dice, marker));

        startThreaads(t1, t2, t3);

        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e){
            System.out.println("ERROR!");
        }


        marker.showThrows();
        marker.showScore();
    }


    private static void startThreaads(Thread t1, Thread t2, Thread t3) {
        t1.start();
        t2.start();
        t3.start();
    }


}