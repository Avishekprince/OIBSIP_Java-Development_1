import java.util.HashMap;
import java.util.Scanner;

public class ReservationSystem {
    private HashMap<Integer, Reservation> bookings = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void reserveTicket() {
        System.out.println("\n--- Reservation Form ---");
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Train Number: ");
        String trainNo = sc.nextLine();

        System.out.print("From (Place): ");
        String from = sc.nextLine();

        System.out.print("To (Destination): ");
        String to = sc.nextLine();

        System.out.print("Date of Journey (DD-MM-YYYY): ");
        String date = sc.nextLine();

        System.out.print("Class Type (e.g. Sleeper/AC): ");
        String classType = sc.nextLine();

        Reservation res = new Reservation(name, trainNo, from, to, date, classType);
        bookings.put(res.getPnr(), res);

        System.out.println(" Ticket Booked Successfully! Your PNR is: " + res.getPnr());
    }

    public void cancelTicket() {
        System.out.print("\nEnter PNR Number to Cancel: ");
        int pnr = sc.nextInt();
        sc.nextLine();

        if (bookings.containsKey(pnr)) {
            Reservation res = bookings.get(pnr);
            System.out.println("Reservation Details:\n" + res.getDetails());
            System.out.print("Confirm cancellation? (yes/no): ");
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase("yes")) {
                bookings.remove(pnr);
                System.out.println("Ticket Cancelled Successfully.");
            } else {
                System.out.println("Cancellation Aborted.");
            }
        } else {
            System.out.println("No booking found with this PNR.");
        }
    }

    public void viewAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No reservations yet.");
        } else {
            System.out.println("\nAll Bookings:");
            for (Reservation res : bookings.values()) {
                System.out.println("\n" + res.getDetails());
                System.out.println("---------------------------");
            }
        }
    }
}
