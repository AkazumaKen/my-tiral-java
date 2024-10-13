import java.util.Comparator;

public class PerimeterCompare implements Comparator <Shape>{
        public int compare(Shape a, Shape b) {
            return Double.compare(a.perimeter(), b.perimeter());
        }
    }




