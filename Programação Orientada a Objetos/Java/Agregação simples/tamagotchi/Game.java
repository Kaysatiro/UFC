public class Game {
    private Tamagochi pet;

    public Game(Tamagochi pet) {
        this.pet = pet;
    }

    public String toString() {
        return "E:" + pet.getEnergy() + "/" + pet.getEnergyMax() +
        ", L:" + pet.getClean() + "/" + pet.getCleanMax() +
        ", I:" + pet.getAge();
    }

    public void play() {
        if(pet.taVivo() == false) {
            return;
        }
        pet.setEnergy(pet.getEnergy() - 2);
        if(pet.getEnergy() <= 0) {
            System.out.println("fail: pet morreu de fraqueza");
            pet.setEnergy(0);
            return;
        }
        pet.setClean(pet.getClean() - 3);
        if(pet.getClean() <= 0) {
            System.out.println("fail: pet morreu de sujeira");
            pet.setClean(0);
            return;
        }
        pet.setAge(pet.getAge() + 1);
        return;
    }
    public void sleep() {
        if(pet.taVivo() == false) {
            return;
        }
        if(pet.getEnergy() > (pet.getEnergyMax() - 5)) {
            System.out.println("fail: nao esta com sono");
            return;
        }
        pet.setEnergy(pet.getEnergyMax());
        pet.setAge(pet.getAge() + 6);
        return;
    }
    public void shower() {
        if(pet.taVivo() == false) {
            return;
        }
        pet.setEnergy(pet.getEnergy() - 3);
        if(pet.getEnergy() <= 0) {
            System.out.println("fail: pet morreu de fraqueza");
            pet.setEnergy(0);
            return;
        }
        pet.setClean(pet.getCleanMax());
        pet.setAge(pet.getAge() + 2);
        return;
    }
}