import java.util.*;

public class Fone {
    private String id;
    private String number;

    public Fone(String id, String number) {
        this.id = id;
        this.number = number;
    }

    public boolean isValid() {
        String validos = "0123456789().-+ ";

        for (char c : this.number.toCharArray()) { 
            if (validos.indexOf(c) == -1) { 
                return false;
            }
        }
        return true; 
    }

    public String getId() {
        return this.id;
    }

    public String getNumber() {
        return this.number;
    }

    public String toString() {
        return this.id + ":" + this.number;
    }
}