import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        ReservationSystem system = new ReservationSystem();

        System.out.println("===== Online Reservation System =====");
        System.out.print("Enter Username: ");
        String uname = sc.nextLine();

        System.out.print("Enter Password: ");
        String pwd = sc.nextLine();

        if (user.login(uname, pwd)) {
            System.out.println("Login Successful!\n");

            boolean running = true;
            while (running) {
                System.out.println("\n--- Main Menu ---");
                System.out.println("1. Reserve Ticket");
                System.out.println("2. Cancel Ticket");
                System.out.println("3. View All Bookings");
                System.out.println("4. Exit");

                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        system.reserveTicket();
                        break;
                    case 2:
                        system.cancelTicket();
                        break;
                    case 3:
                        system.viewAllBookings();
                        break;
                    case 4:
                        running = false;
                        System.out.println("Thank you for using the system.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } else {
            System.out.println("Login Failed! Invalid credentials.");
        }

        sc.close();
    }
}