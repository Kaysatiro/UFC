class Pessoa {
    private int age;
    private String name;

    public Pessoa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + ":" + this.age;
    }
}