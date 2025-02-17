public class Item {
    private String label;
    private int volume;

    public Item(String label, int volume) {
        this.volume = volume;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return this.label + ":" + this.volume;
    }
}