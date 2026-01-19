package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class ShapeContainer<T extends Shape> {
    private List<T> shapes = new ArrayList<>();

    public void add(T shape) {
        shapes.add(shape);
    }

    public double totalArea() {
        double sum = 0;

        for (T s : shapes) {
            sum += s.getArea();
        }
        return sum;
    }
}
