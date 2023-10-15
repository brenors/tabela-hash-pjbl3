class HashTable {
    private Lista[] lista;
    private int max_itens;
    private int tam_vetor;

    public HashTable(int max_itens) {
        this.max_itens = max_itens;
        this.tam_vetor = 0;
        this.lista = new Lista[max_itens];
        for (int i = 0; i < max_itens; i++) {
            lista[i] = new Lista();
        }
    }

    private int hash(int valor) {
        return valor % max_itens;
    }

    public void insert(int chave) {
        int index = hash(chave);
        lista[index].inserir(chave);
        tam_vetor++;


        if ((double) tam_vetor / max_itens > 0.75) {
            expandir();
        }
    }

    public Entrada search(int chave) {
        int index = hash(chave);
        Lista lista = this.lista[index];
        Entrada entrada = lista.buscar(chave);
        if (entrada != null) {
            System.out.println(true);
            return entrada;
        }
        System.out.println(false);
        return null;
    }

    public Entrada remove(int chave) {
        int index = hash(chave);
        Lista lista = this.lista[index];
        Entrada entrada = lista.buscar(chave);
        if (entrada != null) {
            lista.remover(chave);
            return entrada;
        }
        return null;
    }

    private void expandir() {
        int newCapacity = max_itens * 2;
        Lista[] newTable = new Lista[newCapacity];
        for (int i = 0; i < newCapacity; i++) {
            newTable[i] = new Lista();
        }

        for (Lista lista : lista) {
            No no = lista.inicio;
            while (no != null) {
                int newIndex = no.valor.chave % newCapacity;
                newTable[newIndex].inserir(no.valor.chave);
                no = no.proximo;
            }
        }

        lista = newTable;
        max_itens = newCapacity;
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < tam_vetor; i++) {
            out += "" + i + ": ";
            out += lista[i % tam_vetor] + "\n";

        }
        return out;
    }
}