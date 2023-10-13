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

    private int hash(int key) {
        return key % size;
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (31 * hash + key.charAt(i)) % size;
        }
        return hash;
    }

    public void inserir(int key, String value) {
        int index = hash(key);
        table[index].add(new Entrada(key, value));
    }

    public String buscar(String value) {
        int index = hash(value);
        for (Entrada entrada : table[index]) {
            if (entrada.getValue().equals(value)) {
                return entrada.getValue();
            }
        }
        return null;
    }

    public String buscar(int key) {
        int index = hash(key);
        for (Entrada entrada : table[index]) {
            if (entrada.getKey() == key) {
                return entrada.getValue();
            }
        }
        return null;
    }

    public String remover(int key) {
        int index = hash(key);
        for (Entrada entrada : table[index]) {
            if (entrada.getKey() == key) {
                table[index].remove(entrada);
                return entrada.getValue();
            }
        }
        return null;
    }

    public String remover(String value) {
        int index = hash(value);
        for (Entrada entrada : table[index]) {
            if (entrada.getValue().equals(value)) {
                table[index].remove(entrada);
                return entrada.getValue();
            }
        }
        return null;
    }
}
