//Create a class TwoDim which contains private members as x and y coordinates in
//        package P1. Define the default constructor, a parameterized constructor and override
//        toString() method to display the co-ordinates. Now reuse this class and in package P2
//        create another class ThreeDim, adding a new dimension as z as its private member.
//        Define the constructors for the subclass and override toString() method in the subclass
//        also. Write appropriate methods to show dynamic method dispatch. The main() function
//        should be in a package P.

package P;

import P1.TwoDim;
import P2.ThreeDim;

public class main {
    public static void main(String[] args) {
        TwoDim twoDim = new TwoDim(5, 6);
        twoDim.toString();
        TwoDim empty = new TwoDim();
        empty.toString();

        ThreeDim threeDim = new ThreeDim(5);
        threeDim.toString();
        ThreeDim emptyDim = new ThreeDim();
        emptyDim.toString();
        ThreeDim allFeild = new ThreeDim(5,6,7);
        allFeild.toString();
    }
}
