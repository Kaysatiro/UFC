import java.text.DecimalFormat;

public class Calculator {
    int battery;
    int batteryMax;
    float display;

    public Calculator(int batteryMax) {
        this.batteryMax = batteryMax;
        this.battery = 0;
        this.display = 0;
    }

    public void charge(int value) {
        this.battery += value;
        if(this.battery >= batteryMax) {
            this.battery = batteryMax;
        }
    }

    public void sum(int a, int b) {
        if(this.battery <= 0) {
            System.out.println("fail: bateria insuficiente");
            return;
        }
        this.display = a + b;
        this.battery--;
    }

    public void division(int num, int den) {
        if(this.battery <= 0) {
            System.out.println("fail: bateria insuficiente");
            return;
        }
        if(den == 0) {
            System.out.println("fail: divisao por zero");
            this.battery--;
            return;
        }
        this.display = (float)num / den;
        this.battery--;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return String.format("display = %s, battery = %d", df.format(this.display), this.battery);
    }
}