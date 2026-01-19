package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class WildCardProducerExample {
    public static void printAllShapes(List<? extends Shape> shapes) {
        for (Shape s : shapes) {
            System.out.println(s.getArea());
        }
    }

    public static void main(String[] args) {
        List<Circle> circleList = new ArrayList<>();
        circleList.add(new Circle(3.0));
        circleList.add(new Circle(4.0));
        circleList.add(new Circle(5.0));
        printAllShapes(circleList);
    }
}
