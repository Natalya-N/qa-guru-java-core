import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    private final Queue<Item> items = new LinkedList<>();

    public void addItem(Item item) {
        items.offer(item);
        System.out.println("Added item to queue with name " +
                "name: " + item.getName() + ";");
    }

    public void getItems() {
        Iterator<Item> iterator = items.iterator();
        System.out.println("Available items");
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println("name: " + item.getName() + "; " +
                    "Item code: " + item.getCode() + "; " +
                    "Item price: " + item.getPrice() + ";");

        }
    }

    public void removeFirstItem() {
        if (items.size() != 0) {
            items.poll();
        } else {
            System.out.println("Items list is empty");
        }
    }
}
