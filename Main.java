public class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification("black@example.com", "Welcome!");
        Notification sms = new SMSNotification("0912...", "Your code is 1234");
        Notification push = new PushNotification("black", "New message!");

        email.send();
        sms.send();
        push.send();
    }
}
