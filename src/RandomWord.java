import java.util.Random;

public class RandomWord {
    private String[] words = {"father", "family", "infant", "tongue", "explicit", "authority", "tombstone", "blacksmith", "likeness", "photographs", "regarding", "unreasonably", "character", "inscription", "conclusion", "brothers", "exceedingly", "religiously", "ed", "existence"};

    private String chosenWord;
    private Random random = new Random();

    public RandomWord(){
        chosenWord = words[random.nextInt(words.length)];
    }
    public String toString(){
        return chosenWord;
    }
}
