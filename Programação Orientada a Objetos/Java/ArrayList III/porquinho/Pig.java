import java.util.ArrayList;

public class Pig {
    private boolean broken;
    private ArrayList<Coin> coins;
    private ArrayList<Item> itens;
    private int volumeMax;

    public Pig(int volumeMax) {
        this.volumeMax = volumeMax;
        this.broken = false;
        this.coins = new ArrayList<>();
        this.itens = new ArrayList<>();
    }

    public boolean addCoin(Coin coin) {
        if(isBroken()) {
            System.out.println("fail: the pig is broken");
            return false;
        }
        if((coin.getVolume()+getVolume()) > this.volumeMax) {
            System.out.println("fail: the pig is full");
            return false;
        }
        coins.add(coin);
        return true;
    }

    public boolean addItem(Item item) {
        if(isBroken()) {
            System.out.println("fail: the pig is broken");
            return false;
        }
        if((item.getVolume()+getVolume()) > this.volumeMax) {
            System.out.println("fail: the pig is full");
            return false;
        }
        itens.add(item);
        return true;
    }

    public boolean breakPig() {
        if(isBroken()) {
            System.out.println("fail: the pig is already broken");
            return false;
        }
        broken = true;
        return true;
    }

    public ArrayList<Coin> extractCoins() {
        if(!isBroken()) {
            System.out.println("fail: you must break the pig first");
            return null;
        }
        ArrayList<Coin> moedasRemovidas = new ArrayList<>();
        moedasRemovidas = coins;
        coins = null;
        return moedasRemovidas;
    }

    public ArrayList<Item> extractItems() {
        if(!isBroken()) {
            System.out.println("fail: you must break the pig first");
            return null;
        }
        ArrayList<Item> itensRemovidos = new ArrayList<>();
        itensRemovidos = itens;
        itens = null;
        return itensRemovidos;
    }

    public boolean isBroken() {
        if(broken) {
            return true;
        }
        return false;
    }

    public int getVolume() {
        if(isBroken()) {
            return 0;
        }
        int pesoTotal = 0;
        for(Coin pesoMoeda : coins) {
            pesoTotal += pesoMoeda.getVolume();
        }
        for(Item pesoItem : itens) {
            pesoTotal += pesoItem.getVolume();
        }
        return pesoTotal;
    }


    public double getValue() {
        double valorTotal = 0.00;
        for(Coin valorMoeda : coins) {
            valorTotal += valorMoeda.getValue();
        }
        return valorTotal;
    }

    public int getVolumeMax() {
        return this.volumeMax;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(isBroken()) {
            sb.append("state=broken : coins=");
        }
        else {
            sb.append("state=intact : coins=");
        }
        if(coins == null) {
            sb.append("[]");
        }
        else {
            sb.append(coins.toString());
        }
        sb.append(" : items=");
        if(itens == null) {
            sb.append("[]");
        }
        else {
            sb.append(itens.toString());
        }
        sb.append(String.format(" : value=%.2f : volume=%d/%d", getValue(), getVolume(), getVolumeMax()));
        return sb.toString();
    }
}