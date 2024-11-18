public class Apple extends Fruit {
    private int quantity;
    
    public Apple(String type, int quantity) {
        super("Apple", type);
        this.quantity = quantity;
    }
    
    public double totalPrice() {
        if(getType().equals("Red")) {
            return quantity * 1.80;
        } else {
            return quantity * 1.20;
        }
    }
    
    public String toString() {
        return super.toString() + " - " + quantity + " = RM " + String.format("%.2f", totalPrice());
    }
}
