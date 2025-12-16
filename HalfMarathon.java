package Task2;

public class HalfMarathon extends CharityRun {
    private final int numWaterStations;

    public HalfMarathon(String date, String startTime, int numWaterStations) {
        super(date, startTime);
        this.numWaterStations = numWaterStations;
    }

    public int getNumWaterStations() {
        return this.numWaterStations;
    }

    @Override
    public void addEntry(Competitor competitor) throws Exception {
        // if competitor not in event
        if (this.checkIfCompetitorInEvent(competitor) < 0) {
            // check age is 16+
            if (competitor.getAge() >= 16) {
                RunEntry runEntry = new RunEntry(super.entries.size() + 1, competitor);
                super.entries.add(runEntry);
            }
            else {
                throw new Exception("Competitor: " + competitor.getName() + " is too young to enter a Half Marathon!. They must be 16+ to enter.");
            }
        }
        else {
            throw new Exception("Competitor: " + competitor + " is already in event!");
        }
    }

    @Override
    public void setVenue(Venue venue) {
        super.venue = venue;
    }

    @Override
    public String toString() {
        return String.format("Venue: %s, Entries: %s, Water Stations: %s", super.getVenue(), super.getEntriesSize(), this.numWaterStations);
    }
}
