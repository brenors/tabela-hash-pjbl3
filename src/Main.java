public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        Entrada entry1 = new Entrada(1);
        Entrada entry2 = new Entrada(2);
        Entrada entry3 = new Entrada(11);
        Entrada entry4 = new Entrada(23);

        hashTable.insert(entry1.getChave());
        hashTable.insert(entry2.getChave());
        hashTable.insert(entry3.getChave());
        hashTable.insert(entry4.getChave());

        System.out.println(hashTable);

        hashTable.search(6);

        hashTable.remove(11);

        System.out.println(hashTable);


    }
}