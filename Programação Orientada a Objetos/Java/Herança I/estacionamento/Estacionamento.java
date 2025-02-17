import java.util.*;

public class Estacionamento {
    ArrayList<Veiculo> veiculos = new ArrayList<>();
    int horaAtual;

    public Estacionamento() {
        this.horaAtual = 0;
    }

    public void estacionar(Veiculo veiculo) {
        veiculo.setEntrada(this.horaAtual);
        veiculos.add(veiculo);
    }

    public void pagar(String id) {
        for(Veiculo pagar : veiculos) {
            if(pagar.getId().equals(id)) {
                System.out.println(String.format("%s chegou %d saiu %d. Pagar R$ %.2f", pagar.getTipo(),
                pagar.getEntrada(), this.horaAtual, pagar.calcularValor(this.horaAtual)));
            }
        }
    }

    public void passarTempo(int tempo) {
        this.horaAtual += tempo;
    }

    public String toString() {
        if(veiculos.isEmpty()) {
            return "Hora atual: " + this.horaAtual;
        }
        StringBuilder sb = new StringBuilder();
        for(Veiculo printar : veiculos) {
            sb.append(String.format("%10s-:-%10s-:-%s", printar.getTipo(), printar.getId(), printar.getEntrada())
            .replace(' ', '_').replace('-', ' '));
            sb.append("\n");
        }
        sb.append("Hora atual: " + this.horaAtual);
        
        return sb.toString();
    }
}