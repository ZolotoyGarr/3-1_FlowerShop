import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FlowerRegistry {
    private static final Map<String, Integer> possibleFlowers = new HashMap<>();

    static {
        registerFlower("Rose", 10);
        registerFlower("Tulip", 5);
        registerFlower("Lily", 7);
    }

    public static void registerFlower(String name, int price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Flower name cannot be null or empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        possibleFlowers.put(name.toLowerCase(), price);
    }

    public static boolean isNameAllowed(String name) {
        return possibleFlowers.containsKey(name.toLowerCase());
    }

    public static Map<String, Integer> getPossibleFlowers() {
        return Collections.unmodifiableMap(possibleFlowers);
    }

    public static Flower createFlower(String name, double price) {
        if (!isNameAllowed(name)) {
            throw new IllegalArgumentException("Flower name '" + name + "' is not allowed");
        }
        return Flower.create(name, price);
    }
}
