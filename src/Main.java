public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);

        Contato contato1 = new Contato(10, "Joao", "(41)99999-9999");
        Contato contato2 = new Contato(20, "Rafael", "(41)98888-9999");
        Contato contato3 = new Contato(30, "Vreno", "(41)99999-8888");
        Contato contato4 = new Contato(23, "Bittorio", "(41)97777-9999");

        hashTable.insert(contato1.chave, contato1.nome, contato1.numero);
        hashTable.insert(contato2.chave, contato2.nome, contato2.numero);
        hashTable.insert(contato3.chave, contato3.nome, contato3.numero);
        hashTable.insert(contato4.chave, contato4.nome, contato4.numero);

        System.out.println(hashTable.toString());

        hashTable.search(10);

//        hashTable.remove(10);

       // System.out.println(hashTable.toString());

//        hashTable.search(20);
    }
}