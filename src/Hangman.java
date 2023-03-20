import java.util.Scanner;

public class Hangman {
    private boolean running = true;
    private RandomWord word = new RandomWord();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        do {
            displayWord();
            getUserInput();
            checkUserInput();
        } while (running);
    }

    void checkUserInput() {
        if (word.isCompleate()){
            System.out.println("You have won");
            running = false;
            System.out.println("The word is " + word);
        }
    }

    void getUserInput() {
        System.out.print("Enter your guess: ");
        String guess = scanner.nextLine();
        word.addGuess(guess.charAt(0));
    }

    void displayWord() {
        System.out.println(word);
    }

    public void close() {
        scanner.close();
    }
}
