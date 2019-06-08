package hw_6_generics;

public class Test {
    public static void main(String[] args) {
//        Pair<Integer> integerPair = new Pair<>(33, 3);
//        System.out.println(integerPair.min());
//        System.out.println(integerPair.max());

        Entry<String, Integer> e1 = new Entry<>("first", 1);
        Entry<String, String> e2 = new Entry<>("second", "2");
        Table<String, String> table = new Table<>();
        table.add(e1);
        table.add(e2);

        System.out.println(table.getValueByKey("second"));
//        table.setValueByKey("first", "12");
//        table.removeByKey("first");

        System.out.println(table.toString());
    }
}
