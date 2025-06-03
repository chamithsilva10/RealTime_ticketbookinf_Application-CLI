# Ticket Distribution System

A Java-based simulation of a ticket distribution system with configurable vendor and customer rates.

## Overview

This project simulates a ticket distribution system where:
- A vendor thread releases tickets at a configurable rate
- Customer threads retrieve tickets at a configurable rate
- The system maintains a ticket pool with maximum capacity
- Users can monitor and control the system through a simple console interface

## Features

- Configurable system parameters:
  - Total number of tickets
  - Ticket release rate (tickets/second)
  - Customer retrieval rate (tickets/second)
  - Maximum ticket pool capacity
- Interactive console interface:
  - Start/stop the system
  - View current ticket count
- Thread-safe ticket pool implementation
- Input validation for all parameters

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ticket-distribution-system.git
   ```

2. Compile the Java files:
   ```bash
   javac *.java
   ```

3. Run the main class:
   ```bash
   java Main
   ```

4. Follow the on-screen prompts to configure and operate the system.

## Class Structure

- `Configuration`: Handles system parameter configuration
- `TicketPool`: Manages the thread-safe ticket pool
- `VendorThread`: Thread that adds tickets to the pool
- `CustomerThread`: Thread that removes tickets from the pool
- `Main`: Entry point with user interface

## Configuration Options

When starting the system, you'll be prompted to enter:
1. Total number of tickets
2. Ticket release rate (tickets per second)
3. Customer retrieval rate (tickets per second)
4. Maximum ticket capacity

All values must be positive integers.

## System Controls

While running, you can:
1. Start the ticket system
2. View current ticket count
3. Stop the system

## License

This project is open-source and available under the [MIT License](LICENSE).
