import java.util.*;

public class Contact {
    private boolean favorited;
    private LinkedList<Fone> telefones = new LinkedList<>();
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public void addFone(String id, String number) {
        Fone newFone = new Fone(id, number);
        if(newFone.isValid() == false) {
            System.out.println("fail: invalid number");
            return;
        }
        telefones.addLast(newFone);
    }

    public void rmFone(int index) {
        telefones.remove(index);
    }

    public void toogleFavorited() {
        if(isFavorited()) {
            favorited = false;
            return;
        }
        favorited = true;
    }

    public boolean isFavorited() {
        if(favorited == true) {
            return true;
        }
        return false;
    }

    public LinkedList<Fone> getFones() {
        return telefones;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        if(isFavorited()) {
            return "@ " + this.name + " " + telefones;
        }
        return "- " + this.name + " " + telefones;
    }
}