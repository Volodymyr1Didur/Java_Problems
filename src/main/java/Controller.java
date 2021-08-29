import java.util.Scanner;

public class Controller {
    private Model model = new Model();
    private View view = new View();

    public Controller(Model model, View view ){
        this.model = model;
        this.view =view;
    }

    public void start(){
        this.view.printMassage(view.START);
        model.secretValue();
    }

    public void mainProcess(){
        checkTheConditionCondition(model.newAttempt(inputNewNumber2Filter(inputNewNumber1Filter())));
    }

    public int inputNewNumber1Filter() {
        Scanner sc = new Scanner(System.in);
        this.view.printMassage(view.INPUT_NEW_NUMbER);
        while (!sc.hasNextInt()) {
            this.view.printMassage(view.WRONG_INPUR_ENTER_INT_NUMBER);
            sc.next();
        }
        int value = sc.nextInt();
        return value;
    }

    public int inputNewNumber2Filter(int value) {
        if (value < model.getBottomBrd() || value > model.getTopBrd()) {
            this.view.printMassage(view.INPUT_NUMBER_IN+": ["+model.getBottomBrd()+", "+model.getTopBrd()+"]");
            return inputNewNumber2Filter(inputNewNumber1Filter());
        }
        else{
            return value;
        }
    }

    public void checkTheConditionCondition(int cond){
        if(cond==0){
            this.view.printMassage(view.RIGHT_NUMBER);
        }
        else{
            this.view.printMassage(view.NOT_RIGHT_NUMBER_BORDERS_CHANGED);
            if(cond==1) {
                this.view.printMassage(view.LESS);
            }
            else{
                this.view.printMassage(view.MORE);
            }
            this.view.inputLastTryAndBorders(model.getLastTry(), model.getBottomBrd(), model.getTopBrd());
            this.view.printMassage(model.getPreviousAttempts());
            mainProcess();
        }
    }
}

