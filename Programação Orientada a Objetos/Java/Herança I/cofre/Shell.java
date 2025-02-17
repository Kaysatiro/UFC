import java.util.*;

public class Shell {
    public static void main(String[] a) {
        Pig pig = new Pig(0);
        while (true) {
            var line = scanner.nextLine();
            System.out.println("$" + line);
            var args = line.split(" ");
            var cmd = args[0];
            
            try {
                if (cmd.equals("end")) {
                    break;
                }

                else if(cmd.equals("show")) { 
                    System.out.println(pig.toString());;
                }

                else if(cmd.equals("addCoin")) {
                     String value = args[1];
                     if(value.equals("10")) {
                        pig.addValuable(Coin.M10);
                     }
                     if(value.equals("25")) {
                        pig.addValuable(Coin.M25);
                     }
                     if(value.equals("50")) {
                        pig.addValuable(Coin.M50);
                     }
                     if(value.equals("100")) {
                        pig.addValuable(Coin.M100);
                     }
                }

                else if(cmd.equals("init")) {
                    var volume = Integer.parseInt(args[1]);
                    pig = new Pig(volume);
                }

                else if(cmd.equals("addItem")) {
                     var label = args[1];
                     var value = Double.parseDouble(args[2]);
                     var volume = Integer.parseInt(args[3]);
                    Valuable coisa = new Item(label, value, volume);
                    pig.addValuable(coisa);
                }

                else if(cmd.equals("break")) {
                    pig.breakPig();
                }

                else if(cmd.equals("extractCoins")) {
                    if(pig.cofre() == null) {
                        System.out.println("");
                        return;
                    }
                    System.out.println(pig.getCoins());;
                }

                else if(cmd.equals("extractItems")) { 
                    if(pig.cofre() == null) {
                        System.out.println("");
                        return;
                    }
                    System.out.println(pig.getItems());;
                }

                else {
                    System.out.println("fail: comando invalido");
                }

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static Scanner scanner = new Scanner(System.in);
}
