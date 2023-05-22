package Exercise_3;

public class Main {
    public static void main(String[] args)
    {
        Shape circle = new Circle(10.0);
        System.out.println(">> CIRCLE OBJECT HAS BEEN CREATED <<");
        System.out.println("Area of Circle: " + circle.computeArea());
        System.out.println("Perimeter of Circle: " + circle.computePerimeter());
        System.out.println();

        Shape rectangle = new Rectangle(12.0, 15.0);
        System.out.println(">> RECTANGLE OBJECT HAS BEEN CREATED <<");
        System.out.println("Area of Rectangle: " + rectangle.computeArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.computePerimeter());
        System.out.println();

        Shape square = new Square(12.0);
        System.out.println(">> SQUARE OBJECT HAS BEEN CREATED <<");
        System.out.println("Area of Square: " + square.computeArea());
        System.out.println("Perimeter of Square: " + square.computePerimeter());
        System.out.println();

        Shape triangle = new Triangle(13.5, 9.7, 12.2);
        System.out.println(">> TRIANGLE OBJECT HAS BEEN CREATED <<");
        System.out.println("Area of Triangle: " + triangle.computeArea());
        System.out.println("Perimeter of Triangle: " + triangle.computePerimeter());
        System.out.println();

        Shape trapezium = new Trapezium(11.0, 17.0, 14.0, 20.0, 15.0);
        System.out.println(">> TRAPEZIUM OBJECT HAS BEEN CREATED <<");
        System.out.println("Area of Trapezium: " + trapezium.computeArea());
        System.out.println("Perimeter of Trapezium: " + trapezium.computePerimeter());

    }
}
