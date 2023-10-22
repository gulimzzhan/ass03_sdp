public class MailingServiceAdapter implements IShipping {
    private MailingService mailingService;

    public MailingServiceAdapter(MailingService mailingService) {
        this.mailingService = mailingService;
    }

    @Override
    public void shipPackage(String address, String item, String destination, double cost) {
        // Adapt the shipPackage method to sendMail
        mailingService.sendMail(address, "Your package containing " + item + " has been shipped", destination, cost);
    }
}