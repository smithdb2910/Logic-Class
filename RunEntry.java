package Task2;

public class RunEntry {
    private final int eventNumber;
    private final Competitor competitor;

    public RunEntry(int eventNumber, Competitor competitor) {
        this.eventNumber = eventNumber;
        this.competitor = competitor;
    }

    public int getEventNumber() {
        return this.eventNumber;
    }

    public Competitor getCompetitor() {
        return this.competitor;
    }

    @Override
    public String toString() {
        return String.format("Event No.: %s, Competitor: %s", this.eventNumber, this.competitor);
    }
}
