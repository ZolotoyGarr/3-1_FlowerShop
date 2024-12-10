public class Flower {
    private final String name;
    private double price;

    public Flower(String name, double price) {
        this.name = name;
        this.price = price;
    }

    static Flower create(String name, double price) {
        return new Flower(name, price);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flower{name='" + name + "', price=" + price + "}";
    }
}
