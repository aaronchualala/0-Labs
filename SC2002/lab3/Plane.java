import java.util.Comparator;
import java.util.Arrays;

public class Plane {
    private PlaneSeat[] seat;
    private int numEmptySeat = 12;

    public Plane() {
        seat = new PlaneSeat[12];
        for (int i = 0; i < 12; i++) {
            seat[i] = new PlaneSeat(i + 1, false, 0);
        }
    }

    private PlaneSeat[] sortSeats(boolean bySeatId) {
        PlaneSeat[] sortedArr = seat;
        if (bySeatId) {
            Arrays.sort(sortedArr, Comparator.comparing(PlaneSeat::getSeatId));
        } else {
            Arrays.sort(sortedArr, Comparator.comparing(PlaneSeat::getCustomerId));
        }
        return sortedArr;
    }

    public void showNumEmptySeats() {
        System.out.println("There are " + numEmptySeat + " empty seats");
    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty: \n");
        for (int i = 0; i < 12; i++) {
            if (!seat[i].isOccupied()) {
                System.out.println("SeatId " + seat[i].getSeatId());
            }
        }
    }

    public void showAssignedSeat(boolean bySeatId) {
        System.out.println("The seat assignments are as follow: ");
        PlaneSeat[] sortedSeats;
        if (bySeatId) {
            sortedSeats = sortSeats(bySeatId);
        } else {
            sortedSeats = sortSeats(bySeatId);
        }
        for (int i = 0; i < 12; i++) {
            if (sortedSeats[i].isOccupied()) {
                System.out.println(
                        "SeatID "
                                + seat[i].getSeatId()
                                + " assigned to CustomerID "
                                + seat[i].getCustomerId() + ".");
            }
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        for (int i = 0; i < 12; i++) {
            if (seat[i].getSeatId() == seatId) {
                if (seat[i].isOccupied() == false) {
                    seat[i].assign(cust_id);
                    System.out.println("Seat Assigned!");
                    numEmptySeat -= 1;
                } else {
                    System.out.println("Seat already assigned to a customer.");
                }
                break;
            }
        }
    }

    public void unAssignSeat(int seatId) {
        for (int i = 0; i < 12; i++) {
            if (seat[i].getSeatId() == seatId) {
                if (seat[i].isOccupied() == true) {
                    seat[i].unAssign();
                    numEmptySeat += 1;
                    System.out.println("Seat Unassigned!");
                    // } else {
                    // System.out.println("Seat Unassigned!");
                }
                break;
            }
        }
    }
}
