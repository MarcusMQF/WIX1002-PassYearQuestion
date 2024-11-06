
import java.util.Scanner;

class Complex{
    private double real;
    private double imag;

    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex c){
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public Complex subtract(Complex c){
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    @Override
    public String toString(){
        return "(" + real + " + " + imag + "i)";
    }
}

public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = sc.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imag1 = sc.nextDouble();
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = sc.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imag2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imag1);
        Complex c2 = new Complex(real2, imag2);

        System.out.println("First Complex Number: " + c1);
        System.out.println("Second Complex Number: " + c2);


        Complex sum = c1.add(c2);
        System.out.println("Sum: " + sum);

        Complex difference = c1.subtract(c2);
        System.out.println("Difference: " + difference);

        sc.close();
    }
}