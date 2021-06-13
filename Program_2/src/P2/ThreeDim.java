//Create a class TwoDim which contains private members as x and y coordinates in
//        package P1. Define the default constructor, a parameterized constructor and override
//        toString() method to display the co-ordinates. Now reuse this class and in package P2
//        create another class ThreeDim, adding a new dimension as z as its private member.
//        Define the constructors for the subclass and override toString() method in the subclass
//        also. Write appropriate methods to show dynamic method dispatch. The main() function
//        should be in a package P.


package P2;

import P1.TwoDim;

public class ThreeDim extends TwoDim {

    private int z;
    TwoDim coordinate;

    public ThreeDim(int x, int y, int z) {

        TwoDim temp = new TwoDim(x, y);
        coordinate = temp;
        this.z = z;
    }

    public ThreeDim() {
        TwoDim temp = new TwoDim();
        coordinate = temp;
        this.z = 0;
    }

    public ThreeDim(int z) {
        this.z = z;
        TwoDim temp = new TwoDim();
        coordinate = temp;
    }

    @Override
    public String toString() {
        coordinate.toString();
        System.out.println("Z co-ordinate = " + z);
        return null;
    }
}
