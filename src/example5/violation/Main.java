package example5.violation;

public class Main {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPayment("some order", 5000);
    }
}
