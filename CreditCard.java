class CreditCard{
    private String name;
    private String cardNumber;
    private String cardType;
    private double totalCashReward = 0.0;

    public CreditCard(String name, String cardNumber, String cardType){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    public double gettotalCashReward(){
        return totalCashReward;
    }

    public void setTotalCashReward(double totalCashReward){
        this.totalCashReward = totalCashReward;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nCard Number: " + cardNumber + "\nCard Type: " + cardType + "\nTotal Cash Reward: " + totalCashReward;
    }


}