public class Lista {
    No inicio;
    int tamanho;

    public void inserir(int chave, String nome, String telefone) {
        No no = new No(chave, nome, telefone);
        no.proximo = inicio;
        inicio = no;
        tamanho++;
    }

    public Contato buscar(int valor) {
        No no = inicio;
        while (no != null) {
            if (no.contato.chave == valor) {
                return no.contato;
            }
            no = no.proximo;
        }
        return null;
    }
    public void remover(int valor) {
        if (inicio == null) {
            return;
        }

        if (inicio.contato.chave == valor) {
            inicio = inicio.proximo;
            tamanho--;
            return;
        }

        No anterior = inicio;
        No atual = inicio.proximo;
        while (atual != null) {
            if (atual.contato.chave == valor) {
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
            out += no.contato.chave + " ";
            no = no.proximo;
        }
        return out;
    }
}
