package hw_9_io.hw_9_ex_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class LetterReaderWriter {
    private static String PATH = "D:\\pvt\\Java\\HomeWork\\src\\hw_9_io";

    public static Map<Character, Integer> readText() throws IOException {
        Map<Character, Integer> letters = new TreeMap<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(PATH + "\\poem"))){
            String line;
            while ((line = reader.readLine()) != null) {
                for (char letter : line.replaceAll("\\s+", "").toLowerCase().toCharArray()) {
                    if (letters.get(letter) == null) {
                        letters.put(letter, 1);
                    } else {
                        letters.put(letter, letters.get(letter) + 1);
                    }
                }
                line.toCharArray();
            }
        }
        try (BufferedWriter out = new BufferedWriter(new FileWriter(PATH + "\\letters.txt"))){
            for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
                out.write(entry.getKey() + " - " + entry.getValue() + "\n");
            }
        }
        return letters;
    }
}
