public class Carro extends Veiculo {
    public Carro(String id) {
        super(id, id);
        this.tipo = "Carro";
    }

    public double calcularValor(int horaSaida) {
        if(((horaSaida - getEntrada()) / 10) <= 5.00) {
            return 5.00;
        }
        return (horaSaida - getEntrada()) / 10;
    }
}