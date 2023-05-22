package Exercise_3;

public class Trapezium extends Shape{
    private double A;
    private double Height;
    private double B;
    private double C;
    private double D;
    
    public Trapezium(double a, double b, double c, double d, double height)
    {
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.Height = height;

    }

    @Override
    public double computeArea() {
        double area = 0.0f;
        area = ((this.B + this.A)/2) * (this.Height);
        return area;
    }

    @Override
    public double computePerimeter() {
        double perimeter = 0.0f;
        perimeter = (this.B + this.C + this.D + this.A);
        return perimeter;
    }

    @Override
    public void drawShape() {

    }

    @Override
    public void colorShape() {

    }
}
