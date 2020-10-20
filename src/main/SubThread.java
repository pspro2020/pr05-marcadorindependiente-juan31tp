package main;

public class SubThread implements Runnable{

    private Dice dice;
    private Marker marker;

    public SubThread(Dice dice, Marker marker){
        this.dice=dice;
        this.marker= marker;
    }

    @Override
    public void run(){
        for (int i=0; i<10000; i++){
            marker.updateScore(dice.throwDice());
        }
    }
}