package za.co.morristech.marsrover;

import java.util.Objects;

import javax.annotation.Nonnull;

public class Location {

    private int x;
    private int y;
    private Direction direction;

    public Location(int x, int y, @Nonnull Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Location rotateRight() {
        return new Location(x, y, direction.right());
    }

    public Location rotateLeft() {
        return new Location(x, y, direction.left());
    }

    public Location moveAhead() {
        switch (direction.toString()) {
            case "E":
                return new Location(x + 1, y, direction);
            case "W":
                return new Location(x - 1, y, direction);
            case "N":
                return new Location(x, y + 1, direction);
            case "S":
                return new Location(x, y - 1, direction);
            default:
                throw new IllegalStateException("Unknown Direction");
        }
    }

    public boolean isWithIn(int x, int y) {
        return this.x <= x && this.y <= y;
    }

    public boolean isOutside(int x, int y) {
        return this.x >= x && this.y >= y;
    }

    @Override
    public boolean equals(@Nonnull Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Location)) {
            return false;
        }
        Location location = (Location) o;
        return (x == location.x && y == location.y && direction == location.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }

    @Override
    public String toString() {
        return (x + " " + y + " " + direction);
    }

}