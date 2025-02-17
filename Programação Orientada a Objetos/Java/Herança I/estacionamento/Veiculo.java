public abstract class Veiculo {
    String id;
    String tipo;
    int horaEntrada;

    public Veiculo(String tipo, String id) {
        this.id = id;
        this.tipo = tipo;
    }
    public abstract double calcularValor(int horaSaida);

    public void setEntrada(int entrada) {
        this.horaEntrada = entrada;
    }
    public int getEntrada() {
        return this.horaEntrada;
    }
    public String getTipo() {
        return this.tipo;
    }
    public String getId() {
        return this.id;
    }

    public String toString() {
        return String.format("%10s-:-%10s-:-%s\n", getTipo(), getId(), getEntrada()).replace(' ', '_').replace('-', ' ');
    }
}