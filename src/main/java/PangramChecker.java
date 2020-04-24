import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class PangramChecker {

    public boolean isPangram(String input) {

        boolean[] alphaCounter = new boolean[26];
        int index = 0;
        String str = input.toUpperCase();

        for(int i = 0; i < str.length(); i++) {
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
                alphaCounter[index] = true;
            }
        }
        for(int i = 0; i < alphaCounter.length; i++) {
            if(!alphaCounter[i]) {
                return false;
            }
        }
        return true;
    }
}
