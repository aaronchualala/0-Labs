
import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        Plane PlaneObject = new Plane();
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "(1)Show number of empty seats \n"
                        + "(2)Show the list of empty seats \n"
                        + "(3)Show the list of seat assignments by seat ID \n"
                        + "(4)Show the list of seat assignments by customer ID \n"
                        + "(5)Assign a customer to a seat \n"
                        + "(6)Remove a seat assignment \n"
                        + "(7) Exit");
        do {
            System.out.println("\nEnter the number of your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    PlaneObject.showNumEmptySeats();
                    break;
                case 2:
                    PlaneObject.showEmptySeats();
                    break;
                case 3:
                    PlaneObject.showAssignedSeat(true);
                    break;
                case 4:
                    PlaneObject.showAssignedSeat(false);
                    break;
                case 5:
                    System.out.println("Assigning Seat ..");
                    System.out.println("Please enter SeatID:");
                    int seatIdInput = sc.nextInt();
                    System.out.println("Please enter Customer ID:");
                    int custIdInput = sc.nextInt();
                    PlaneObject.assignSeat(seatIdInput, custIdInput);
                    break;
                case 6:
                    System.out.println("Enter SeatID to unassign customer from:");
                    int seatIdInput2 = sc.nextInt();
                    PlaneObject.unAssignSeat(seatIdInput2);
                    break;
                case 7:
                    System.out.println("Program terminating ....");
            }
        } while (choice > 0 && choice < 7);
    }
}
