import java.util.ArrayList;
import java.util.List;

public class ListExample {

    private final List<Item> items = new ArrayList<>();

    public void addItems(Item item) {
        items.add(item);
        System.out.println("Added item to list with name " +
                "name: " + item.getName() + ";");
    }

    public void getItems() {
        if (items.size() == 0) {
            System.out.println("No items in list");
        } else {
            System.out.println("Available items...");
            for (Item item : items) {
                System.out.println("name: " + item.getName() + "; " +
                        "Item code: " + item.getCode() + "; " +
                        "Item price: " + item.getPrice() + ";");
            }
        }
    }

    public void findItem(Item item) {
        if (items.contains(item)) {
            System.out.println("Found item with name: " + item.getName() + "; " +
                    "Item code: " + item.getCode() + "; " +
                    "Item price: " + item.getPrice() + ";");
        } else {
            System.out.println("No item " + item.getName() + " in list");
        }
    }

    public void removeAllItems() {
        if (items.size() > 0) {
            do {
                for (int i = 0; items.size() > i; i++) {
                    Item item = items.get(i);
                    System.out.println("Removed item: " + item.getName());
                    items.remove(item);
                }
            } while (items.size() > 0);
        } else {
            System.out.println("No items in list");
        }
    }

    public void removeItem(Item item) {
        System.out.println("Removed item: " + item.getName());
        items.remove(item);
    }
}
