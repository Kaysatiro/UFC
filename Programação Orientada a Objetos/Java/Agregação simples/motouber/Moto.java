import java.util.*;

public class Moto {
    Pessoa motorista;
    Pessoa passageiro;
    int custo;

    public Moto() {
        this.motorista = null;
        this.passageiro = null;
        this.custo = 0;
    }

    public void dirigir(int km) {
        if(this.motorista == null) {
            System.out.println("fail: sem motorista");
            return;
        }
        if(this.passageiro == null) {
            System.out.println("fail: sem passageiro");
            return;
        }
        this.custo += km;
        return;
    }

    public String pagar() {
        if(passageiro.getDinheiro() < this.custo) {
            System.out.println("fail: Passenger does not have enough money");
            passageiro.setDinheiro(0);
            motorista.setDinheiro(motorista.getDinheiro() + this.custo);
            Pessoa passageiroRemovido = passageiro;
            passageiro = null;
            this.custo = 0;
            return passageiroRemovido.toString() + " left";
        }

        motorista.setDinheiro(motorista.getDinheiro() + this.custo);
        passageiro.setDinheiro(passageiro.getDinheiro() - this.custo);

        Pessoa passageiroRemovido = passageiro;
        passageiro = null;
        this.custo = 0;
        return passageiroRemovido.toString() + " left";
    }

    public void addMotorista(Pessoa motorista) {
        if(this.motorista == null) {
            this.motorista = motorista;
            return;
        }
        System.out.println("fail: ja tem motorista");
    }

    public void addPassageiro(Pessoa passageiro) {
        if(this.motorista == null) {
            System.out.println("Não tem motorista");
            return;
        }
        if(this.passageiro == null) {
            this.passageiro = passageiro;
            return;
        }
        return;
    }

    public String toString() {
        if(this.motorista == null) {
            return "Cost: " + this.custo + ", Driver: None, Passenger: None";
        }
        if(this.passageiro == null) {
            return "Cost: " + this.custo + ", Driver: " + this.motorista + ", Passenger: None";
        }
        return "Cost: " + this.custo + ", Driver: " + this.motorista + 
        ", Passenger: " + this.passageiro;
    }
}