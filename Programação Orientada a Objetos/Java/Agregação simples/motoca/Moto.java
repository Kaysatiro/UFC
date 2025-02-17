import java.util.*;

class Moto {
    private Pessoa pessoa = null;
    private int power = 1;
    private int time = 0;

    public Moto(int power) {
        this.power = power;
        this.pessoa = null;
        this.time = 0;
    }

    public boolean insertPerson(Pessoa pessoa) {
        if(this.pessoa == null) {
            this.pessoa = pessoa;
            return true;
        }
            System.out.println("fail: busy motorcycle");
            return false;
    }

    public Pessoa remove() {
        if(this.pessoa != null) {
            Pessoa pessoaRemovida = pessoa;
            pessoa = null;
            return pessoaRemovida;
        }
            System.out.println("fail: empty motorcycle");
            return null;
    }

    public void buyTime(int time) {
        this.time += time;
    }

    public void drive(int drive) {
        if(this.time == 0) {
            System.out.println("fail: buy time first");
            return;
        }
        if(this.pessoa == null) {
            System.out.println("fail: empty motorcycle");
            return;
        }
        if(pessoa.getAge() > 10) {
            System.out.println("fail: too old to drive");
            return;
        }
        if((this.time-drive) <= 0) {
            System.out.printf("fail: time finished after %d minutes\n", this.time);
            this.time = 0;
            return;
        }
        this.time -= drive;
        return;
    }

    public String honk() {
        StringBuilder sb = new StringBuilder();
        sb.append("P");
        sb.append("e".repeat(this.power));
        sb.append("m");
        return sb.toString();
    }

    public Pessoa getPerson() {
        return this.pessoa;
    }
    public int getPower() {
        return this.power;
    }
    public int getTime() {
        return this.time;
    }
    public String toString() {
        if(pessoa == null) {
            return "power:" + this.power + ", time:" + this.time 
        + ", person:(empty)";
        }
        return "power:" + this.power + ", time:" + this.time 
        + ", person:(" + pessoa.toString() + ")";
    }
}