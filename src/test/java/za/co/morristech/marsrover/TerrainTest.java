package za.co.morristech.marsrover;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TerrainTest {

    private Terrain terrain;

    @Before
    public void setupTerrain() {
        terrain = new Terrain(5, 5);
    }

    @Test
    public void shouldReturnTrueIfAMoveIsValid() {
        Location location = new Location(1, 2, Direction.NORTH);
        assertTrue(terrain.isValidMove(location));
    }

    @Test
    public void shouldReturnFalseIfAMoveIsInvalid() {
        Location locationQ1 = new Location(1, 6, Direction.NORTH);
        Location locationQ3 = new Location(-1, -6, Direction.NORTH);
        assertFalse(terrain.isValidMove(locationQ1));
        assertFalse(terrain.isValidMove(locationQ3));
    }

}