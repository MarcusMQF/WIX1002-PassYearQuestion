abstract class Fruit {
    private String name;
    private String type;

    public Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Abstract method for calculating total price
    abstract public double totalPrice();

    @Override
    public String toString() {
        return "Fruit [name=" + name + ", type=" + type + "]";
    }
}

class Apple extends Fruit {
    private int quantity;

    public Apple(String name, String type, int quantity) {
        super(name, type);
        this.quantity = quantity;
    }

    @Override
    public double totalPrice() {
        // Calculate price based on type
        if (super.toString().contains("Red")) {
            return quantity * 1.8;
        } else {
            return quantity * 1.2;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [quantity=" + quantity + ", totalPrice=" + totalPrice() + "]";
    }
}

class Watermelon extends Fruit {
    private double weight;

    public Watermelon(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }

    @Override
    public double totalPrice() {
        // Calculate price based on type and weight
        if (super.toString().contains("Local")) {
            if (weight < 2) return weight * 2.25;
            if (weight <= 5) return weight * 1.95;
            return weight * 1.65;
        } else {
            if (weight < 2) return weight * 3.75;
            if (weight <= 5) return weight * 3.45;
            return weight * 3.15;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [weight=" + weight + ", totalPrice=" + totalPrice() + "]";
    }
}

public class Q5 {
    public static void main(String[] args) {
        // Create instances of fruits
        Apple f1 = new Apple("Apple", "Red", 8); // Corrected constructor arguments
        Apple f2 = new Apple("Apple", "Green", 11);
        Watermelon f3 = new Watermelon("Watermelon", "Local", 7.6);
        Watermelon f4 = new Watermelon("Watermelon", "Imported", 4.0);

        // Print details of each fruit including total price
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        // Find the cheapest item
        System.out.println("The cheapest item is");
        double minPrice = Math.min(Math.min(f1.totalPrice(), f2.totalPrice()), Math.min(f3.totalPrice(), f4.totalPrice()));

        if (minPrice == f1.totalPrice()) {
            System.out.println(f1);
        } else if (minPrice == f2.totalPrice()) {
            System.out.println(f2);
        } else if (minPrice == f3.totalPrice()) {
            System.out.println(f3);
        } else {
            System.out.println(f4);
        }
    }
}
