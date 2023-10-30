package example5.solution;

public class Main {
    public static void main(String[] args) {
        IBankCard bankCard1 = new DebitCard();
        IBankCard bankCard2 = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard2);
        shoppingMall.doPayment("some order", 5000);
    }
}
