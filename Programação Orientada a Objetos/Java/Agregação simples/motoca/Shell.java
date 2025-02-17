import java.util.*;

public class Shell{
    
    public static void main(String[] args) {
        Moto moto = new Moto(1);

        while(true) {
            var line = scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];

            if (cmd.equals("end")) {
                break;
            }
            else if (cmd.equals("init")) {
            var power = Integer.parseInt(par[1]);
                moto = new Moto(power);
            }
            else if (cmd.equals("show")) {
                System.out.println(moto.toString());
            }
            else if (cmd.equals("enter")) {
                 var name = par[1];
                 var age = Integer.parseInt(par[2]);
                 Pessoa pessoa = new Pessoa(name, age);
                 moto.insertPerson(pessoa);
            }
            else if (cmd.equals("leave")) {
                Pessoa pessoa = moto.remove();
                if(pessoa != null) {
                    System.out.println(pessoa.toString());
                }
            }
            else if (cmd.equals("buy")) {
                 var time = Integer.parseInt(par[1]);
                 moto.buyTime(time);
            }
            else if (cmd.equals("drive")) {
                 var time = Integer.parseInt(par[1]);
                 moto.drive(time);
            }
            else if (cmd.equals("honk")) {
                System.out.println(moto.honk());
            }
            else {
                System.out.println("fail: comando invalido");
            }
        }
    }

    static Scanner scanner = new Scanner(System.in);
}
