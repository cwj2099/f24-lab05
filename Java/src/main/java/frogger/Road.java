package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean[] getOccupied() {
        return this.occupied;
    }

    public boolean isOccupied(Frogger frogger, int position) {
        boolean[] occupied = getOccupied();
        return occupied[position];
    }

    public boolean isValid(Frogger frogger, int position) {
        if (position < 0) return false;
        boolean[] occupied = getOccupied();
        return position < occupied.length;
    }
}
