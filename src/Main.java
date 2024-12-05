import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        config.setConfiguration();

        TicketPool ticketPool = new TicketPool(config.getMaxTicketCapacity());
        List<Thread> threads = new ArrayList<>();

        VendorThread vendor = new VendorThread(ticketPool, config.getTicketReleaseRate());
        CustomerThread customer = new CustomerThread(ticketPool, config.getCustomerRetrievalRate());

        threads.add(vendor);
        threads.add(customer);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Start Ticket System");
            System.out.println("2. View Current Ticket Count");
            System.out.println("3. Stop Ticket System");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    if (!vendor.isAlive() && !customer.isAlive()) {
                        for (Thread thread : threads) {
                            thread.start();
                        }
                        System.out.println("System started.");
                    } else {
                        System.out.println("System is already running.");
                    }
                    break;
                case "2":
                    System.out.println("Current Tickets: " + ticketPool.getTicketCount());
                    break;
                case "3":
                    for (Thread thread : threads) {
                        thread.interrupt();
                    }
                    running = false;
                    System.out.println("System shutting down.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
        System.out.println("System stopped.");
    }
}
