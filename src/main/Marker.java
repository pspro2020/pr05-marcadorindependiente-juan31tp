package main;

public class Marker {

    private int n1=0, n2=0, n3=0, n4=0, n5=0, n6=0;

    public void updateScore(int diceResult) {
        switch (diceResult){
            case 1:
                n1++;
                break;
            case 2:
                n2++;
                break;
            case 3:
                n3++;
                break;
            case 4:
                n4++;
                break;
            case 5:
                n5++;
                break;
            case 6:
                n6++;
                break;
        }
    }

    public void showThrows() {
        System.out.println( "Number one appeared " + getN1() + " times\n" +
                "Number two appeared " + getN2() + " times\n" +
                "Number three appeared " + getN3() + " times\n" +
                "Number four appeared " + getN4() + " times\n" +
                "Number five appeared " + getN5() + " times\n" +
                "Number six appeared " + getN6() + " times\n\n" +
                "Total throws: " + sumThrows());
    }

    private int sumThrows() {
        return getN1()+getN2()+getN3()+getN4()+getN5()+getN6();
    }

    public void showScore() {
        System.out.println( "Total score of face 1: " + getTotalN1() + "\n" +
                "Total score of face 2: " + getTotalN2() + "\n" +
                "Total score of face 3: " + getTotalN3() + " times\n" +
                "Total score of face 4: " + getTotalN4() + " times\n" +
                "Total score of face 5: " + getTotalN5() + " times\n" +
                "Total score of face 6: " + getTotalN6() + " times\n\n" +
                "Total score: " + sumScore());
    }

    private int sumScore() {
        return getTotalN1()+getTotalN2()+getN3()+getTotalN4()+getTotalN5()+getTotalN6();
    }

    public int getTotalN1(){
        return getN1();
    }

    public int getTotalN2(){
        return getN2()*2;
    }

    public int getTotalN3(){
        return getN3()*3;
    }

    public int getTotalN4(){
        return getN4()*4;
    }

    public int getTotalN5(){
        return getN5()*5;
    }

    public int getTotalN6(){
        return getN6()*6;
    }


    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getN3() {
        return n3;
    }

    public int getN4() {
        return n4;
    }

    public int getN5() {
        return n5;
    }

    public int getN6() {
        return n6;
    }
}
