package hw_6_generics;

import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {
    private List<Entry<K, V>> list;

    public Table() {
        this.list = new ArrayList<>();
    }

    public void add(Entry<K, V> entry) {
        list.add(entry);
    }

    public V getValueByKey(K key) {
        for (Entry<K, V> entry : list) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
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
