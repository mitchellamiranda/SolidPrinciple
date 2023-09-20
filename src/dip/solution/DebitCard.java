package dip.solution;

public class DebitCard implements IBankCard {
    public void doTransaction(int amount) {
        System.out.println("tx done with DebitCard");
    }
}
