import java.util.Comparator;

public class ColorCompare implements Comparator<Shape>{
                public int compare(Shape a, Shape b) {
                    return a.color.compareTo(b.color);
                }
            }



