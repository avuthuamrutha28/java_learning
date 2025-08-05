package Oops;

import java.util.ArrayList;
import java.util.List;

class Cart {
    private Customer customer;
    private List<Product> items = new ArrayList<Product>();
    public Cart(Customer customer) {
        this.customer = customer;
        }

        public void addProduct(Product p) {
            items.add(p);
            System.out.println(p.getName() +" " + "added to cart.");
        }

        public double getTotalAmount() {
            return items.stream().mapToDouble(Product::getPrice).sum();
        }

        public void showCart() {
            System.out.println("\n cart for" + customer.getName() + ":");
            items.forEach(System.out::println);
            System.out.println("Total: " + getTotalAmount());
        }
    }


