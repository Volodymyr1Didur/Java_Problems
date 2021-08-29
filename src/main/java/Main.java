public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        System.out.println(model.guessedNumber);
        Controller cont = new Controller(model, view);
        cont.mainProcess();


    }
}