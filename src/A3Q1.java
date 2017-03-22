
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bisef5371
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING NEW CITY
        City wien = new City();
        //CREATING NEW ROBOT "KRAZY"
        Robot krazy = new Robot(wien, 1, 1, Direction.EAST);
        //CREATING NEW WALL
        new Wall(wien, 2, 4, Direction.EAST);
        //CREATING NEW THING
        new Thing(wien, 1, 4);
        for (;;) {
            if (!krazy.canPickThing()) {
                krazy.move();
            }
            if (krazy.canPickThing()) {
                break;
            }
            if (krazy.frontIsClear()) {
                krazy.move();
            }
            if (!krazy.frontIsClear()) {
                break;
            }
        }
    }
}
