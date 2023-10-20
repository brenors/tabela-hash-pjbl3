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

    public void insert(int chave, String nome, String telefone) {
        int index = hash(chave);
        lista[index].inserir(chave, nome, telefone);
        tam_vetor++;

        if ((double) tam_vetor / max_itens > 0.75) {
            expandir();
        }
    }

    public void tempoBusca(long inicio){
        long tempo_inicial = inicio;
        long tempo_final = java.lang.System.nanoTime();
        long tempo_execucao = tempo_final - tempo_inicial;

        System.out.println("Tempo de execução:  " + tempo_execucao + " nanosegundos");
    }

    public Contato search(int chave) {
        long tempo_inicial = java.lang.System.nanoTime();

        int index = hash(chave);
        Lista lista = this.lista[index];
        Contato contato = lista.buscar(chave);
        if (contato != null) {
            System.out.println("Item encontrado: " + contato.toString());
            this.tempoBusca(tempo_inicial);

            return contato;
        }
        System.out.println(false);
        this.tempoBusca(tempo_inicial);

        return null;
    }

    public Contato remove(int chave) {
        int index = hash(chave);
        Lista lista = this.lista[index];
        Contato contato = lista.buscar(chave);
        if (contato != null) {
            lista.remover(chave);
            System.out.println("Item removido: " + contato.toString());
            return contato;
        }
        return null;
    }

    private void expandir() {
        int nova_capacidade = max_itens * 2;
        Lista[] nova_tabela = new Lista[nova_capacidade];
        for (int i = 0; i < nova_capacidade; i++) {
            nova_tabela[i] = new Lista();
        }

        for (Lista lista : lista) {
            No no = lista.inicio;
            while (no != null) {
                int novo_index = no.contato.chave % nova_capacidade;
                nova_tabela[novo_index].inserir(no.contato.chave, no.contato.nome, no.contato.numero);
                no = no.proximo;
            }
        }
        lista = nova_tabela;
        max_itens = nova_capacidade;
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < max_itens; i++) {
            out += "" + i + ": ";
            No no = lista[i].inicio;
            while (no != null) {
                out += no.contato.toString() + " ";
                no = no.proximo;
            }
            out += "\n";
        }
        return out;
    }
}