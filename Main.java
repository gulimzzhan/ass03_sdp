public class Main {
    public static void main(String[] args) {
        MailingService mailingService = new MailingService();
        IShipping shippingService = new MailingServiceAdapter(mailingService);

        shippingService.shipPackage("Mangilik el 54", "IPhone 15 Pro", "Turkestan 35", 990);
    }
}