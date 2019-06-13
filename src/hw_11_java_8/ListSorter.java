package hw_11_java_8;

import java.util.*;
import java.util.stream.Stream;

public class ListSorter {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(("Wikipedia is a free online encyclopedia, created and edited by volunteers around the world and hosted by the Wikimedia Foundation\n" +
                "DearneValleyOldMoorisan 89-hectare (220-acre) wetlands nature reserve in the .... Help desk – Ask questions about using Wikipedia").split("\\s+")));
        System.out.println(findMaxLongWord(words.stream()));
    }

    static Optional<String> findMaxLongWord(Stream<String> words){
        return words
                .sorted(Comparator.comparing(word -> -word.split(" ")[0].length()))
                .findFirst();
    }
}
