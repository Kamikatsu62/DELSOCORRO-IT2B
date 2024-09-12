package delsocorro.it2b;

import java.util.Scanner;

class booking {
    int BID;
    String Gname;
    String Rmtype;
    String Cidate;
    String CoDate;
    String pstatus;
    String status;
}

public class BookingHandler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of booking: ");
        int numbooks = scanner.nextInt();
        scanner.nextLine(); 

        booking[] bking = new booking[numbooks];

        for (int i = 0; i < numbooks; i++) {
            System.out.println("\nEnter details of booking " + (i + 1) + ":");
            bking[i] = new booking();
            System.out.print("Booking ID: ");
            bking[i].BID = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Guest Name: ");
            bking[i].Gname = scanner.nextLine();
            System.out.print("Room type: ");
            bking[i].Rmtype = scanner.nextLine();
            System.out.print("Check-in Date (YYYY-MM-DD): ");
            bking[i].Cidate = scanner.nextLine();
            System.out.print("Check-out Date (YYYY-MM-DD): ");
            bking[i].CoDate = scanner.nextLine();
            System.out.print("Payment Status: ");
            bking[i].pstatus = scanner.nextLine();
            System.out.print("Status: ");
            bking[i].status = scanner.nextLine();
            
        }

        System.out.println("Task ID\tTask Name\tAssigned To\tDue Date\tPriority\tStatus");
        for (booking booking : bking) {
            System.out.format("%d\t%s\t%s\t%s\t%s\t%s\n", 
                    booking.BID, booking.Gname, booking.Rmtype, booking.Cidate, booking.CoDate, booking.status);
        }

        scanner.close();
    }
}