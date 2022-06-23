package Test;

public class PremiumUsers extends Users {

    public PremiumUsers(String nickname, int age) {
        super(nickname, age); // супер посилається на конструктор батьківського класу на конструктор Users;
    }

    public void getBonus(){
        System.out.println("You earnned 5000 coints");
    }
}
