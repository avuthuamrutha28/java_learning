package Oops;

public class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size){
        super(name, price);
        this.size = size;
    }
    @Override
    public String getCategory() {
        return "Clohing";
    }
    public String getSize() {
        return size;
    }
}
