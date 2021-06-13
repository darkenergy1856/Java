//Create a class TwoDim which contains private members as x and y coordinates in
//        package P1. Define the default constructor, a parameterized constructor and override
//        toString() method to display the co-ordinates. Now reuse this class and in package P2
//        create another class ThreeDim, adding a new dimension as z as its private member.
//        Define the constructors for the subclass and override toString() method in the subclass
//        also. Write appropriate methods to show dynamic method dispatch. The main() function
//        should be in a package P.

package P1;

public class TwoDim {
    private int x, y;

    public TwoDim() {
        this.x = 0;
        this.y = 0;
    }

    public TwoDim(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        System.out.println("X co-ordinate = " + x);
        System.out.println("Y co-ordinate = " + y);
        return null;
    }


}
