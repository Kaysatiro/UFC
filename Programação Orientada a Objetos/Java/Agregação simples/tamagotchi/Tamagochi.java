public class Tamagochi {
    private int energyMax;
    private int cleanMax;
    private int energy;
    private int clean;
    private int age;
    private boolean alive;

    public Tamagochi(int energy, int clean) {
        this.cleanMax = clean;
        this.energyMax = energy;
        this.clean = this.cleanMax;
        this.energy = this.energyMax;
        this.age = 0;
        this.alive = true;
    }

    public boolean taVivo() {
        if(alive == false) {
            System.out.println("fail: pet esta morto");
            return false;
        }
        if(this.energy <= 0) {
            alive = false;
            return false;
        }
        if(this.clean <= 0) {
            alive = false;
            return false;
        }
        return true;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
    public void setClean(int clean) {
        this.clean = clean;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getClean() {
        return this.clean;
    }
    public int getEnergy() {
        return this.energy;
    }
    public int getAge() {
        return this.age;
    }
    public int getEnergyMax() {
        return this.energyMax;
    }
    public int getCleanMax() {
        return this.cleanMax;
    }
}