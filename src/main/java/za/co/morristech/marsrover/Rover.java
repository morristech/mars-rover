package za.co.morristech.marsrover;

import javax.annotation.Nonnull;

public class Rover {

    private Location location;
    private Terrain terrain;

    public Rover(@Nonnull Terrain terrain, @Nonnull Location location) {
        this.terrain = terrain;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void processInstruction(@Nonnull String instructions) {
        instructions.chars().mapToObj(c -> (char) c).forEach(this::processInstruction);
    }

    private void processInstruction(@Nonnull Character instruction) {
        switch (instruction) {
            case 'R':
                turnRight();
                break;
            case 'L':
                turnLeft();
                break;
            case 'M':
                move();
                break;
        }
    }

    private void move() {
        if (terrain.isValidMove(location.moveAhead())) {
            location = location.moveAhead();
        }
    }

    private void turnLeft() {
        if (location.rotateLeft() != null) {
            location = location.rotateLeft();
        }
    }

    private void turnRight() {
        if (location.rotateRight() != null) {
            location = location.rotateRight();
        }
    }

    @Override
    public String toString() {
        return location.toString();
    }

}
