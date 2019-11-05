package za.co.morristech.marsrover;

import java.util.Objects;

import javax.annotation.Nonnull;

public class Terrain {

    private int x;
    private int y;

    public Terrain(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isValidMove(@Nonnull Location location) {
        return (location.isWithIn(x, y) && location.isOutside(0, 0));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Terrain)) {
            return false;
        }
        Terrain terrain = (Terrain) o;
        return (x == terrain.x && y == terrain.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}