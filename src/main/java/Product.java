public class Product {

    int price;
    boolean megapack;

    public Product(int price) {
        this.price = price;
        this.megapack = false;
    }

    public int getPrice() {
        return price;
    }

    public boolean isMegapack() {
        return megapack;
    }
}
