package example4.violation;

public class NotificationService {
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        } else if (medium.equals("whatsApp")) {
            //write whatsApp related logic
            //use JavaMailSenderAPI
        } else {
            //write Mobile related logic
            //use JavaMailSenderAPI
        }
    }
}
