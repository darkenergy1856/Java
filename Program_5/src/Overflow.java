public class Overflow extends Exception {


    @Override
    public String toString() {
        System.out.println("Push Operation Failed.");
        return "Stack is full .";
    }
}
