import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingStrings {

    public static List<String> findMissingStrings(String s, String t) {
        List<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
        List<String> exisitng = Arrays.asList(t.split(" " ));

        for (int i = 0; i < exisitng.size(); i++) {
            words.remove(exisitng.get(i));
        }

        return words;
    }

}
