package hw_7_collections.hw_7_ex_1;

import hw_6_generics.Pair;

import static hw_7_collections.hw_7_ex_1.IteratorUtils.maxPairs;
import static java.util.Arrays.asList;

public class IteratorTest {
    public static void main(String[] args) {

        for(Integer max : new PairMaxIterable(asList(new Pair(6,2), new Pair(3,2), new Pair(1,5)))) {
            System.out.print(max + " ");
        }

        System.out.println();

        for(Integer max : maxPairs(1,2,3,4,5,6,7)) {
            System.out.print(max + " ");
        }
    }
}
