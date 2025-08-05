package Oops;

public class Electronics extends Product{
    private int warranty;

    public Electronics(String name, double price, int warranty) {
        super(name,price);
        this.warranty = warranty;
    }

    @Override
    public String getCategory() {
        return "Electronics";

    }

    public int getWarrenty() {
        return warranty;
    }

}
