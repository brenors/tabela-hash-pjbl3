public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        Entrada entrada1 = new Entrada(1);
        Entrada entrada2 = new Entrada(2);
        Entrada entrada3 = new Entrada(11);
        Entrada entrada4 = new Entrada(23);

        hashTable.insert(entrada1.getChave());
        hashTable.insert(entrada2.getChave());
        hashTable.insert(entrada3.getChave());
        hashTable.insert(entrada4.getChave());

        System.out.println(hashTable);

        hashTable.search(6);

        hashTable.remove(11);

        System.out.println(hashTable);
    }
}