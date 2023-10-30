package example4.solution;

public interface INotificationService {
    public void sendOTP(String medium);

    public void sendTransactionNotification(String medium);
}
