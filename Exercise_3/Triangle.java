package Exercise_3;

public class Triangle extends Shape{
    private double Breadth;
    private double Height;
    private double Length;
    public Triangle(double length, double breadth, double height)
    {
        this.Breadth = breadth;
        this.Height = height;
        this.Length = length;
    }

    @Override
    public double computeArea() {
        double area = 0.0f;
        area = (this.Breadth*this.Height)/2;
        return area;
    }

    @Override
    public double computePerimeter() {
       double perimeter = 0.0f;
       perimeter = (this.Breadth + this.Height + this.Length);
       return perimeter;
    }

    @Override
    public void drawShape() {

    }

    @Override
    public void colorShape() {

    }
}
