package Task2;

import java.util.Objects;

public abstract class Venue {
    private final String name;

    public Venue(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Venue)) return false;
        Venue venue = (Venue) o;
        return name.equals(venue.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
