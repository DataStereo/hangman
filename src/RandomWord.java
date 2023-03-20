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

    public boolean isCompleate(){
        for (char c: characters){
            if(c == '\u0000'){
                return false;
            }
        }
        return true;
    }

    public void addGuess(char c) {
        // Fill in c in character array
        for(int i = 0; i < chosenWord.length(); i++){
            if(c == chosenWord.charAt(i)){
                characters[i] = c;
            }
        }
    }
}
