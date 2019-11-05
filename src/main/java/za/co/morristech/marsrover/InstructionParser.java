package za.co.morristech.marsrover;

import javax.annotation.Nonnull;

public class InstructionParser {

    public static Terrain parseTerrain(@Nonnull String instruction) {
        if (instruction == null || instruction.length() == 0) {
            return null;
        }
        String[] coordinates = instruction.split(" ");
        return new Terrain(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
    }

    public static Location parseLocation(@Nonnull String positionString) {
        if (positionString == null || positionString.length() == 0) {
            return null;
        }
        String[] positionArray = positionString.split(" ");
        int xCoordinate = Integer.parseInt(positionArray[0]);
        int yCoordinate = Integer.parseInt(positionArray[1]);
        Direction direction = Direction.get(positionArray[2]);
        return new Location(xCoordinate, yCoordinate, direction);
    }

}
