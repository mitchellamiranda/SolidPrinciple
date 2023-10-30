package example5.solution;

public class CreditCard implements IBankCard {
    public void doTransaction(int amount) {
        System.out.println("tx done with CreditCard");
    }
}