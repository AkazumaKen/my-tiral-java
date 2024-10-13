import PersonInteleji.Circle;
import PersonInteleji.Rectangle;
import PersonInteleji.Shape;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle shape1 = new Rectangle(12.1,2.3);
        Shape shape2 = new Circle(14);
        Shape shaperec = new Rectangle(19.5,16.2);

        shape1.setWidth(10.2);

        shaperec.draw();
        shape1.draw();
        shape2.draw();





    }
}