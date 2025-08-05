package Oops;

public class ECommerceApp {
    public static void main(String[] args){
        Address addr = new Address("Tenali", "500081");
        Customer cust = new Customer("Amrutha", addr);

        Cart cart = new Cart(cust);

        cart.addProduct(new Electronics("Laptop", 50000, 2));
        cart.addProduct(new Clothing("T-Shirt", 799, "M"));

        cart.showCart();

        Payment payment;
        payment = new CardPayment();
        payment.pay(cart.getTotalAmount());

    }

}
