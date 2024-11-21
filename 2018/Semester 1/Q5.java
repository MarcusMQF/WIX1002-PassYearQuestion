public class Q5 {
    public static void main(String[] args) {
        Apple redApple = new Apple("Red", 8);
        Apple greenApple = new Apple("Green", 11);
        Watermelon localWatermelon = new Watermelon("Local", 7.6);
        Watermelon importedWatermelon = new Watermelon("Imported", 4.0);
        
        Fruit[] fruits = {redApple, greenApple, localWatermelon, importedWatermelon};
        
        Fruit cheapest = fruits[0];
        for(Fruit fruit : fruits) {
            System.out.println(fruit.toString());
            if(fruit.totalPrice() < cheapest.totalPrice()) {
                cheapest = fruit;
            }
        }
        
        System.out.println("The cheapest item is");
        System.out.println(cheapest.toString());
    }
}
