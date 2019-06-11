package hw_7_collections.hw_7_ex_1;

import hw_6_generics.Pair;

import java.util.Iterator;
import java.util.List;

public class PairMaxIterable implements Iterable<Integer> {
    private List<Pair<Integer>> list;

    public PairMaxIterable(List<Pair<Integer>> list) {
        this.list = list;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PairMaxIterator(list);
    }

}
