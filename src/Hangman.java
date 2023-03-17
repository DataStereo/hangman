public class Hangman {

    private boolean running = true;
    public void run() {
        do {
            displayWord();
            getUserInput();
            checkUserInput();
        }while (running);
    }

    void displayWord(){
        System.out.println("display word");
    }

    void getUserInput(){
        System.out.println("get user input");
    }

    void checkUserInput(){
        System.out.println("check user input");
    }
}
