// Design a class Complex having a real part (x) and an imaginary part (y). Provide methods
// to perform the following on complex numbers:
// a) Add two complex numbers.
// b) Multiply two complex numbers.
// c) toString() method to display complex numbers in the form: x + i y



public class App {
    public static void main(String[] args) throws Exception {
        Complex c1 = new Complex(5, 10);
        Complex c2 = new Complex(5, 10);
        Complex temp = new Complex(0,0);

        temp.multiplyComplex(c1, c2);
        temp.addComplex(c1, c2);       
    }

}


