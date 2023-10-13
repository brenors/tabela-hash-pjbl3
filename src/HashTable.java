import java.util.LinkedList;

public class HashTable {

    private int size;
    private LinkedList<Entrada>[] table;

    public HashTable(int size) {
        this.size = size;
        this.table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private class Entrada {
        private int key;
        private String value;

        public Entrada(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}
