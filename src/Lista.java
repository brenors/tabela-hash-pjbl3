public class Lista {
    No inicio;
    int tamanho;

    public void inserir(int chave) {
        No no = new No(chave);
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }

    public Entrada buscar(int valor) {
        No no = inicio;
        while (no != null) {
            if (no.valor.chave == valor) {
                return no.valor;
            }
            no = no.proximo;
        }
        return null;
    }
    public void remover(int valor) {
        if (inicio == null) {
            return;
        }

        if (inicio.valor.chave == valor) {
            inicio = inicio.proximo;
            tamanho--;
            return;
        }

        No anterior = inicio;
        No atual = inicio.proximo;
        while (atual != null) {
            if (atual.valor.chave == valor) {
                anterior.proximo = atual.proximo;
                tamanho--;
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        }
    }


    public String toString() {
        String out = "";
        No no = inicio;
        while (no != null) {
            out += no.valor.chave + " ";
            no = no.proximo;
        }
        return out;
    }
}
