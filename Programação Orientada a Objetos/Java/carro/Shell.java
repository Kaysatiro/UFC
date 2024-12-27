import java.util.*;


public class Shell {
    
    public static void main(String[] args) {
        // CRIE SEU CARRO AQUI
        Car car = new Car();
        while (true) {
            var line = scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];

            if (cmd.equals("end")) {
                break;
            }
            else if (cmd.equals("show")) {
                System.out.println(car.toString());
            } 
            else if (cmd.equals("enter")) {
                car.enter();
            } 
            else if (cmd.equals("leave")) {
                car.leave();
            } 
            else if (cmd.equals("fuel")) {
                 int increment = Integer.parseInt(par[1]);
                 car.fuel(increment);
            } 
            else if (cmd.equals("drive")) {
                 int distance = Integer.parseInt(par[1]);
                 car.drive(distance);
            }  
            else {
                System.out.println("fail: comando invalido");
            }
        }   
    }
    private static Scanner scanner = new Scanner(System.in);
}
