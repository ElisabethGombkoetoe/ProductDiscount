import java.util.List;

/**
 *az aktuális  megrendelés ismeri a kosarat és a vevőt akihez tartozik
 *  esetleg ismerheti a végösszeget is tehát a discountok összegét is.
 */
public class Basket {
    List<Product> actualBasket;

    public Basket(List<Product> actualBasket) {
        this.actualBasket = actualBasket;
    }

    public List<Product> getActualBasket() {
        return actualBasket;
    }

}
