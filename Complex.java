public class Complex {
    private int real, imaginery;

    public Complex(int real, int imaginery) {
        this.real = real;
        this.imaginery = imaginery;
    }

    public void addComplex(Complex c1, Complex c2) {

        Complex temp = new Complex(0, 0);

        temp.real = c1.real + c2.real;
        temp.imaginery = c1.imaginery + c2.imaginery;

        System.out.println("Result of Addition is : " + temp.toString());
    }

    public String toString() {
        return this.real + " + " + this.imaginery + "i";
    }

    public void multiplyComplex(Complex c1, Complex c2) {
        Complex temp = new Complex(0, 0);

        temp.real = (c1.real * c2.real) - (c2.imaginery * c1.imaginery);
        temp.imaginery = (c1.real * c2.imaginery) + (c2.real * c1.imaginery);

        System.out.println("Result of Multiplication is : " + temp.toString());
    }

}