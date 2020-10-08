import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 *az aktuális  megrendelés ismeri a kosarat és a vevőt akihez tartozik
 *  esetleg ismerheti a végösszeget is tehát a discountok összegét is.
 */
public class Basket{
    private List<Product> actualBasket;
    private static Basket instance = new Basket();

    /**
     * make the constructor private so that this class cannot be
     * instantiated
     */

    private Basket(){
        this.actualBasket = new ArrayList<>();
    }

    /**
     * @return a Basket only one object is available
     */

    public static Basket getInstance(){
        return instance;
    }

    public List<Product> getActualBasket() {
        return actualBasket;
    }
}
