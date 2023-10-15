public class Entrada {

    private int id;
    int chave;

    public Entrada(int id) {
        this.id = id;
    }

    public Entrada(Entrada entrada) {
        this.id = entrada.chave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

