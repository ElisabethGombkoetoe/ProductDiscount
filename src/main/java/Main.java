public class Main {
    public static void main(String[] args) {

        Purchase purchase = new Purchase();

        for(int i = 0; i< 12; i++ ){
            Product rubberDuck = new RubberDuck(30);
            purchase.basket.getActualBasket().add(rubberDuck);
            if(i % 5 != 0){
                Product chestnut = new Chestnut(5);
                purchase.basket.getActualBasket().add(chestnut);
            }
            if( i % 2 == 0){
                Product cucumber = new Cucumber(10);
                purchase.basket.getActualBasket().add(cucumber);
            }
            else {
                Product sausage = new Sausage(10);
                purchase.basket.getActualBasket().add(sausage);
            }
        }
        try {
            int summ = purchase.calculateValueOfThePurchase() ;
            System.out.println(summ);
        }catch (Exception e){
            System.out.println("Basket is empty. Please add a Product to the Basket!");
        }

    }
}
