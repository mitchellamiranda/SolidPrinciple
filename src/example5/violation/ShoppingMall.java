package example5.violation;

public class ShoppingMall {
    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPayment(Object order, int amount) {
        debitCard.doTransaction(amount);
    }
}
