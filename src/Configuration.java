import java.util.Scanner;

public class Configuration {
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketCapacity;

    public void setConfiguration() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total number of tickets:");
        totalTickets = getValidIntegerInput(scanner);

        System.out.println("Enter ticket release rate (tickets per second):");
        ticketReleaseRate = getValidIntegerInput(scanner);

        System.out.println("Enter customer retrieval rate (tickets per second):");
        customerRetrievalRate = getValidIntegerInput(scanner);

        System.out.println("Enter maximum ticket capacity:");
        maxTicketCapacity = getValidIntegerInput(scanner);
    }

    private int getValidIntegerInput(Scanner scanner) {
        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine().trim());
                if (value <= 0) {
                    System.out.println("Please enter a positive number:");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer:");
            }
        }
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
