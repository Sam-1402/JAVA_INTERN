package Exercise_3;
import java.lang.Math;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;

    }

    @Override
    public double computeArea() {
        double area = 0.0f;
        area = Math.pow(this.radius,2)* Math.PI;
        return area;
    }

    @Override
    public double computePerimeter() {
        double perimeter = 0.0f;
        perimeter = (2 * Math.PI * this.radius);
        return perimeter;
    }

    @Override
    public void drawShape() {

    }

    @Override
    public void colorShape() {

    }
}
