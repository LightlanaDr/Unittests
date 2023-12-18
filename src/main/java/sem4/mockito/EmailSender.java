package sem4.mockito;

public interface EmailSender {
    void sendEmail(String to, String subject, String body);
}