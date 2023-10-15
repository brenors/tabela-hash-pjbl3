public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        Entrada entry1 = new Entrada(1);
        Entrada entry2 = new Entrada(2);
        Entrada entry3 = new Entrada(11);

        hashTable.inserir(entry1.getId());
        hashTable.inserir(entry2.getId());
        hashTable.inserir(entry3.getId());

        System.out.println(hashTable);

        System.out.println("Found entry: " + hashTable.buscar(2) );

        System.out.println("Removed entry: " + hashTable.remover(1));
    }
}