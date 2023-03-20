import java.util.Scanner;

public class Hangman {
    private boolean running = true;
    private RandomWord word = new RandomWord();
    private Scanner scanner = new Scanner(System.in);
    private int triesRemaining = 5;
    private char lastGuess;

    public void run() {
        do {
            displayWord();
            getUserInput();
            checkUserInput();
        } while (running);
    }

    void checkUserInput() {
        boolean isCorrect = word.addGuess(lastGuess);
        if(isCorrect){
            if (word.isCompleate()){
                System.out.println("You have won");
                running = false;
                System.out.println("The word is " + word);
            }
        }else {
            triesRemaining --;
            if(triesRemaining == 0){
                System.out.println("You have lost");
                running = false;
            }
        }
    }

    void getUserInput() {
        System.out.println("Tries remaining " + triesRemaining);
        System.out.print("Enter your guess: ");
        String guess = scanner.nextLine();
        lastGuess = guess.charAt(0);
    }

    void displayWord() {
        System.out.println(word);
    }

    public void close() {
        scanner.close();
    }
}
