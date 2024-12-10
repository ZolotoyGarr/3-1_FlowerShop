import java.util.*;

public class FlowerShop {
    private static final Map<String, Integer> assortment = FlowerRegistry.getPossibleFlowers();

    public static Map<String, Integer> getAssortment() {
        return assortment;
    }

    public static ArrayList<Flower> collectRandomBouquet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of flowers for bouquet: ");
        int number = scanner.nextInt();
        Random random = new Random();
        ArrayList<Flower> bouquet = new ArrayList<>();
        List<String> names = new ArrayList<>(assortment.keySet());
        for (int i = 0; i < number; i++) {
            String randomName = names.get(random.nextInt(names.size()));
            Integer price = assortment.get(randomName);
            Flower randomFlower = new Flower(randomName, price);
            bouquet.add(randomFlower);
        }
        return bouquet;
    }

    private static int getBouquetPrice(ArrayList<Flower> bouquet) {
        int bouquetPrice = 0;
        for (Flower flower : bouquet) {
            bouquetPrice += (int) flower.getPrice();
        }
        return bouquetPrice;
    }
    public static void buyBouquet() {
        ArrayList<Flower> randomBouquet = collectRandomBouquet();
        System.out.println("Your bouquet: " + randomBouquet);
        System.out.println("Bouquet price: " + getBouquetPrice(randomBouquet));
    }
}