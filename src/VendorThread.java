public class VendorThread extends Thread {
    private final TicketPool ticketPool;
    private final int releaseRate;

    public VendorThread(TicketPool ticketPool, int releaseRate) {
        this.ticketPool = ticketPool;
        this.releaseRate = releaseRate;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            ticketPool.addTickets(releaseRate);
            try {
                Thread.sleep(1000); // Add tickets every second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
