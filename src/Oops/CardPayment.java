package Oops;

public class CardPayment implements Payment {
    public void pay(double amount){
        System.out.println("paid" + " " + amount+ " " + "using card.");
    }

}
