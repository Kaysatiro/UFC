import java.util.*;

public class Shell {    
    public static void main(String[] args) {
        Roupa roupa = new Roupa();
        while (true) {
            var line = scanner.nextLine();
            System.out.println("$" + line);
            
            var par = line.split(" ");
            var cmd = par[0];
            
            if (cmd.equals("end")) {
                break;
            }
            else if (cmd.equals("size")) {
                String size = par[1];
                roupa.setTamanho(size);
            }
            else if (cmd.equals("show")) { 
                System.out.println(roupa.toString());
            }
            else {
                System.out.println("fail: Comando inválido");
            }
        }
    }
    private static Scanner scanner = new Scanner(System.in);
}
