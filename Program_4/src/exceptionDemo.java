//Create an exception subclass UnderAge, which prints “Under Age” along with the age
//        value when an object of UnderAge class is printed in the catch statement. Write a class
//        exceptionDemo in which the method test() throws UnderAge exception if the variable
//        age passed to it as argument is less than 18. Write main() method also to show working
//        of the program

import java.util.Scanner;

public class exceptionDemo {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter The age : ");
        int age = input.nextInt();
        test(age);

        input.close();

    }

    public static void test (int age) {

        try {
            if (age < 18) {
                throw new UnderAge();
            } else {
                System.out.println("Age is above 18 years");
            }
        } catch (UnderAge underAge) {
            System.out.println(underAge.toString() + age);
        }

    }
}