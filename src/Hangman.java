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
        // Ask user to enter a character
        // Get a character as a string
        // Pass the character to a random word as the argument to method
        System.out.print("Enter your guess: ");
        String guess = scanner.nextLine();
        word.addGuess(guess.charAt(0));
    }

    void getUserInput() {
        System.out.println("get user input");
    }

    void displayWord() {
        System.out.println(word);
    }
}
