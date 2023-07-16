import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numeronyms {
     public static String numeronym(String word) {
        char start = word.charAt(0);
        int wordlen = word.length();
        char end = word.charAt(wordlen - 1);

        if (wordlen <= 4) {
            return word;
        } else {
            return start + Integer.toString(word.length() - 2) + end;
        }
        //return word.length() <= 4 ? word : word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter your word");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        //System.out.println(numeronym("international"));
        System.out.println(numeronym(word));
    }
}
