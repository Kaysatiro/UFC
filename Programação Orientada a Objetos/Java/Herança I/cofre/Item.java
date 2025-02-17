public class Item implements Valuable{
    private String rotulo;
    private double valor;
    private int volume;

    public Item(String rotulo, double valor, int volume) {
        this.rotulo = rotulo;
        this.valor = valor;
        this.volume = volume;
    }

    public String getLabel(){
        return this.rotulo;
    }
    public double getValue(){
        return this.valor;
    }
    public int getVolume() {
        return this.volume;
    }
    public String toString() {
        return this.rotulo + String.format(":%.2f:", this.valor) + this.volume;
    }
}