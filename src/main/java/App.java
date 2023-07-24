import java.util.*;

public class App {

    public static void main(String[] args) {

        List<String> missingWords = findMissingStrings("I am a hackerrank noob", "am a noob");

        System.out.println(missingWords);

        missingWords = findMissingStrings("Testing this method", "this");

        System.out.println(missingWords);
    }

    public static List<String> findMissingStrings(String s, String t) {
        List<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
        List<String> exisitng = Arrays.asList(t.split(" " ));

        for (int i = 0; i < exisitng.size(); i++) {
            words.remove(exisitng.get(i));
        }

        return words;
    }


}