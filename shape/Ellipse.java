public class Ellipse extends Shape {
    private double a;
    private double b;
    Ellipse(double a, double b, String color){
        super(color);
        this.a=a;
        this.b=b;
    }
    @Override
    public double area() {
        return 3.14159*a*b;
    }
    @Override
    public double perimeter() {
        return 3.14159*(3*(a+b)- Math.sqrt((a+(3*b))*(b+(3*a))));
    }

    @Override
    public String toString() {
        return super.toString() + " which is also an Ellipse";
    }

    @Override
    public int compareTo(Shape o) {
        return 0;
    }

    public static class Circle extends Ellipse {

        public Circle(double rad,String color){
            super(rad,rad,color);
        }
        public String toString() {
            return super.toString() + " which is also a Circle";
        }
    }
}