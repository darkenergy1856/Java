public class Complex {
    private int real, imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void addComplex(Complex c1, Complex c2) {

        Complex temp = new Complex(0, 0);

        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;

        System.out.println("Result of Addition is : " + temp.toString());
    }

    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }

    public void multiplyComplex(Complex c1, Complex c2) {
        Complex temp = new Complex(0, 0);

        temp.real = (c1.real * c2.real) - (c2.imaginary * c1.imaginary);
        temp.imaginary = (c1.real * c2.imaginary) + (c2.real * c1.imaginary);

        System.out.println("Result of Multiplication is : " + temp.toString());
    }

}