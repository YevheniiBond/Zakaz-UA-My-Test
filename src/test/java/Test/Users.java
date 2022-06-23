package Test;

public class Users {
    String nickname;
    int age;
 public  Users( String nickname, int age){
     this.nickname = nickname;
     this.age = age;
 }

 public void registerUser(){
     System.out.println("User" + nickname + " is registered");
 }
}
