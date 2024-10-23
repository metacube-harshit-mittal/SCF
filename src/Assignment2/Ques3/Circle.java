package Assignment2.Ques3;

public class Circle extends Shape {
    private double radius;

      Circle(double radius){
        this.radius = radius;
      }
            /**
       * Calculates the area of circle
       * @return area of circle
       */
       public double area()
       {
         double result = 3.14*radius*radius ;
         return result;
       }
}
