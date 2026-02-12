public class EmailNotification extends Notification {

    public EmailNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void send() {
        System.out.println("Sending EMAIL to " + recipient + ": " + message);
    }
}
