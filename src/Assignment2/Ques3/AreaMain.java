package Assignment2.Ques3;

import java.util.Scanner;

public class AreaMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter width of triangle ");
    double triangle_width = sc.nextDouble();
    System.out.println("Enter height of triangle ");
    double triangle_height = sc.nextDouble();
    System.out.println("Enter width of rectangle ");
    double rectangle_width = sc.nextDouble();
    System.out.println("Enter height of rectangle ");
    double rectangle_height = sc.nextDouble();
    System.out.println("Enter side of square ");
    double square_side = sc.nextDouble();
    System.out.println("Enter radius of circle ");
    double circle_radius = sc.nextDouble();

    AreaService areaService = new AreaService();

    System.out.println("Area of triangle is " + areaService.areaOfTriangle(triangle_width,  triangle_height));
    System.out.println("Area of rectangle is " + areaService.areaOfRectangle(rectangle_width, rectangle_height));
    System.out.println("Area of square is " + areaService.areaOfSquare(square_side));
    System.out.println("Area of circle is " + areaService.areaOfCircle(circle_radius));
}
}

