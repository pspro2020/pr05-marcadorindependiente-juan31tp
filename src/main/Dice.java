package main;

import java.util.Random;

public class Dice {

    public int throwDice(){
        Random rnd=new Random();
        return rnd.nextInt(6)+1;
    }

}