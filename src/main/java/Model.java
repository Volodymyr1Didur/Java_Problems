import java.util.Random;

public class Model {
    public String previousAttempts = "Previous attempts:";
    public int bottomBrd = 0;
    public int topBrd = 100;
    public Random rand = new Random();
    public int guessedNumber = rand.nextInt(100);
    public int lastTry;

    public void secretValue(){
        Random rand = new Random();
        guessedNumber = rand.nextInt(100);
    }

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

    public void setBottomBrd(int bottomBrd){
        this.bottomBrd = bottomBrd;
    }
    public void setTopBrd(int topBrd) {
        this.topBrd = topBrd;
    }
    public void setLastTry(int lastTry){
        this.lastTry = lastTry;
    }
    public void setSecretValue(int secretValue){
        this.guessedNumber = secretValue;
    }


}

