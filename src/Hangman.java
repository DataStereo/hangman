public class Hangman {
    private boolean running = false;
    private RandomWord word = new RandomWord();

    public void run() {
        do {
            displayWord();
            getUserInput();
            checkUserInput();
        } while (running);
    }

    void checkUserInput() {
        System.out.println("check user input");
    }

    void getUserInput() {
        System.out.println("get user input");
    }

    void displayWord() {
        System.out.println(word);
    }
}
