public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        System.out.println(model.guessedNumber);
        System.out.println(2*7);
        Controller cont = new Controller(model, view);
        cont.mainProcess();


    }
}