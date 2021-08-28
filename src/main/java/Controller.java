import java.util.Scanner;

public class Controller {
    private Model model = new Model();
    private View view = new View();
    public Controller(Model model, View view ){
        this.model = model;
        this.view =view;
    }
    public void Start(){
        view.printMassage(view.START);
    }


    public void mainProcess(){
        checkTheConditionCondition(model.newAttempt(inputNewNumber2Filt(inputNewNumber1Filt())));
    }
    public int inputNewNumber1Filt() {
        Scanner sc = new Scanner(System.in);
        view.printMassage(view.INPUT_NEW_NUMbER);
        while (!sc.hasNextInt()) {
            this.view.printMassage(view.WRONG_INPUR_ENTER_INT_NUMBER);
            sc.next();
        }
        int value = sc.nextInt();
        return value;
    }

    public int inputNewNumber2Filt(int value) {
        if (value < model.bottomBrd || value > model.topBrd) {
            this.view.printMassageNotLn(view.INPUT_NUMBER_IN+" ");
            return inputNewNumber2Filt(inputNewNumber1Filt());
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
            if(cond==1) {
                view.printMassage(view.NOT_RIGHT_NUMBER_BORDERS_CHANGED);
                view.printMassage(view.LESS);
                view.inputLastTryAndBorders(model.lastTry, model.bottomBrd, model.topBrd);
                view.printMassage(view.PREVIOUS);
                view.printMassage(model.s);
            }
            else{
                view.printMassage(view.NOT_RIGHT_NUMBER_BORDERS_CHANGED);
                view.printMassage(view.MORE);
                view.inputLastTryAndBorders(model.lastTry, model.bottomBrd, model.topBrd);
                view.printMassage(view.PREVIOUS);
                view.printMassage(model.s);

            }
            mainProcess();
        }
    }
}

