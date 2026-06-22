import java.util.Scanner;

public class Ticket_Booking {
    static String movieSeats[][] = new String[9][6];
    static String busSeats[][] = new String[5][4];
    static String trainSeats[][] = new String[12][8];

   
    Ticket_Booking() {
        initSeats(movieSeats);
        initSeats(busSeats);
        initSeats(trainSeats);
    }

    static void initSeats(String[][] seats) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = "Available";
            }
        }
    }

    static void viewSeats(String[][] seats, String type) {
        System.out.println("\n--- " + type + " Seats ---");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + "  ");
            }
            System.out.println("\n"); 
        }

        Scanner get = new Scanner(System.in);
        System.out.print("Want to book tickets (Yes/No): ");
        String choice = get.nextLine();
        if (choice.equalsIgnoreCase("Yes")) {
            booking(seats, type);
        } else {
            System.out.println("Thanks for your Visit.");
        }
    }

    static void booking(String[][] seats, String type) {
        Scanner get = new Scanner(System.in);
        System.out.print("Select your row (1-" + seats.length + "): ");
        int row = get.nextInt() - 1;
        System.out.print("Select your seat (1-" + seats[0].length + "): ");
        int col = get.nextInt() - 1;

        if (seats[row][col].equals("Available")) {
            seats[row][col] = "Booked";
            System.out.println("Your " + type + " Ticket is Booked.");
        } else {
            System.out.println("Seat is not Available.");
        }
        viewSeats(seats, type);
    }

    public static void main(String[] args) {
        Ticket_Booking system = new Ticket_Booking();
        Scanner get = new Scanner(System.in);

        System.out.println("Choose Ticket Type:");
        System.out.println("1. Movie");
        System.out.println("2. Bus");
        System.out.println("3. Train");
        System.out.print("Enter choice: ");
        int choice = get.nextInt();

        switch (choice) {
            case 1:
                viewSeats(movieSeats, "Movie");
                break;
            case 2:
                viewSeats(busSeats, "Bus");
                break;
            case 3:
                viewSeats(trainSeats, "Train");
                break;
            default:
                System.out.println("Invalid Choice.");
        }
    }
}
