public class CustomerThread extends Thread {
    private final TicketPool ticketPool;
    private final int retrievalRate;

    public CustomerThread(TicketPool ticketPool, int retrievalRate) {
        this.ticketPool = ticketPool;
        this.retrievalRate = retrievalRate;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            for (int i = 0; i < retrievalRate; i++) {
                ticketPool.removeTicket();
            }
            try {
                Thread.sleep(1000); // Attempt purchases every second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
