    public class Triangle extends Shape {
    private double base;
    private double height;
    private double a;
    private double c;
    //color,base,height,a,c
    Triangle(double base, double height, double a, double c,String color){
        super(color);
        this.base=base;
        this.height=height;
        this.a=a;
        this.c=c;
    }
    @Override
    public double area() {
        return (1.0/2.0) * (base * height);
    }

    @Override
    public double perimeter() {
        return a+base+c;
    }

    @Override
    public String toString() {
        return super.toString() + " which is also a Triangle";
    }

        @Override
        public int compareTo(Shape o) {
            return 0;
        }


        public static class EquilateralTriangle extends Triangle {
        public EquilateralTriangle(double height,String color){
            super(height,Math.sqrt(3)/2*height,height,height,color);
        }

        public String toString() {
            return super.toString() + " which is also an Equilateral Triangle";
        }
    }
}