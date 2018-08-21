package D31.assets;

import java.util.Arrays;
import java.util.HashMap;

public class RepeatedWord {
    public static String repeatedWord(String string) {
        String firstRepeat = "";
        int wordCounter = 0;

        HashMap<String, Integer> storyHash = new HashMap<>();

        // Convert to lower cast, split it on spaces, and then move forward
        String[] eachWord = string.toLowerCase().split("[\\W\\d]+");

        // If empty, return emtpy string / array
        if (eachWord.length == 0) {
            return "";
        }

        //Iterate through the array, put into map, and then return it
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