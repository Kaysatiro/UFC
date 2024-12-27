public class Animal {
    String species;
    int age;
    String sound;

    public Animal(String species, String noise) {
        this.species = species;
        this.sound = noise;
        this.age = 0;
    }

    public void ageBy(int increment) {
        this.age += increment;
        if(this.age >= 4) {
            this.age = 4;
            System.out.println("warning: " + this.species + " morreu");
        }
    }

    public String makeSound() {
        if(this.age == 0) {
            return "---";
        }
        if(this.age == 4) {
            return "RIP";
        }
        return this.sound;
    }

    public String toString() {
        return this.species + ":" + this.age + ":" + this.sound;
    }
}