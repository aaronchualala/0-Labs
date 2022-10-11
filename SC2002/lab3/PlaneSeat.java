
public class PlaneSeat {
    private int seatId;
    private boolean assigned;
    private int customerId;

    public PlaneSeat(int sid, boolean a, int cid) {
        seatId = sid;
        assigned = a;
        customerId = cid;
    }

    public int getSeatId() {
        return seatId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public boolean isOccupied() {
        return assigned;
    }

    public void assign(int cid) {
        customerId = cid;
        assigned = true;
    }

    public void unAssign() {
        assigned = false;
    }
}
