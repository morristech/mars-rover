package za.co.morristech.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    Rover rover;

    @Before
    public void setUp() {
        Terrain grid = new Terrain(5, 5);
        rover = new Rover(grid, new Location(1, 2, Direction.NORTH));
    }

    @Test
    public void shouldTurnRight() {
        rover.processInstruction("R");
        assertEquals(new Location(1, 2, Direction.EAST), rover.getLocation());
    }

    @Test
    public void shouldTurnLeft() {
        rover.processInstruction("L");
        assertEquals(new Location(1, 2, Direction.WEST), rover.getLocation());
    }

    @Test
    public void shouldMoveForward() {
        rover.processInstruction("M");
        assertEquals(new Location(1, 3, Direction.NORTH), rover.getLocation());
    }

    @Test
    public void shouldFollowMultipleInstructions() {
        rover.processInstruction("RLM");
        assertEquals(new Location(1, 3, Direction.NORTH), rover.getLocation());
    }

    @Test
    public void shouldNotMoveForwardForAnInvalidMove() {
        rover.processInstruction("MMMLMRMM");
        assertEquals(new Location(0, 5, Direction.NORTH), rover.getLocation());
    }

}