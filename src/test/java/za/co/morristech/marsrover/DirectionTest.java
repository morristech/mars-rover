package za.co.morristech.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectionTest {

    @Test
    public void left() {
        assertEquals(Direction.EAST, Direction.SOUTH.left());
        assertEquals(Direction.WEST, Direction.NORTH.left());
    }

    @Test
    public void right() {
        assertEquals(Direction.WEST, Direction.SOUTH.right());
        assertEquals(Direction.EAST, Direction.NORTH.right());
    }

    @Test
    public void getDirectionAlphabet() {
        assertEquals("E", Direction.EAST.toString());
        assertEquals("W", Direction.WEST.toString());
    }

}