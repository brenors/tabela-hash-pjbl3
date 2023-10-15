public class No {
    public Entrada valor;
    public No proximo;

    public No(int valor) {
        this.valor = new Entrada(valor);
        this.proximo = null;
    }

    public int getValor() {
        return valor.chave;
    }

    public void setValor(int valor) {
        this.valor.chave = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}