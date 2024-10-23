package Assignment2.Ques3;

public class Rectangle extends Shape {
    private double width;
    private double height;

        Rectangle(double width, double height){
        this.width = width;
        this.height = height;
      }
       /**
       * Calculates the area of rectangle
       * @return area of rectangle
       */
       public double area()
       {
         double result = width*height;
         return result;
       }
}
