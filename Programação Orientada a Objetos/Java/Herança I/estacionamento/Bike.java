public class Bike extends Veiculo {
    public Bike(String id) {
        super(id, id);
        this.tipo = "Bike";
    }

    public double calcularValor(int horaSaida) {
        return 3.00;
    }
}