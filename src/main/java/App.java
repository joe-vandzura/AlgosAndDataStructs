import java.util.*;

public class App {

    public static void main(String[] args) {

        //testing the findMissingStringsMethod here
        //two different test cases

        List<String> missingWords = MissingStrings.findMissingStrings("I am a hackerrank noob", "am a noob");

        System.out.println(missingWords);

        missingWords = MissingStrings.findMissingStrings("Testing this method", "this");

        System.out.println(missingWords);
    }


}