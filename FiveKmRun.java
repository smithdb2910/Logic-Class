package Task2;

public class FiveKmRun extends CharityRun {

    public FiveKmRun(String date, String startTime) {
        super(date, startTime);
    }

    @Override
    public void addEntry(Competitor competitor) throws Exception {
        // if competitor not in event, add them to it
        if (this.checkIfCompetitorInEvent(competitor) < 0) {
            RunEntry runEntry = new RunEntry(super.entries.size() + 1, competitor);
            super.entries.add(runEntry);
        }
        else {
            throw new Exception("Competitor: " + competitor + " is already in event!");
        }
    }

    @Override
    public void setVenue(Venue venue) throws Exception {
        if (venue instanceof Park)
            super.venue = venue;
        else
            throw new Exception("A 5km Run can only be set at a Park!");
    }

    @Override
    public String toString() {
        return String.format("Venue: %s, Entries: %s", super.getVenue(), super.getEntriesSize());
    }
}
