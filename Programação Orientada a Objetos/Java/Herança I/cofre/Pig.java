import java.util.*;

public class Pig {
    private boolean broken;
    private ArrayList<Valuable> cofre = new ArrayList<>();
    private int volumeMax;

    public Pig(int volumeMax) {
        this.volumeMax = volumeMax;
        this.broken = false;
    }

    public boolean addValuable(Valuable valuable) {
        if(isBroken()) {
            System.out.println("fail: the pig is broken");
            return false;
        }

        if((getVolume() + valuable.getVolume()) <= getVolumeMax()) {
            cofre.add(valuable);
            return true;
        }
        System.out.println("fail: the pig is full");
        return false;
    }

    public boolean breakPig() {
        if(broken) {
            System.out.println("fail: the pig is broken");
            return false;
        }
        broken = true;
        return true;
    }

    public ArrayList<Coin> getCoins() {
        ArrayList<Coin> moedas = new ArrayList<>();
        if(isBroken()) {
            for(Valuable i : cofre) {
                if(i instanceof Coin) {
                    moedas.add((Coin) i);
                    cofre.remove((Coin) i);
                }
            }
            return moedas;
        }
        System.out.println("fail: you must break the pig first");
        return null;
    }

    public ArrayList<Item> getItems() {
        ArrayList<Item> itens = new ArrayList<>();
        if(isBroken()) {
            for(Valuable i : cofre) {
                if(i instanceof Item) {
                    itens.add((Item) i);
                    cofre.remove((Item) i);
                }
            }
            return itens;
        }
        System.out.println("fail: you must break the pig first");
        return null;
    }

    public double calcValue() {
        double soma = 0;
        for(Valuable atual : cofre) {
            soma += atual.getValue();
        }
        return soma;
    }

    public int getVolume() {
        int peso = 0;
        for(Valuable atual : cofre) {
            peso += atual.getVolume();
        }
        return peso;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public boolean isBroken() {
        if(broken) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(isBroken()) {
            sb.append(String.format(" : %.2f$ : 0/%d", calcValue(), getVolumeMax()));
        }
        else {
            sb.append(String.format(" : %.2f$ : %d/%d", calcValue(), getVolume(), getVolumeMax()));
        }
        if(isBroken()) {
            sb.append(" : broken");
        }
        else {
            sb.append(" : intact");
        }

        return cofre + sb.toString();
    }
}