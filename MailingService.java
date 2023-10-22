public class MailingService implements IMailing {
    @Override
    public void sendMail(String address, String message, String destination, double cost) {
        // Implementation for sending mail
        System.out.println("Sending mail to " + address + ": " + message);
        System.out.println("Destination: " + destination);
        System.out.println("Cost: $" + cost);
    }
}