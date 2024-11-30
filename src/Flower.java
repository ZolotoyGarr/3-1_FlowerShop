public enum Flower {
    ROSE(1, "Rose"),
    CORNFLOWER(2, "Cornflower"),
    CHAMOMILE(3, "Chamomile"),
    CHRYSANTHEMUM(4, "Chrysanthemum");
    private final int price;
    private final String name;

    Flower(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}