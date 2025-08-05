package collections;
import java.util.*;

public class Cart {

    private List<Product> items = new ArrayList<>();
    private Set<String> Categories = new HashSet<>();
    private Map<String, Double> priceMap = new HashMap<>();

    public void addProduct (Product product){
        items.add(product);
        Categories.add(product.getCategory());
        priceMap.put(product.getName(), product.getPrice());
        System.out.println(product.getName() +" " + "added to cart.");
    }

    public void showCart(){
        System.out.println("\nCart Items: ");
        for(Product p : items) {
            System.out.println(p);
        }

        System.out.println("\nUnique Categories: ");
        for(String cat:Categories){
            System.out.println(cat);
        }
        System.out.println("\nProduct Prices: ");
        for(String name: priceMap.keySet()){
            System.out.println(name + " - " + priceMap.get(name));
        }

        System.out.println("\nTotal: " + getTotal());
    }
    private double getTotal(){
        return items.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
