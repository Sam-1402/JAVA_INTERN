package Exercise_3;

public class Rectangle extends Shape{
    private double Length;
    private double Width;
    public Rectangle(double length, double width)
    {
        this.Length = length;
        this.Width = width;
    }

    @Override
    public double computeArea() {
        double area = 0.0f;
        area = (this.Length * this.Width);
        return area;
    }

    @Override
    public double computePerimeter() {
        double perimeter = 0.0f;
        perimeter = (this.Length + this.Width)*2;
        return perimeter;
    }

    @Override
    public void drawShape() {

    }

    @Override
    public void colorShape() {

    }
}
