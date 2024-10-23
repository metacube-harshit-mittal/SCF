package Assignment2.Ques3;

public class Square extends Shape {
    private double side;

    Square(double side){
      this.side = side;
    }
     /**
       * Calculates the area of Square
       * @return area of square
       */   
     public double area()
     {
       double result = side*side ;
       return(result);
     }
}
