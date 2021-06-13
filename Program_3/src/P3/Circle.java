package P3;

import P1.Shape;

import java.util.Scanner;

public class Circle extends Shape {
    private int radius;

    Scanner input = new Scanner(System.in);

    public Circle() {
        this.radius = 0;
    }

    @Override
    public void inputValue() {
        System.out.println("Enter the Radius of Circle : ");
        radius = input.nextInt();

        input.close();

    }

    @Override
    public double area() {
        inputValue();
        return Math.PI * radius * radius;
    }
}
