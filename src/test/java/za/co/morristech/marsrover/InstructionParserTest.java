package za.co.morristech.marsrover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstructionParserTest {

    @Test
    public void parseTerrain() {
        String instruction = "4 4";
        assertEquals(new Terrain(4, 4), InstructionParser.parseTerrain(instruction));
    }

    @Test
    public void parseLocation() {
        String instruction = "4 5 S";
        assertEquals(new Location(4, 5, Direction.SOUTH), InstructionParser.parseLocation(instruction));
    }

}