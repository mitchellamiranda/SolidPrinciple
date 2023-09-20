package ocp.solution;

public interface INotificationService {
    public void sendOTP(String medium);

    public void sendTransactionNotification(String medium);
}
