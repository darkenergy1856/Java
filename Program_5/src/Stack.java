
import java.util.Scanner;

public class Stack {
    private int pointer = -1;
    private final int[] arr;

    public Stack(int length) {
        arr = new int[length];
    }

    private void push(int value){
        try{
            if (pointer+1 < arr.length) {
                pointer +=1;
                arr[pointer] = value;
            }
            else
                throw new Overflow();
        }catch (Overflow e){
            System.out.println(e.toString());
        }
    }

    private void pop(){
        try {
            if (pointer < 0) {
                throw new Underflow();
            }else {
                pointer -= 1;
            }
        }catch(Underflow e){
            System.out.println(e.toString());
        }
    }

    public void display(){
        if (pointer < 0){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Elements of Stack is : ");
        for (int i = 0 ; i <= pointer ; i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("Enter the size of stack.");
        int size  = input.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            System.out.println("Choose the operation you want to perform.");
            System.out.println("1) Push Operation.");
            System.out.println("2) Pop Operation.");
            System.out.println("3) Print the Stack.");
            System.out.println("4) Exit the Program.");

            choice = input.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the Value.");
                    int temp = input.nextInt();
                    stack.push(temp);
                }
                case 2 -> stack.pop();
                case 3 -> stack.display();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid Input.");
            }
        }
    }
}
