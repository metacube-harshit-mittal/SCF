package Assignment2.Ques3;
/*
 * 
 */
public class AreaService {
    public double areaOfTriangle(double width, double height)
    {
        double area = 0.5*width*height;
        return area;
    }

    public double areaOfRectangle(double width, double height)
    {
        double area = width*height;
        return area;
    }

    public double areaOfSquare(double side)
    {
        double area = side*side;
        return area;
    }

    public double areaOfCircle(double radius)
    {
        double area = 3.14*radius*radius;
        return area;
    }
}
