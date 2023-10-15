public class Main {
    public static void main(String[] args) {
        HashTable hash = new HashTable(4);
        hash.inserir(new Entrada(1));
        hash.inserir(new Entrada(2));
        hash.inserir(new Entrada(3));
        hash.inserir(new Entrada(3));

        System.out.println(hash);
    }
}