import java.util.List;

public class Buy3Pay2Discount implements Discount {


    /**
     * @param order
     * @return int discount amount
     *
     * megapack -6000: vannak nagy kiszerelésű, megapack típusú termékek. Ha ilyen termékből
     * egy teljes kartonnal (12 db) vásárol, akkor 6000 Ft kedvezményt kap kartononként.
     *
     */
    @Override
    public int calculateDiscount(Basket basket) {
        List<Product> products = basket.getActualBasket();
        int numberOfDiscountAmount = 3;

        int ruberDuckDiscount = 0;
        int sausageDiscount = 0;
        int actualNumberOfRuberDuck = 0;
        int actualNumberOfSausage = 0;



        for (Product p : products){
            if(p instanceof RubberDuck){
                actualNumberOfRuberDuck =  actualNumberOfRuberDuck ++;
                if(actualNumberOfRuberDuck == 3){
                   ruberDuckDiscount = ruberDuckDiscount + ( numberOfDiscountAmount * p.getPrice());
                   actualNumberOfRuberDuck = 0;
                }
            }
            if(p instanceof Sausage){
                actualNumberOfSausage = actualNumberOfSausage ++;
                if(actualNumberOfSausage == 3){
                    sausageDiscount = sausageDiscount + (sausageDiscount * p.getPrice());
                    actualNumberOfSausage = 0;
                }
            }
        }

        return  sausageDiscount + ruberDuckDiscount;
    }

}
