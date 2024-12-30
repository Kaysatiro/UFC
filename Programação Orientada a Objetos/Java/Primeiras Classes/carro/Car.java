public class Car {
    int pass;
    int passMax;
    int gas;
    int gasMax;
    int km;

    public Car() {
        this.pass = 0;
        this.km = 0;
        this.passMax = 2;
        this.gas = 0;
        this.gasMax = 100;
    }

    public void enter() {
        this.pass++;
        if(this.pass > 2) {
            this.pass = 2;
            System.out.println("fail: limite de pessoas atingido");
        }
    }
    public void leave() {
        this.pass--;
        if(this.pass < 0) {
            this.pass = 0;
            System.out.println("fail: nao ha ninguem no carro");
        }
    }
    public void drive(int distance) {
        if(this.pass == 0) {
            System.out.println("fail: nao ha ninguem no carro");
            return;
        }
        if(this.gas == 0) {
            System.out.println("fail: tanque vazio");
            return;
        }
        if(distance > this.gas){
            System.out.println("fail: tanque vazio apos andar " + this.gas + " km");
            this.km += this.gas;
            this.gas = 0;
            return;
        }
        this.km += distance;
        this.gas -= this.km;
    }
    public void fuel(int increment) {
        this.gas += increment;
        if(this.gas >= this.gasMax) {
            this.gas = this.gasMax;
        }
    }

    public String toString() {
        return "pass: " + this.pass + ", gas: " + this.gas + ", km: " + this.km;
    }
}