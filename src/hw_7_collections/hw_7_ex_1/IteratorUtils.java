package hw_7_collections.hw_7_ex_1;

import hw_6_generics.Pair;

import java.util.ArrayList;
import java.util.List;

public class IteratorUtils {

    public static <E extends Comparable<E>> Iterable<Integer> maxPairs(E... num) {
        List<Pair<Integer>> list = new ArrayList<>();
        if (num.length % 2 == 0) {
            for (int i = 0; i < num.length; i = i + 2) {
                list.add(new Pair(num[i], num[i + 1]));
            }
        } else {
            for (int i = 0; i < num.length - 1; i = i + 2) {
                list.add(new Pair(num[i], num[i + 1]));
            }
            list.add(new Pair(num[num.length - 1], 0));
        }
        return new PairMaxIterable(list);
    }
}
