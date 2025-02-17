import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Collections;

public class Shell{
    public static void main(String[] Args) {
        Contact contato = new Contact("");
        while (true) {
            String line = scanner.nextLine();
            System.out.println("$" + line);
            String[] args = line.split(" ");
            
            if (args[0].equals("end")) {
                break;
            }
            
            else if (args[0].equals("init")) {
                 var name = args[1];
                contato = new Contact(name);
            }

            else if (args[0].equals("show")) {
                System.out.println(contato.toString());
            }

            else if (args[0].equals("add")) {
                 var id = args[1];
                 var number = args[2];
                 contato.addFone(id, number);
            }

            else if (args[0].equals("rm")) {
                 var index = Integer.parseInt(args[1]);
                 contato.rmFone(index);
            }

            else if (args[0].equals("tfav")) {
                contato.toogleFavorited();
            }

            else {
                System.out.println("fail: invalid command");
            }
        }
    }
    static Scanner scanner = new Scanner(System.in);
}
