package hw_7_collections.hw_7_ex_2;

import java.util.Map;
import java.util.TreeMap;

public class TextManager {
    private String text;

    public TextManager(String text) {
        this.text = text;
    }

    public void wordsCounter() {
        Map<String, Integer> wordsMap = new TreeMap<>();
        for (String word : text.split("\\s+")) {
            if (wordsMap.get(word) == null) {
                wordsMap.put(word, 1);
            } else {
                wordsMap.put(word, wordsMap.get(word) + 1);
            }
        }
        System.out.println(wordsMap);
    }
}
