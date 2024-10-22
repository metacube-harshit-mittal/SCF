package Assignment2.Ques3;

public class Triangle extends Shape{
    private double width;
    private double height;

      Triangle(double width, double height){
        this.width = width;
        this.height = height;
      }
      /**
       * calculates the area of triangle
       * @return area of triangle
       */
       public double area()
       {
         double result = 0.5*width*height ;
         return(result);
       }
      }
