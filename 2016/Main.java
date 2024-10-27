public class Main {
    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim", "1111222233334444");
        Point p = new Point("John Lim", "5555444433332222");
        
        // Reward for Rebate Card
        r.getReward("grocery", 124.8);
        r.getReward("other", 64.60);
        r.getReward("fuel", 95.40);
        r.getReward("utility", 100);
        r.getReward("other", 220);
        System.out.print(r.toString());
        System.out.println();

        // Point rewards
        p.getReward("saturday", 124.80);
        p.getReward("friday", 64.6);
        p.getReward("sunday", 95.4);
        p.getReward("friday", 100);
        p.getReward("tuesday", 220);
        System.out.println(p.toString());
        System.out.println();

        if (r.getTotalCashReward() > p.getTotalCashReward())
            System.out.println("The best card is Cash Rebate Card.");
        else
            System.out.println("The best card is Point Reward Card.");
    }
}
