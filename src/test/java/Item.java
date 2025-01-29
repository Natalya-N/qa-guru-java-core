public class Item {

    private String name;
    private String code;
    private boolean isAvailable;
    private int price;

    public Item(String name, String code, boolean isAvailable, int price) {
        this.name = name;
        this.code = code;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
