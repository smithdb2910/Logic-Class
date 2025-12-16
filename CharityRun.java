package Task2;

import java.util.ArrayList;
import java.util.List;

public abstract class CharityRun {
    private final String date;
    private final String startTime;
    protected List<RunEntry> entries;
    protected Venue venue;

    public CharityRun(String date, String startTime) {
        this.entries = new ArrayList<>();
        this.date = date;
        this.startTime = startTime;
    }

    public String getDate() {
        return this.date;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public abstract void addEntry(Competitor competitor) throws Exception;

    public abstract void setVenue(Venue venue) throws Exception;

    public RunEntry getRunEntry(int index) {
        return this.entries.get(index);
    }

//    public List<RunEntry> getRunEntries() {
//        return this.entries;
//    }

    public int getEntriesSize() {
        return entries.size();
    }

    public Venue getVenue() {
        return this.venue;
    }

    /**
     * Function to return the index of the competitor if they are in the event
     * or -1 if they are not in the event.
     *
     * @param competitor competitor to check
     * @return index if in event, or -1 if not in event
     */
    public int checkIfCompetitorInEvent(Competitor competitor) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getCompetitor().equals(competitor))
                return i;
        }
        return -1;
    }

    public abstract String toString();
}
