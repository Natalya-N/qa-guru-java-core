public class Main {

    public static void main(String[] args) {

        Item bag = new Item("Сумка", "bag", true, 1000);
        Item dress = new Item("Платье", "dress", false, 500);
        Item hat = new Item("Шляпа", "hat", true, 300);
        Item skirt = new Item("Юбка", "skirt", true, 450);

        // List implementation
        ListExample newList = new ListExample();
        newList.addItems(bag);
        newList.addItems(dress);
        newList.addItems(hat);
        newList.addItems(skirt);
        newList.getItems();
        newList.removeItem(skirt);
        newList.removeAllItems();

        // Map implementation
        MapExample newMap = new MapExample();
        newMap.addItem(bag);
        newMap.addItem(dress);
        newMap.addItem(hat);
        newMap.addItem(skirt);
        newMap.removeItem(skirt);
        newMap.getItems();

        // Queue implementation
        QueueExample newQueue = new QueueExample();
        newQueue.removeFirstItem();
        newQueue.addItem(bag);
        newQueue.addItem(dress);
        newQueue.addItem(hat);
        newQueue.addItem(skirt);
        newQueue.getItems();
        newQueue.removeFirstItem();
        newQueue.getItems();

        // Set implementation
        SetExample newSet = new SetExample();
        newSet.addItem(bag);
        newSet.addItem(dress);
        newSet.addItem(hat);
        newSet.addItem(skirt);
        newSet.getAvailableItems();
        newSet.removeItem(skirt);
        newSet.removeItem(skirt);

    }
}
