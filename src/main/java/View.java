public class View {
    public String RIGHT_NUMBER = "You are right! Try to play again!";
    public String NOT_RIGHT_NUMBER_BORDERS_CHANGED = "It is not right number, but borders changed!";
    public String START = "Number is guessed";
    public String LAST_TRY = "Last Try: ";
    public String BORDERS = " Borders of the mystery number: ";
    public String COMMA = ", ";
    public String MORE = "Answer: Secret number is BIGGER";
    public String LESS = "Answer: Secret number is SMALLER";
    public String INPUT_NEW_NUMbER = "Input new number";
    public String WRONG_INPUR_ENTER_INT_NUMBER = "Wrong input, enter int number";
    public String INPUT_NUMBER_IN = "Inputted number not in borders";

    public void inputLastTryAndBorders(int lastTry, int bottomBrd, int topBrg){
        System.out.println("Last Try: " + lastTry + "| Borders of the mystery number: [" + bottomBrd +", "+ topBrg+"]");
    }
    public void printMassage(String massage) {
        System.out.println(massage);
    }


}
