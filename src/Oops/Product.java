package Oops;

abstract class Product {
    private static int counter = 1000;
    private int id;
    protected String name;
    protected double price;

    public Product(String name, double price){
        this.id = counter++;
        this.name = name;
        this.price = price;

    }

    public int getId() {return id;}
    public double getPrice() {return price;}
    public String getName() {return name;}

    public abstract String getCategory();

    @Override
    public String toString() {
        return "[" + getId() + "] " + name +" - " + price +"(" + getCategory() + ")";

    }



}
