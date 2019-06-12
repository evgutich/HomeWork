package hw_9_io.hw_9_ex_2;

import java.io.IOException;

public class SortWriterTest {
    public static void main(String[] args) throws IOException {
        RandomWriter e = new RandomWriter();
        e.writeRandomNumbers();
        e.sortRandomNumbers();
    }

}
