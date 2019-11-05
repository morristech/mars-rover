package za.co.morristech.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LocationTest {

    private Location locationNorth;
    private Location locationEast;

    @Before
    public void initLocations() {
        locationNorth = new Location(0, 0, Direction.NORTH);
        locationEast = new Location(0, 0, Direction.EAST);
    }

    @Test
    public void shouldTurnRight() {
        assertEquals(new Location(0, 0, Direction.EAST), locationNorth.rotateRight());
        assertEquals(new Location(0, 0, Direction.SOUTH), locationEast.rotateRight());
    }

    @Test
    public void shouldTurnLeft() {
        assertEquals(new Location(0, 0, Direction.WEST), locationNorth.rotateLeft());
        assertEquals(new Location(0, 0, Direction.NORTH), locationEast.rotateLeft());
    }

    @Test
    public void shouldMoveAhead() {
        assertEquals(new Location(0, 1, Direction.NORTH), locationNorth.moveAhead());
        assertEquals(new Location(1, 0, Direction.EAST), locationEast.moveAhead());
    }

    @Test
    public void shouldReturnTrueWhenLocationIsInsideGivenCoordinates() {
        Location location = new Location(1, 2, Direction.NORTH);
        assertTrue(location.isWithIn(5, 5));
    }

    @Test
    public void shouldReturnFalseWhenLocationIsNotInsideGivenCoordinates() {
        Location location = new Location(6, 2, Direction.NORTH);
        assertFalse(location.isWithIn(5, 5));
    }

    @Test
    public void shouldReturnTrueWhenLocationIsOutsideGivenCoordinates() {
        Location location = new Location(1, 2, Direction.NORTH);
        assertTrue(location.isOutside(0, 0));
    }

    @Test
    public void shouldReturnFalseWhenLocationIsNotOutsideGivenCoordinates() {
        Location location = new Location(-1, 2, Direction.NORTH);
        assertFalse(location.isOutside(0, 0));
    }

}