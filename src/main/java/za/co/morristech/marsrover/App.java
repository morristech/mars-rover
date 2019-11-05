/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package za.co.morristech.marsrover;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Rover> rovers = new ArrayList<Rover>();
        Scanner scanner = new Scanner(System.in);
        Terrain terrain = InstructionParser.parseTerrain(scanner.nextLine());
        if (terrain != null) {
            while (scanner.hasNext()) {
                Location roverLocation = InstructionParser.parseLocation(scanner.nextLine());
                if (roverLocation != null) {
                    Rover rover = new Rover(terrain, roverLocation);
                    rovers.add(rover);
                    rover.processInstruction(scanner.nextLine());
                }
            }
            rovers.forEach(rover -> System.out.println(rover.getLocation()));
        }
    }

}
