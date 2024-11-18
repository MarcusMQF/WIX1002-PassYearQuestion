// LinearEquation.java
public class LinearEquation {
    // Private data fields
    private double a, b, c, d, e, f;
    
    // Constructor
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    // Check if equation is solvable
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }
    
    // Compute x value
    public double computeX() {
        return (e * d - b * f) / (a * d - b * c);
    }
    
    // Compute y value
    public double computeY() {
        return (a * f - e * c) / (a * d - b * c);
    }
    
    // Return the equation as a string
    @Override
    public String toString() {
        return String.format("%.0fx + %.0fy = %.0f\n%.0fx + %.0fy = %.0f", 
            a, b, e, c, d, f);
    }
}
