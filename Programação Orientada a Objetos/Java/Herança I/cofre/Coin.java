public enum Coin implements Valuable{
    M10(0.1, 1, "M10"),
    M25(0.25, 2, "M25"),
    M50(0.5, 3, "M50"),
    M100(1.0, 4, "M100");
    private String rotulo;
    private double valor;
    private int volume;

    private Coin(double valor, int volume, String rotulo) {
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

    public int getVolume(){
        return this.volume;
    }

    public String toString(){
        return String.format("%s:%.2f:%d", this.rotulo, this.valor, this.volume);
    }
}