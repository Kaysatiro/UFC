public class Moto extends Veiculo {
    public Moto(String id) {
        super(id, id);
        this.tipo = "Moto";
    }

    public double calcularValor(int horaSaida) {
        return (horaSaida - getEntrada()) / 20;
    }
}