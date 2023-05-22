package Exercise_3;

public class Square extends Shape{
    private double Side;
    public Square(double side)
    {
        this.Side = side;
    }

    @Override
    public double computeArea() {
        double area = 0.0f;
        area = Math.pow(this.Side, 2);
        return area;
    }

    @Override
    public double computePerimeter() {
        double perimeter = 0.0f;
        perimeter = (this.Side)*4;
        return perimeter;
    }

    @Override
    public void drawShape() {

    }

    @Override
    public void colorShape() {

    }
}
