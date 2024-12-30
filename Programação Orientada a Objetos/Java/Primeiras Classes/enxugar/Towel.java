import java.util.*;

public class Towel {
    String color;
    String size;
    int wetness;

    public Towel(String color, String size) {
        this.color = color;
        this.size = size;
        this.wetness = 0;
    } 

    public void dry(int amount) {
        if(this.wetness+amount >= (getMaxWetness())) {
            System.out.println("toalha encharcada");
            this.wetness = getMaxWetness();
            return;
        }
        this.wetness += amount;
    }

    public void wringOut() {
        this.wetness = 0;
    }

    public int getMaxWetness() {
        if(size.equals("P")) {
            return 10;
        }
        if(size.equals("M")) {
            return 20;
        }
        return 30;
    }

    public boolean isDry() {
        if(this.wetness <= 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Cor: " + this.color + ", Tamanho: " + this.size + ", Umidade: " + this.wetness;
    }
}