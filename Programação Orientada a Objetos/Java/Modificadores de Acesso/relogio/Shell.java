import java.util.*;


public class Shell {
    public static void main(String[] a) {
        Relogio relogio = new Relogio(0, 0, 0);

        while (true) {
            var line = scanner.nextLine();
            System.out.println("$" + line);

            var par = line.split(" ");
            var cmd = par[0];

            if (cmd.equals("end")) {
                break;
            }
            else if (cmd.equals("show")) {
                System.out.println(relogio.toString());
            }
            else if (cmd.equals("init")) {
                int hour = Integer.parseInt(par[1]);
                int minute = Integer.parseInt(par[2]);
                int second = Integer.parseInt(par[3]);
                relogio = new Relogio(hour, minute, second);
            }
            else if (cmd.equals("set")) {
                int hour = Integer.parseInt(par[1]);
                int minute = Integer.parseInt(par[2]);
                int second = Integer.parseInt(par[3]);
                relogio.setHour(hour);
                relogio.setMinute(minute);
                relogio.setSecond(second);
            }
            else if (cmd.equals("next")) {
                relogio.nextSecond();
            }
            else {
                System.out.println("fail: comando invalido");
            }
        }
    }

    private static Scanner scanner = new Scanner(System.in);
}
