import java.util.Random;

public class FlowerShop {
    public static int collectBouquet(int number) {
        Random random = new Random();
        Flower[] flowers = Flower.values();
        int bouquetPrice = 0;
        for (int i = 0; i < number; i++) {
            Flower randomFlower = flowers[random.nextInt(flowers.length)];
            System.out.print(randomFlower.getName() + " ");
            bouquetPrice += randomFlower.getPrice();
        }
        System.out.println();
        return bouquetPrice;
    }
}