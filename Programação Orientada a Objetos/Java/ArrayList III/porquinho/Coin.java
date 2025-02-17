public enum Coin {
    C10(0.1, 1, "10"),
    C25(0.25, 2, "25"),
    C50(0.5, 3, "50"),
    C100(1.0, 4, "100");
    private double value;
    private int volume;
    private String label;

    private Coin(double value, int volume, String label) {
        this.value = value;
        this.volume = volume;
        this.label = label;
    }

    public double getValue() {
        return value;
    }
    public int getVolume() {
        return volume;
    }
    public String getLabel() {
        return label;
    }

    public String toString() {
        return String.format("%.2f:%d", this.value, this.volume);
    }

}