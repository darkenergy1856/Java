package P2;


import P1.Shape;

import java.util.Scanner;

public class Rectangle extends Shape {
    private int width, length;

    Scanner input = new Scanner(System.in);

    public Rectangle() {
        this.width = 0;
        this.length = 0;
    }

    @Override
    public void inputValue() {
        System.out.println("Enter the Length of Rectangle : ");
        length = input.nextInt();

        System.out.println("Enter the Width of Rectangle : ");
        width = input.nextInt();

        input.close();
    }

    @Override
    public double area() {
        inputValue();
        return width * length;
    }
}
