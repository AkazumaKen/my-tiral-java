import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5, 10)); // Assuming a Rectangle class exists
        shapes.add(new Circle(7)); // Assuming a Circle class exists

        // Sort shapes by area using AreaCompare
        Collections.sort(shapes, new AreaCompare());

        // Print sorted shapes
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}
