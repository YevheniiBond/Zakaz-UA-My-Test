package Test;

public class OurGame {
    public static void main(String[] args) {
        Users user1 = new Users(" Jack",27);
        user1.registerUser();

        PremiumUsers user2 = new PremiumUsers("Andrew",25);
        user2.registerUser();
        user2.getBonus();
    }
}
