public class No {
    public Contato contato;
    public No proximo;

    public No(int chave, String nome, String telefone) {
        this.contato = new Contato(chave, nome, telefone);
        this.proximo = null;
    }
}