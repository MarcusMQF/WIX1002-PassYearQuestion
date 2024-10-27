public class Point extends CreditCard {
    private double totalPoints; // Store total points instead of spending amount
    private int rewardCount; // Counter for the number of rewards given

    // Constructor
    public Point(String name, String cardNumber) {
        super(name, cardNumber, "Point Reward Card");
        this.totalPoints = 0;
        this.rewardCount = 0;
    }

    // Method to compute the reward points based on the day of the week
    public void getReward(String day, double spendingAmount) {
        int points = (int) spendingAmount; // 1 point per RM1 spent
        rewardCount++;

        // Apply bonus points based on the day
        switch (day.toLowerCase()) {
            case "friday":
                points *= 2;
                break;
            case "saturday":
                points *= 3;
                break;
            case "sunday":
                points *= 4;
                break;
            // No bonus on other days
        }

        // Add points to total points
        totalPoints += points;
    }

    // Method to return total cash equivalent of points
    public double getTotalCashReward() {
        return totalPoints * 0.01; // Convert points to cash (1 point = RM0.01)
    }

    @Override
    public String toString() {
        return super.toString() + ", Total Points: " + totalPoints;
    }
}
