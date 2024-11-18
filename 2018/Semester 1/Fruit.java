public abstract class Fruit {
    private String name;
    private String type;
    
    public Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }
    
    public abstract double totalPrice();
    
    public String toString() {
        return type + " " + name;
    }
}