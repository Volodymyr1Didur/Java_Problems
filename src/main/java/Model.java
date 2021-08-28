import java.util.Random;

public class Model {
    public int sysCondition = 1;
    public String s = "";
    public int bottomBrd = 0;
    public int topBrd = 100;
    public Random rand = new Random();
    public final int guessedNumber = rand.nextInt(100);
    public int lastTry;

    public int newAttempt(int number){
        if(guessedNumber == number) return 0;
        else{
            if(number>guessedNumber){topBrd = number; lastTry=number; s=s+"ATTEMPT = " + String.valueOf(number)+" ANSWER = MORE"+'\n';return 1;}
            else{bottomBrd = number; lastTry = number;s=s+"ATTEMPT = " + String.valueOf(number)+" ANSWER = MORE"+'\n'; return 2;}
        }
    }

}

