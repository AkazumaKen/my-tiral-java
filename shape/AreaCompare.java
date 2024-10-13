import java.util.Comparator;

public class AreaCompare implements Comparator<Shape>{

        public int compare(Shape s1, Shape s2) {
            return Double.compare(s1.area(), s2.area());
        }
    }


