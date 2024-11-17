class Delivery {
    private String sender;
    private String recipient;
    private double WeightOfPackage;

    public Delivery(String sender, String recipient, double WeightOfPackage) {
        this.sender = sender;
        this.recipient = recipient;
        this.WeightOfPackage = WeightOfPackage;
    }

    public double totalCost(){
        double totalCost = 0;
        if(WeightOfPackage >= 5) {
            totalCost += 5*2.8;
            if(WeightOfPackage >= 20){
                totalCost += 15*5.2;
                if(WeightOfPackage >= 50){
                    totalCost += 30*7;
                    totalCost += (WeightOfPackage-50)*8.6;
                } else{
                    totalCost += (WeightOfPackage-20)*7;
                }
            } else{
                totalCost += (WeightOfPackage-15)*5.2;
            }
        } else
            totalCost += WeightOfPackage*2.8;

        return totalCost;
    }

    @Override
    public String toString() {
        return  "From : " + sender +  " " +
                "To: " + recipient + '\n' +
                "Weight of Package : " + String.format("%.1f", WeightOfPackage) + " kg\n" +
                "Shipping Cost : RM" + String.format("%.2f", totalCost());
    }
}

class SpecialDelivery extends Delivery{
    private boolean WeekendDelivery;
    private boolean NighttimeDelivery;

    public SpecialDelivery(String sender, String recipient, double WeightOfPackage, boolean WeekendDelivery, boolean NighttimeDelivery) {
        super(sender, recipient, WeightOfPackage);
        this.WeekendDelivery = WeekendDelivery;
        this.NighttimeDelivery = NighttimeDelivery;
    }

    @Override
    public double totalCost(){
        double totalCost = super.totalCost();
        if(WeekendDelivery)
            totalCost += 50;
        if(NighttimeDelivery)
            totalCost *= 1.2;

        return totalCost;
    }

    @Override
    public String toString() {
       String output = super.toString() + '\n';

       if(WeekendDelivery)
           output += "Weekend Delivery\n";
        if(NighttimeDelivery)
            output += "Night Time Delivery\n";
        return output;
    }
}

public class Q5 {
    public static void main(String[] args) {
        SpecialDelivery delivery1 = new SpecialDelivery("Ali","Ahmad",4.4,false,false);
        SpecialDelivery delivery2 = new SpecialDelivery("Ah Chong","Fatimah",63.1,false,false);
        SpecialDelivery delivery3 = new SpecialDelivery("FSKTM, UM","FK, UM",32.5,true,false);
        SpecialDelivery delivery4 = new SpecialDelivery("Ang","Liew",19.0,true,true);

        System.out.println(delivery1.toString());
        System.out.println(delivery2.toString());
        System.out.println(delivery3.toString());
        System.out.println(delivery4.toString());

        double totalCost = delivery1.totalCost() + delivery2.totalCost() + delivery3.totalCost() + delivery4.totalCost();
        System.out.printf("The total shipping cost is RM %.2f%n",totalCost);
    }
}