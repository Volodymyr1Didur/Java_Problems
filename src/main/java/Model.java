import java.util.Random;

public class Model {
    public String previousAttempts = "Previous attempts:";
    public int bottomBrd = 0;
    public int topBrd = 100;
    public Random rand = new Random();
    public final int guessedNumber = rand.nextInt(100);
    public int lastTry;

    public int newAttempt(int number){
        if(guessedNumber == number) return 0;
        else{
            if(number>guessedNumber){topBrd = number; lastTry=number; previousAttempts=previousAttempts+'\n'+"ATTEMPT = " + String.valueOf(number)+" ANSWER = Secret number is SMALLER";return 1;}
            else{bottomBrd = number; lastTry = number;previousAttempts=previousAttempts+'\n'+"ATTEMPT = " + String.valueOf(number)+" ANSWER = Secret number is BIGGER"; return 2;}
        }
    }
    public int getGuessedNumber() {
        return this.guessedNumber;
    }

    public int getBottomBrd() {
        return this.bottomBrd;
    }

    public int getTopBrd() {return this.topBrd;}

    public String getPreviousAttempts(){return previousAttempts;}

    public int getLastTry(){return lastTry;}

}

