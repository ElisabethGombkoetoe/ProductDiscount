public class ActualOrder {

    Basket basket;


    public ActualOrder(Basket basket) {
        this.basket = basket;
    }

    public int calculateBestPreis(){
        Discount megaDiscount = new MegapackDiscount();
        Discount buy3Pay2Discount = new Buy3Pay2Discount();
        // TODO ezt megirni
    return 0;
    }

    public Basket getBasket() {
        return basket;
    }
}
