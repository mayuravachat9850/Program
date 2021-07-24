package module4_Class;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 20;
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}
