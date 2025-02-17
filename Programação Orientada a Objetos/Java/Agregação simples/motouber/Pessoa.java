public class Pessoa {
    private String nome;
    private int dinheiro;

    public Pessoa(String nome, int dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

    public String getNome() {
        return this.nome;
    }

    public int getDinheiro() {
        return this.dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String toString() {
        return getNome() + ":" + getDinheiro();
    }
}