import java.util.LinkedList;
import java.util.Queue;

public class TicketPool {
    private final Queue<Integer> tickets = new LinkedList<>();
    private final int maxCapacity;

    public TicketPool(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public synchronized void addTickets(int count) {
        while (tickets.size() + count > maxCapacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        for (int i = 0; i < count; i++) {
            tickets.add(1);
        }
        System.out.println(count + " tickets added. Current tickets: " + tickets.size());
        notifyAll();
    }

    public synchronized void removeTicket() {
        while (tickets.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        tickets.poll();
        System.out.println("Ticket purchased. Tickets left: " + tickets.size());
        notifyAll();
    }

    public synchronized int getTicketCount() {
        return tickets.size();
    }
}
