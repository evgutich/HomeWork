package hw_6_generics;

public class Pair<E extends Comparable<E>> {
    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public E min() {
        return (getFirst().compareTo(getSecond()) < 0) ? getFirst() : getSecond();
    }

    public E max() {
        return (getFirst().compareTo(getSecond()) > 0) ? getFirst() : getSecond();
    }

    public int compareTo(E second) {
        return first.compareTo(second);
    }
}
