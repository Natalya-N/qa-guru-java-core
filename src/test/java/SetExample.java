import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    private final Set<Item> items = new HashSet<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Added item to set with name " +
                "name: " + item.getName() + ";");
    }

    public void getAvailableItems() {
        Iterator<Item> iterator = items.iterator();
        if (!iterator.hasNext()) {
            System.out.println("No available items");
        } else {
            System.out.println("Available items...");
            while (iterator.hasNext()) {
                Item item = iterator.next();
                if (item.isAvailable()) {
                    System.out.println("name: " + item.getName() + "; " +
                            "Item code: " + item.getCode() + "; " +
                            "Item price: " + item.getPrice() + ";");
                }
            }
        }
    }

    public void findItem(Item item) {
        if (items.contains(item)) {
            System.out.println("Found item with name: " + item.getName() + "; " +
                    "Item code: " + item.getCode() + "; " +
                    "Item price: " + item.getPrice() + ";");
        } else {
            System.out.println("No items with name " +  item.getName());
        }
    }

    public void removeItem(Item item) {
        if (items.remove(item)) {
            System.out.println("Remove item with name: " + item.getName());
            items.remove(item);
        } else {
            System.out.println("Item " + item.getName() + " doesn't exist in set");
        }
    }
}
