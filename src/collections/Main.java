package collections;

public class Main {
    public static void main(String[] args){
        Cart cart = new Cart();

        Product laptop = new Electronics("Laptop", 50000);
        Product tshirt = new Clothing("T-Shirt", 799);
        Product headphones = new Electronics("Headphones", 2000);

        cart.addProduct(laptop);
        cart.addProduct(tshirt);
        cart.addProduct(headphones);

        cart.showCart();




    }
}
