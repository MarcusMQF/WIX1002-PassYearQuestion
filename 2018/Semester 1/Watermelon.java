public class Watermelon extends Fruit {
    private double weight;
    
    public Watermelon(String type, double weight) {
        super("Watermelon", type);
        this.weight = weight;
    }
    
    public double totalPrice() {
        double pricePerKg;
        if(getType().equals("Local")) {
            if(weight < 2) pricePerKg = 2.25;
            else if(weight <= 5) pricePerKg = 1.95;
            else pricePerKg = 1.65;
        } else {
            if(weight < 2) pricePerKg = 3.75;
            else if(weight <= 5) pricePerKg = 3.45;
            else pricePerKg = 3.15;
        }
        return weight * pricePerKg;
    }
    
    public String toString() {
        return super.toString() + " - " + weight + "kg = RM " + String.format("%.2f", totalPrice());
    }
}