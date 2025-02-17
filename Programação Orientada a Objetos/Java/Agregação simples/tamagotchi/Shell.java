import java.util.*;

public class Shell {
    public static void main(String[] a) {
    Game novoJogo = null;
        
        
        while (true) {
            var line = scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];

            if (cmd.equals("end")) {
                break;
            }

            else if (cmd.equals("init")) {
                var energy = Integer.parseInt(par[1]);
                var clean = Integer.parseInt(par[2]);

                Tamagochi pet = new Tamagochi(energy, clean);
                novoJogo = new Game(pet);
             }

            else if (cmd.equals("show")) {
                System.out.println(novoJogo.toString());
             }

            else if (cmd.equals("play")) { 
                novoJogo.play();
             }

            else if (cmd.equals("shower")) { 
                novoJogo.shower();
             }

            else if (cmd.equals("sleep")) { 
                novoJogo.sleep();
             }

            else {
                System.out.println("fail: comando invalido");
            }
        }
    }

    private static Scanner scanner = new Scanner(System.in);
}
