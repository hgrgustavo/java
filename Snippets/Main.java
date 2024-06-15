// Circle example
class Circle {
    double perimeter(double radius) {
        return Math.PI * radius * 2;
    }
}
public class Main {
    public static void main(String[] args) {
        Circle result = new Circle();
        double arg_radius = 2.75;
        System.out.print("\nPerimeter of a 2.75 radius circle is " + result.perimeter(arg_radius));
    }
}
// Box example
class Box {
    double width = 0;
    double height = 0;
    double depth = 0;
}
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.print("Volume is " + vol);
    }
}
private class privateDemo {
    private static void method () {

    }
}