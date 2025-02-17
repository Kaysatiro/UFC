import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class Shell {

    public static void main(String[] a) {
        Estacionamento e = new Estacionamento();
        while (true) {
            String line = scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];

            if (cmd.equals("end")) {
                break;
            }

            else if (cmd.equals("show")) {
                System.out.println(e.toString());
            }

            else if (cmd.equals("init")) {
                e = new Estacionamento();
            }

            else if (cmd.equals("estacionar")) {
                var veiculo = par[1];
                var id = par[2];
                if(veiculo.equals("bike")) {
                    Veiculo x = new Bike(id);
                    e.estacionar(x);
                }
                if(veiculo.equals("moto")) {
                    Veiculo x = new Moto(id);
                    e.estacionar(x);
                }
                if(veiculo.equals("carro")) {
                    Veiculo x = new Carro(id);
                    e.estacionar(x);
                }
            }

            else if (cmd.equals("pagar")) {
                 var veiculo = par[1];
                 e.pagar(veiculo);
            }

            else if (cmd.equals("tempo")) {
                var tempo = Integer.parseInt(par[1]);
                e.passarTempo(tempo);
            }

            else {
                System.out.println("fail: comando inválido");
            }
        }
    }

    private static Scanner scanner = new Scanner(System.in);
}
