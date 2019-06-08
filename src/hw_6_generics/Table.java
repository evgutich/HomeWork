package hw_6_generics;

import java.util.ArrayList;

public class Table<K, V> {
    private ArrayList<Entry> list;

    public Table() {
        this.list = new ArrayList<>();
    }

    public void add(Entry entry) {
        list.add(entry);
    }

    public V getValueByKey(K key) {
        for (Entry entry : list) {
            if (entry.getKey().equals(key)) {
                return (V) entry.getValue();
            }
        }
        return null;
    }

    public void setValueByKey(K key, V value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey().equals(key)) {
                list.set(i, new Entry<>(key, value));
            }
        }
    }

    public void removeByKey(K key){
        for (Entry entry : list) {
            if (entry.getKey().equals(key)) {
                list.remove(entry);
            }
        }
    }

    @Override
    public String toString() {
        return "Table{" +
                "list=" + list.toString() +
                '}';
    }
}
