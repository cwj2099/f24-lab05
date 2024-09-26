package frogger;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {

    // Field for task 1.
    final Road road;
    private int position;
    
    // Field for task 2. Anything to add/change?
    private final Records records;
    private FroggerID ids;
    //private String firstName, lastName, phoneNumber, zipCode, state, gender;

    public Frogger(Road road, int position, Records records, String firstName, String lastName, String phoneNumber,
    String zipCode, String state, String gender) {
        this.road = road;
        this.position = position;
        this.records = records;
        ids = new FroggerID(firstName, lastName, phoneNumber, zipCode, state, gender);
    }

    /**
     * Moves Frogger.
     *
     * @param forward true is move forward, else false.
     * @return true if move successful, else false.
     */
    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(this, nextPosition) || road.isOccupied(this, nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    //Is occupied && is Valid is moved to road, feature Envy

    /**
     * Records Frogger to the list of records.
     * 
     * @return true if record successful, else false.
     */
    public boolean recordMyself() {
        //This was long parameter list
      boolean success = records.addRecord(ids);
      return success;
    }

}
