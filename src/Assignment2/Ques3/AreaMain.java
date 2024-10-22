package Assignment2.Ques3;

import java.util.Scanner;

public class AreaMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.println("Enter 1 for Triangle, 2 for Rectangle, 3 for Square, 4 for Circle ");

    int choice = sc.nextInt();
           if(choice == 1){
            System.out.println("Enter witdh of the Triangle: ");
            double width = sc.nextDouble();
            System.out.println("Enter height of the Triangle: ");
            double height = sc.nextDouble();
            Triangle triangle = new Triangle(width, height);
            System.out.println("Area of triangle is " + triangle.area());
           }
           else if(choice == 2){
            System.out.println("Enter witdh of the Rectangle: ");
            double width = sc.nextDouble();
            System.out.println("Enter height of the Rectangle: ");
            double height = sc.nextDouble();
            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("Area of Rectangle is " + rectangle.area());
           }
           else if(choice == 3){
            System.out.println("Enter side of the Square: ");
            double side = sc.nextDouble();
            Square square = new Square(side);
            System.out.println("Area of Square is " + square.area());
           }
           else{
            System.out.println("Enter radius of the Circle: ");
            double radius = sc.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("Area of Circle is " + circle.area());
           }
          
    }
    // System.out.println("Enter width of triangle ");
    // double triangle_width = sc.nextDouble();
    // System.out.println("Enter height of triangle ");
    // double triangle_height = sc.nextDouble();
    // System.out.println("Enter width of rectangle ");
    // double rectangle_width = sc.nextDouble();
    // System.out.println("Enter height of rectangle ");
    // double rectangle_height = sc.nextDouble();
    // System.out.println("Enter side of square ");
    // double square_side = sc.nextDouble();
    // System.out.println("Enter radius of circle ");
    // double circle_radius = sc.nextDouble();

    // AreaService areaService = new AreaService();

    // System.out.println("Area of triangle is " + areaService.areaOfTriangle(triangle_width,  triangle_height));
    // System.out.println("Area of rectangle is " + areaService.areaOfRectangle(rectangle_width, rectangle_height));
    // System.out.println("Area of square is " + areaService.areaOfSquare(square_side));
    // System.out.println("Area of circle is " + areaService.areaOfCircle(circle_radius));
}


