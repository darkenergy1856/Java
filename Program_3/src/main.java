//Define an abstract class Shape in package P1. Inherit two more classes: Rectangle in
//        package P2 and Circle in package P3. Write a program to ask the user for the type of
//        shape and then using the concept of dynamic method dispatch, display the area of the
//        appropriate subclass. Also write appropriate methods to read the data. The main()
//        function should not be in any package.

import P1.Shape;
import P2.Rectangle;
import P3.Circle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Shape ref;
        System.out.println("Enter Your choice : ");
        System.out.println("(1) Rectangle");
        System.out.println("(2) Circle");

        Scanner input = new Scanner(System.in);

        int choice = input.nextInt();

        switch (choice) {
            case 1 -> {
                ref = new Rectangle();
                System.out.println("Area of Rectangle is : " + ref.area());
            }
            case 2 -> {
                ref = new Circle();
                System.out.println("Area of Circle is : " + ref.area());
            }
            default -> System.out.println("Invalid Choice . ");
        }

        input.close();
    }
}
