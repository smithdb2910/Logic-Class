package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EventApplication {
    static Scanner input = new Scanner(System.in);

    /*
     TODO:
      - Refactor code to make encapsulated
       - Avoid methods that return full arrays of data
       - Make methods to check if needed
       - etc.
      - Add code comments
      - Add class comments
     */

    public static void main(String[] args) throws Exception {
        List<CharityRun> events = new ArrayList<>();
        List<Venue> venues = new ArrayList<>();
        List<Competitor> competitors = new ArrayList<>();

        // Competitor
        Competitor c1 = new Competitor("James", 20);
        Competitor c2 = new Competitor("Michael", 38);
        Competitor c3 = new Competitor("Angela", 37);
        Competitor c4 = new Competitor("Kevin", 47);
        Competitor c5 = new Competitor("Jim", 23);
        Competitor c6 = new Competitor("Pam", 24);
        Competitor c7 = new Competitor("Dwight", 31);
        Competitor c8 = new Competitor("Stanley", 43);
        Competitor c9 = new Competitor("Jan", 41);
        Competitor c10 = new Competitor("Roy", 33);
        Competitor c11 = new Competitor("Spencer", 27);
        Competitor c12 = new Competitor("Mitchell", 24);
        Competitor c13 = new Competitor("Owen", 26);
        Competitor c14 = new Competitor("Louise", 34);
        Competitor c15 = new Competitor("Lewis", 36);
        Competitor c16 = new Competitor("John", 40);
        Competitor c17 = new Competitor("Abby", 24);
        Competitor c18 = new Competitor("Amy", 26);
        Competitor c19 = new Competitor("Chloe", 23);
        Competitor c20 = new Competitor("Amber", 28);
        Competitor c21 = new Competitor("Jack", 15);
        Competitor c22 = new Competitor("Jimmay", 17);
        Competitor c23 = new Competitor("Paul", 16);
        Competitor c24 = new Competitor("Tiffany", 12);
        Competitor c25 = new Competitor("Bell", 16);
        Competitor c26 = new Competitor("Kylie", 14);
        Competitor c27 = new Competitor("Bob", 13);
        Competitor c28 = new Competitor("Dave", 12);
        Competitor c29 = new Competitor("Lily", 16);
        Competitor c30 = new Competitor("Mia", 17);

        competitors.add(c1);
        competitors.add(c2);
        competitors.add(c3);
        competitors.add(c4);
        competitors.add(c5);
        competitors.add(c6);
        competitors.add(c7);
        competitors.add(c8);
        competitors.add(c9);
        competitors.add(c10);
        competitors.add(c11);
        competitors.add(c12);
        competitors.add(c13);
        competitors.add(c14);
        competitors.add(c15);
        competitors.add(c16);
        competitors.add(c17);
        competitors.add(c18);
        competitors.add(c19);
        competitors.add(c20);
        competitors.add(c21);
        competitors.add(c22);
        competitors.add(c23);
        competitors.add(c24);
        competitors.add(c25);
        competitors.add(c26);
        competitors.add(c27);
        competitors.add(c28);
        competitors.add(c29);
        competitors.add(c30);

        // Town
        Town t1 = new Town("Norwich");
        Town t2 = new Town("Ipswich");
        Town t3 = new Town("Colchester");
        Town t4 = new Town("London");
        Town t5 = new Town("Bradford");

        venues.add(t1);
        venues.add(t2);
        venues.add(t3);
        venues.add(t4);
        venues.add(t5);

        // Park
        Park p1 = new Park("Chantry Park", 4);
        Park p2 = new Park("Chestnut Park", 2);
        Park p3 = new Park("Dogwood Park", 3);
        Park p4 = new Park("Earlham Park", 7);
        Park p5 = new Park("Eaton Park", 1);
        Park p6 = new Park("High Woods Park", 2);

        venues.add(p1);
        venues.add(p2);
        venues.add(p3);
        venues.add(p4);
        venues.add(p5);
        venues.add(p6);

        // HalfMarathon
        CharityRun hm1 = new HalfMarathon("02/02/2021", "12:05", 6);
        CharityRun hm2 = new HalfMarathon("12/05/2021", "13:00", 4);
        CharityRun hm3 = new HalfMarathon("06/03/2021", "11:15", 10);
        CharityRun hm4 = new HalfMarathon("10/10/2021", "11:30", 14);

        hm1.setVenue(p1);
        hm2.setVenue(p2);
        hm3.setVenue(t1);
        hm4.setVenue(t2);

        events.add(hm1);
        events.add(hm2);
        events.add(hm3);
        events.add(hm4);

        // FiveKmRun
        CharityRun fkm1 = new FiveKmRun("01/02/2021", "13:00");
        CharityRun fkm2 = new FiveKmRun("10/04/2021", "12:00");
        CharityRun fkm3 = new FiveKmRun("25/10/2021", "11:00");
        CharityRun fkm4 = new FiveKmRun("30/01/2021", "13:30");

        fkm1.setVenue(p3);
        fkm2.setVenue(p4);
        fkm3.setVenue(p5);
        fkm4.setVenue(p5);

        events.add(fkm1);
        events.add(fkm2);
        events.add(fkm3);
        events.add(fkm4);

        // Add competitors to hm1
        hm1.addEntry(c1);
        hm1.addEntry(c2);
        hm1.addEntry(c3);
        hm1.addEntry(c4);
        hm1.addEntry(c5);
        hm1.addEntry(c6);

        // Add competitors to hm2
        hm2.addEntry(c7);
        hm2.addEntry(c8);
        hm2.addEntry(c9);
        hm2.addEntry(c10);
        hm2.addEntry(c11);
        hm2.addEntry(c12);

        // Add competitors to hm3
        hm3.addEntry(c13);
        hm3.addEntry(c14);
        hm3.addEntry(c15);
        hm3.addEntry(c16);
        hm3.addEntry(c17);
        hm3.addEntry(c18);

        // Add competitors to hm4
        hm4.addEntry(c19);
        hm4.addEntry(c20);
        hm4.addEntry(c1);
        hm4.addEntry(c2);
        hm4.addEntry(c3);
        hm4.addEntry(c4);

        // Add competitors to fkm1
        fkm1.addEntry(c1);
        fkm1.addEntry(c2);
        fkm1.addEntry(c3);
        fkm1.addEntry(c4);
        fkm1.addEntry(c5);
        fkm1.addEntry(c6);

        // Add competitors to fkm2
        fkm2.addEntry(c7);
        fkm2.addEntry(c8);
        fkm2.addEntry(c9);
        fkm2.addEntry(c10);
        fkm2.addEntry(c11);
        fkm2.addEntry(c12);

        // Add competitors to fkm3
        fkm3.addEntry(c13);
        fkm3.addEntry(c14);
        fkm3.addEntry(c15);
        fkm3.addEntry(c16);
        fkm3.addEntry(c17);
        fkm3.addEntry(c18);

        // Add competitors to fkm4
        fkm4.addEntry(c19);
        fkm4.addEntry(c20);
        fkm4.addEntry(c21);
        fkm4.addEntry(c22);
        fkm4.addEntry(c23);
        fkm4.addEntry(c24);
        fkm4.addEntry(c25);
        fkm4.addEntry(c26);
        fkm4.addEntry(c27);
        fkm4.addEntry(c28);
        fkm4.addEntry(c29);
        fkm4.addEntry(c30);

        /*
         * Main run loop
         */
        String choice;
        while (true) {
            System.out.println("");
            System.out.println("List Event Information............1");
            System.out.println("List Venue Details................2");
            System.out.println("Search Competitor Event Entries...3");
            System.out.println("Exit..............................0");
            System.out.println("");
            System.out.println("Enter choice:");
            choice = input.next();

            switch (choice) {
                case "1":
                    System.out.println("\n");
                    System.out.println("Events");
                    System.out.println("-------------------------------------------------");
                    System.out.println("| No. | Type          | Start Date | Start Time |");
                    System.out.println("-------------------------------------------------");

                    // print all events to user to allow them to select an event to get more info on
                    int eventId = 0;
                    for (CharityRun event : events) {
                        System.out.println(String.format("| %-3s | %-13s | %-10s | %-10s |", eventId + 1, event instanceof HalfMarathon ? "Half Marathon" : "5km Run", event.getDate(), event.getStartTime()));
                        eventId++;
                    }
                    System.out.println("-------------------------------------------------\n\n");

                    // get user input for event they would like info on
                    System.out.println("Enter event id for more information [1 - " + events.size() + "] : ");
                    int eventChoice = input.nextInt();
                    CharityRun chosenEvent = events.get(eventChoice - 1);

                    // print event information
                    System.out.println("-----");
                    System.out.println(String.format("Venue Name:     %s", chosenEvent.getVenue()));
                    System.out.println(String.format("Entries:        %s", chosenEvent.getEntriesSize()));

                    // if event is a half marathon, also print no. water stations
                    if (chosenEvent instanceof HalfMarathon)
                        System.out.println(String.format("Water Stations: %s", ((HalfMarathon) chosenEvent).getNumWaterStations()));

                    System.out.println("-----");
                    System.out.println("\n\n Enter Any key to Go Back...");
                    input.next();
                    clrscr();
                    break;
                case "2": {
                    System.out.println("\n");
                    System.out.println("Venues");
                    System.out.println("-----------------------------------------------");
                    System.out.println("| No. | Type | Name                           |");
                    System.out.println("-----------------------------------------------");

                    // print all venues to allow the user to select a venue for more details
                    int venueId = 0;
                    for (Venue venue : venues) {
                        System.out.println(String.format("| %-3s | %-4s | %-30s |", venueId + 1, venue instanceof Park ? "Park" : "Town", venue.getName()));
                        venueId++;
                    }
                    System.out.println("-----------------------------------------------");

                    // get user input to allow more information of a venue
                    System.out.println("Enter venue id for more information [1 - " + venues.size() + "] : ");
                    int venueChoice = input.nextInt();
                    Venue chosenVenue = venues.get(venueChoice - 1);

                    // print venue details
                    boolean hasEventsOn = false;
                    System.out.println("-----");
                    System.out.println(String.format("Venue Name: %s", chosenVenue.getName()));

                    // if venue is a park, print no. changing facilities
                    if (chosenVenue instanceof Park)
                        System.out.println(String.format("Changing Facilities: %s", ((Park) chosenVenue).getNumChangingFacilities()));
                    System.out.println("-----");

                    // for each event, check if the venue is the chosen from user
                    for (CharityRun event : events) {
                        if (event.getVenue().equals(chosenVenue)) {
                            // if first event for venue, print heading
                            if (!hasEventsOn) {
                                System.out.println("---------------------------");
                                System.out.println("| Start Date | Start Time |");
                                System.out.println("---------------------------");
                            }
                            hasEventsOn = true;

                            System.out.println(String.format("| %-10s | %-10s |", event.getDate(), event.getStartTime()));
                        }
                    }

                    if (hasEventsOn)
                        System.out.println("---------------------------");
                    // print message saying no events on
                    else
                        System.out.println("No events on this year.");

                    System.out.println("\n\n Enter Any Key to Go Back...");
                    input.nextLine();
                    input.nextLine();
                    clrscr();
                    break;
                }
                case "3": {
                    System.out.println("\n");
                    input.nextLine();
                    System.out.print("To search, Enter the text : ");

                    // get competitors that match search criteria
                    String searchCompetitor = input.nextLine();
                    List<Competitor> searchMatched = new ArrayList<>();
                    for (Competitor competitor : competitors) {
                        if (competitor.getName().toLowerCase().contains(searchCompetitor.toLowerCase()))
                            searchMatched.add(competitor);
                    }

                    // if one or more competitors match the search
                    if (searchMatched.size() > 0) {

                        // for each competitor that matched
                        for (Competitor c : searchMatched) {
                            System.out.println("-----");
                            System.out.println(c);
                            System.out.println("-----");

                            // for each event
                            for (CharityRun event : events) {
                                // check if competitor is in event
                                int inEvent = event.checkIfCompetitorInEvent(c);
                                if (inEvent >= 0) {
                                    // print event date and event number
                                    System.out.println("Event Date:   " + event.getDate());
                                    System.out.println("Event Number: " + event.getRunEntry(inEvent).getEventNumber());

                                    // print type of event
                                    if (event instanceof HalfMarathon)
                                        System.out.println("Type:         Half Marathon\n");
                                    else
                                        System.out.println("Type:         5km Run\n");
                                }
                            }

                            System.out.println("-----\n\n");
                        }
                    }
                    else {
                        System.out.println("No competitors match your search criteria.");
                    }
                    System.out.println("\n\n Enter Any Key to Go Back...");
                    input.nextLine();
                    input.nextLine();
                    clrscr();
                    break;
                }
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice entered....\n\n\n");
                    System.out.println("\n\n Enter Any Key to Go Back...");
                    input.nextLine();
                    break;
            }
        }
    }

    // when chosen to exit the output will enter f number of next lines, in this case, 800;
    public static void clrscr() {
        int f = 800;
        for (int clear = 0; clear < f; clear++) {
            System.out.println("\b");
        }
    }
}
