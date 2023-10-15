public class Entrada {

    int chave;

    public Entrada(int chave) {
        this.chave = chave;
    }

    public Entrada(Entrada entrada) {
        this.chave = entrada.chave;
    }

    public int getChave() {
        return chave;
    }

}

