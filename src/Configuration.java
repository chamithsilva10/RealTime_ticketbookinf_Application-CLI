import java.util.Scanner;

public class Configuration {
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;

    public void setConfiguration() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total number of tickets:");
        totalTickets = scanner.nextInt();

        System.out.println("Enter ticket release rate (tickets per second):");
        ticketReleaseRate = scanner.nextInt();

        System.out.println("Enter customer retrieval rate (tickets per second):");
        customerRetrievalRate = scanner.nextInt();

        System.out.println("Enter maximum ticket capacity:");
        maxTicketCapacity = scanner.nextInt();
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public int getTicketReleaseRate() {
        return ticketReleaseRate;
    }

    public int getCustomerRetrievalRate() {
        return customerRetrievalRate;
    }

    public int getMaxTicketCapacity() {
        return maxTicketCapacity;
    }
}
