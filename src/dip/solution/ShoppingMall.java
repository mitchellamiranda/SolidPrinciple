package dip.solution;

public class ShoppingMall {
    private IBankCard bankCard;

    public ShoppingMall(IBankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPayment(Object order, int amount) {
        bankCard.doTransaction(amount);
    }
}
