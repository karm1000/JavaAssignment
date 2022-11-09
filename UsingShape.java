import shape.Circle;
import shape.Cube;
import shape.Sphere;
import shape.Square;

public class UsingShape {
    public static void main(String[] args) {
        shape.Circle circle = new Circle(10);
        System.out.println(circle);    
        // circle.printDetails();     
        shape.Sphere sphere = new Sphere(3);
        System.out.println("\n"+sphere);

        shape.Square square = new Square(10);
        System.out.println("\n"+square);

        shape.Cube cube = new Cube(1);
        System.out.println(cube);
    }
}
