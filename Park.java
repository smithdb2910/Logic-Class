package Task2;

public class Park extends Venue {
    private final int numChangingFacilities;

    public Park(String name, int numChangingFacilities) {
        super(name);
        this.numChangingFacilities = numChangingFacilities;
    }

    public int getNumChangingFacilities() {
        return this.numChangingFacilities;
    }
}
