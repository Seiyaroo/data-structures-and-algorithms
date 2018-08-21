package D31.assets;

import java.util.Arrays;
import java.util.HashMap;

public class RepeatedWord {
    public static String repeatedWord(String string) {
        String firstRepeat = "";
        int wordCounter = 0;

        HashMap<String, Integer> storyHash = new HashMap<>();

        // Converts to lower case to account for capitals
        // split at all spaces, non words / letters, and digits
        // Add greedy quantifier to remove extra spaces
        String[] eachWord = string.toLowerCase().split("[\\W\\d]+");
        System.out.println("eachWord array: " + Arrays.toString(eachWord));

        // If the array is empty, immediately return the array / empty string
        if (eachWord.length == 0) {
            return "";
        }

        // Run through the array
        // Puts a word in the hashmap if its not in there
        // If it is, insert into our firstRepeat and return
        for (int i = 0; i < eachWord.length; i++ ) {
            if (!storyHash.containsKey(eachWord[i])) {
                storyHash.put(eachWord[i], wordCounter++);
            } else {
                firstRepeat = eachWord[i];
                return firstRepeat;
            }
        }
        return firstRepeat;
    }
}