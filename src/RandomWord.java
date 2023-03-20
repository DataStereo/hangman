import java.util.Random;

public class RandomWord {
    private String[] words = {"father", "family", "infant", "tongue", "explicit", "authority", "tombstone", "blacksmith", "likeness", "photographs", "regarding", "unreasonably", "character", "inscription", "conclusion", "brothers", "exceedingly", "religiously", "ed", "existence"};

    private String chosenWord;
    private Random random = new Random();
    private char[] characters;

    public RandomWord(){
        chosenWord = words[random.nextInt(words.length)];
        characters = new char[chosenWord.length()];
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(char c: characters){
            sb.append(c=='\u0000' ? '_': c);
            sb.append(' ');
        }
        return sb.toString();
    }
}
