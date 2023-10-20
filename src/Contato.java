public class Contato {
    int chave;
    String nome;
    String numero;

    public Contato(int chave, String nome, String numero) {
        this.chave = chave;
        this.nome = nome;
        this.numero = numero;
    }

    public Contato(Contato contato) {
        this.chave = contato.chave;
        this.nome = contato.nome;
        this.numero = contato.numero;
    }

    public int getChave() {
        return chave;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "[ chave: " + getChave() +
                ", nome: " + getNome() +
                ", numero: " + getNumero() + " ]";
    }
}
