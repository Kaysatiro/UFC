import java.util.Scanner;


public class Shell {
    
    public static void main(String[] a) {
        // CRIE SUA TOALHA AQUI
        Towel toalha = new Towel("","");
        
        while (true) {
            var line = scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];

            if (cmd.equals("end")) {
                break;
            }
            else if (cmd.equals("criar")) { // ATUALIZE SUA TOALHA USANDO O CONSTRUTOR
                var cor = par[1];
                var tamanho = par[2];
                toalha = new Towel(cor, tamanho);
            }
            else if (cmd.equals("mostrar")) { // MOSTRE SUA TOALHA
                System.out.println(toalha.toString());
            }
            else if (cmd.equals("enxugar")) { // ENXUGUE
                var quantidade = Integer.parseInt(par[1]);
                toalha.dry(quantidade);
            }
            else if (cmd.equals("seca")) { // OBTENHA SE ESTA SECA E IMPRIMA SIM OU NAO
                if(toalha.isDry()) {
                    System.out.println("sim");
                }
                else {
                    System.out.println("nao");
                }
            }
            else if (cmd.equals("torcer")) { // CHAME O METODO TORCER
                toalha.wringOut();
            }
            else {
                System.out.println("comando invalido");
            }
        }
    }
    private static Scanner scanner = new Scanner(System.in);
}
