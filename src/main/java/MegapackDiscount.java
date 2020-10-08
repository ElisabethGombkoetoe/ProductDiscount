import java.util.*;

public class MegapackDiscount implements Discount{

    /**
     * @param basket
     * @return int discount amount
     *
     * Vannak nagy kiszerelésű, megapack típusú termékek,
     * Cucumber Chestnut
     * Ha ilyen termékből egy teljes kartonnal (12 db) vásárol,
     * akkor 6000 Ft kedvezményt kap kartononként.
     *
     */
    @Override
    public int calculateDiscount(Basket basket) {
        List<Product>  products = basket.getActualBasket();

        int discount = 6000;
        int actualNumberOfCucumber = 0;
        int actualNumberOfChestnut = 0;
        int megapackSize = 12;
        int numberOfComplettMegapacks = 0;

        for (Product p : products){
            if(p.isMegapack()) {
                if (p instanceof Cucumber) {
                    actualNumberOfCucumber = actualNumberOfCucumber++;
                    numberOfComplettMegapacks = numberOfComplettMegapacks + (actualNumberOfCucumber / megapackSize);
                }
                if (p instanceof Chestnut) {
                    actualNumberOfChestnut = actualNumberOfChestnut++;
                    numberOfComplettMegapacks = numberOfComplettMegapacks + (actualNumberOfChestnut / megapackSize);
                }
            }
        }

        return numberOfComplettMegapacks * discount;
    }

}
