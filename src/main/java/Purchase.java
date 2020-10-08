import java.security.InvalidAlgorithmParameterException;
import java.util.List;

/**
 * The current purchase knows the shopping basket as well as its value and the discount
 * Can be extended in the future with the customer.
 */
public class Purchase {
    Basket basket;


    public Purchase() {
        this.basket = Basket.getInstance();
    }

    /**
     * @return int the maximal discount for this basket,
     * there is no possibility to take more than one discount in the same time
     */
    public int calculateMaxDiscount(){

        int amountOfMegapackDiscount = 0;
        int amountOfBuy3Pay2Discount = 0;

         Discount megapackDiscount = new MegapackDiscount();
         Discount buy3Pay2Discount = new Buy3Pay2Discount();
            amountOfMegapackDiscount = megapackDiscount.calculateDiscount(basket);
            amountOfBuy3Pay2Discount = buy3Pay2Discount.calculateDiscount(basket);

        if(Integer.compare(amountOfMegapackDiscount,amountOfBuy3Pay2Discount) >= 0){
            return amountOfMegapackDiscount;
        }else {
            return amountOfBuy3Pay2Discount;
        }
    }

    /**
     * @return first calculate the full preis for the basket and
     * in the secound step it takes the discount
     * @throws InvalidAlgorithmParameterException if the basket hasn t got a product
     */
    public int calculateValueOfThePurchase() throws InvalidAlgorithmParameterException {
        int valueOfThePurche = 0;
        int discount = 0;
        if(basket.getActualBasket() != null){
            List<Product> products = basket.getActualBasket();
            for(Product p : products){
                if(p instanceof RubberDuck) {
                    valueOfThePurche = valueOfThePurche + p.getPrice();
                }
                if(p instanceof Sausage){
                    valueOfThePurche = valueOfThePurche + p.getPrice();
                }
                if(p instanceof Cucumber){
                    valueOfThePurche = valueOfThePurche + p.getPrice();
                }
                if(p instanceof Chestnut){
                    valueOfThePurche = valueOfThePurche + p.getPrice();
                }
                discount = calculateMaxDiscount();
            }
        }else {
            throw new InvalidAlgorithmParameterException();
        }
    return valueOfThePurche - discount;
    }
}
