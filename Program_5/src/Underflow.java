public class Underflow extends Exception{


    @Override
    public String toString(){
        System.out.println("Pop Operation failed. !!");
        return "Stack is Empty.";
    }
}
