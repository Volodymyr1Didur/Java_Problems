import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.Random;

public class ModelTest {

    Model model = new Model();
    Random rand = new Random();


    @Test
    public void secretValue() {
        model.secretValue();
        for(int i=1; i<100;i++){
            for(int j=0;j<1000;j++){
                if(model.getGuessedNumber() == j){
                    break;
                }
                else if(j==999){
                    Assert.fail();
                }
            }
        }
        Assert.assertEquals(1,1);
    }

    @Test
    public void newAttempt() {
        model.setSecretValue(45);
        Assert.assertEquals(model.newAttempt(1), 2);
        Assert.assertEquals(model.newAttempt(46), 1);
        Assert.assertEquals(model.newAttempt(45), 0);
    }

    @Test
    public void getGuessedNumber() {
        model.secretValue();
        Assert.assertEquals(model.getGuessedNumber(), model.guessedNumber);
    }

    @Test
    public void getBottomBrd() {
        Assert.assertEquals(model.getBottomBrd(), 0);

        int newBottomBrd = rand.nextInt(99);
        model.setBottomBrd(newBottomBrd);
        Assert.assertEquals(model.getBottomBrd(), newBottomBrd);
    }

    @Test
    public void getTopBrd() {
        Assert.assertEquals(model.getTopBrd(), 100);
        int newTopBrd = rand.nextInt(100);
        model.setTopBrd(newTopBrd);
        Assert.assertEquals(model.getTopBrd(), newTopBrd);
    }

    @Test
    public void getLastTry() {
        int newLastTry = rand.nextInt(100);
        model.setLastTry(newLastTry);
        Assert.assertEquals(model.getLastTry(), newLastTry);
    }
}