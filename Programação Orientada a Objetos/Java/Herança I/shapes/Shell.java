import java.util.*;
import java.util.stream.Collectors;
import java.text.DecimalFormat;

public class Shell {

    public static String info(Shape shape) {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("%s: A=%s P=%s\n", shape.getName(), 
        df.format(shape.getArea()), df.format(shape.getPerimeter()));   
    }
    public static void main(String[] a) {
        ArrayList<Shape> listaDeShapes = new ArrayList<>();
        while (true) {
            var line = scanner.nextLine();
            System.out.println("$" + line);
    
            var par = line.split(" ");
            var cmd = par[0];
            
            if (cmd.equals("end")) {
                break;
            }

            else if (cmd.equals("show")) {
                for(Shape mostrar : listaDeShapes) {
                    System.out.println(mostrar.toString());
                }
            }

            else if (cmd.equals("circle")) {
                 var x = Double.parseDouble(par[1]);
                 var y = Double.parseDouble(par[2]);
                 var radius = Double.parseDouble(par[3]);
                 Point2D center = new Point2D(x, y);

                Shape circ = new Circle(center, radius);
                listaDeShapes.add(circ);
            }

            else if (cmd.equals("rect")) {
                 var x1 = Double.parseDouble(par[1]);
                 var y1 = Double.parseDouble(par[2]);
                 var x2 = Double.parseDouble(par[3]);
                 var y2 = Double.parseDouble(par[4]);
                 Point2D p1 = new Point2D(x1, y1);
                 Point2D p2 = new Point2D(x2, y2);

                Shape rect = new Rectangle(p1, p2);
                listaDeShapes.add(rect);
            }

            else if (cmd.equals("info")) {
                for(Shape info: listaDeShapes) {
                    System.out.printf(info(info));
                }
            }

            else {
                System.out.println("Comando inválido");
            }
        }
    }

    private static Scanner scanner = new Scanner(System.in);
}
