import java.util.HashMap;

public class DiscountCalculatorController {
   private Discount discount;
    private Basket basket;

    public DiscountCalculatorController(Basket basket) {
        this.basket = basket;
        //TODO
    }

    public int calculateBasketPrice(){
//TODO
        return discount.calculateDiscount(basket);
    }

    public Discount getDiscount() {
        return discount;
    }

    public Basket getBasket() {
        return basket;
    }
}
