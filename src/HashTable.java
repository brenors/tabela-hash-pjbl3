public class HashTable {
    int operador;
    Lista[] lista;

    public HashTable(int operador) {
        this.operador = operador;
        lista = new Lista[operador];
        for (int i = 0; i < operador; i++) {
            lista[i] = new Lista();
        }
    }

    public void inserir(Entrada entrada) {
        int chave = entrada.chave % operador;
        lista[chave].inserir(chave);
    }

    public Entrada buscar(int chave) {
        return lista[chave % operador].buscar(chave);
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < operador; i++) {
            out += "" + i + ": ";
            out += lista[i % operador] + "\n";

        }
        return out;
    }
}