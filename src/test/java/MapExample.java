import java.util.HashMap;
import java.util.Map;

public class MapExample {

    private final Map<String, Item> items = new HashMap<>();

    public void addItem(Item item) {
        items.put(item.getCode(), item);
        System.out.println("Added item to map with name " +
                "name: " + item.getName() + ";");
    }

    public void removeItem(Item item) {
        items.remove(item.getCode());
    }

    public void getItems() {
        for (Item item : items.values()) {
            System.out.println("name: " + item.getName() + "; " +
                    "Item code: " + item.getCode() + "; " +
                    "Item price: " + item.getPrice() + ";");
        }
    }
}
