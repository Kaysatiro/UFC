import java.util.Scanner;

public class Shell {

    public static void main(String[] args) {
        Moto motinha = new Moto();
        while (true) {
            var line = scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];


            if (cmd.equals("end")) {
                break;
            }

             else if (cmd.equals("show")) { 
                System.out.println(motinha.toString());
             }

             else if (cmd.equals("setDriver")) { 
                 String name = par[1];
                 int money = Integer.parseInt(par[2]);

                 Pessoa driver = new Pessoa(name, money);
                 motinha.addMotorista(driver);
             }

             else if (cmd.equals("setPass")) { 
                 String name = par[1];
                 int money = Integer.parseInt(par[2]);
                 Pessoa pass = new Pessoa(name, money);
                 motinha.addPassageiro(pass);
             }

             else if (cmd.equals("drive")) { 
                 int distance = Integer.parseInt(par[1]);
                 motinha.dirigir(distance);
             }

             else if (cmd.equals("leavePass")) { 
                System.out.println(motinha.pagar());
             }

            else {
                System.out.println("fail: command not found");
            }
        }
    }
    static Scanner scanner = new Scanner(System.in);
}
