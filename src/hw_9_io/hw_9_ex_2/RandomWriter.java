package hw_9_io.hw_9_ex_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomWriter {
    private static String PATH = "D:\\pvt\\Java\\HomeWork\\src\\hw_9_io";
    private Random rnd = new Random();

    public void writeRandomNumbers() throws IOException {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(PATH + "\\randomNumbers.txt"))) {
            for (int i = 0; i < 10; i++) {
                out.write(rnd.nextInt(100) + "\n");
            }
        }
    }

    public void sortRandomNumbers() throws IOException {
        Scanner sc = new Scanner(new File(PATH + "\\randomNumbers.txt"));
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) list.add(sc.nextInt());
        Collections.sort(list);
        try (FileWriter writer = new FileWriter(PATH + "\\sortedRandomNumbers.txt")) {
            for (int cur : list) writer.write(cur + "\n");
        }
    }
}
