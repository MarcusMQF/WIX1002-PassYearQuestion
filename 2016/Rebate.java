public class Rebate extends CreditCard {
    private double totalCashReward; // Store total cash reward

    // Constructor
    public Rebate(String name, String cardNumber) {
        super(name, cardNumber, "Cash Rebate Card");
        this.totalCashReward = 0;
    }

    // Method to get rewards based on type and price
    public void getReward(String type, double price) {
        if (type.equalsIgnoreCase("fuel")) {
            totalCashReward += price * 0.08; // 8% rebate on fuel
            if (price >= 100) {
                totalCashReward += 8; // Additional RM8 if price is RM100 or more
            }
        } else if (type.equalsIgnoreCase("utility")) {
            totalCashReward += price * 0.05; // 5% rebate on utility
        } else if (type.equalsIgnoreCase("grocery")) {
            totalCashReward += price * 0.02; // 2% rebate on grocery
        } else {
            totalCashReward += price * 0.002; // 0.2% rebate on other categories
        }
    }

    // Method to get the total cash reward
    public double getTotalCashReward() {
        return totalCashReward;
    }

    // Method to set total cash reward (if you need to reset or update it)
    public void setTotalCashReward(double totalCashReward) {
        this.totalCashReward = totalCashReward;
    }

    @Override
    public String toString() {
        return super.toString() + ", Total Cash Reward: " + totalCashReward;
    }
}
