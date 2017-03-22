
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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING NEW CITY
        City wien = new City();
        //CREATING NEW ROBOT "KRAZY"
        Robot krazy = new Robot(wien, 1, 1, Direction.EAST);
        //CREATING NEW THINGS
        new Thing(wien, 1, 2);
        new Thing(wien, 2, 2);
        new Thing(wien, 2, 3);
        new Thing(wien, 2, 4);
        new Thing(wien, 3, 4);
        new Thing(wien, 3, 1);
        //CREATING NEW WALLS
        new Wall(wien, 1, 1, Direction.NORTH);
        new Wall(wien, 1, 1, Direction.WEST);
        new Wall(wien, 1, 2, Direction.NORTH);
        new Wall(wien, 1, 3, Direction.NORTH);
        new Wall(wien, 1, 4, Direction.NORTH);
        new Wall(wien, 1, 4, Direction.EAST);
        new Wall(wien, 2, 4, Direction.EAST);
        new Wall(wien, 3, 4, Direction.EAST);
        new Wall(wien, 3, 4, Direction.SOUTH);
        new Wall(wien, 3, 3, Direction.SOUTH);
        new Wall(wien, 3, 2, Direction.SOUTH);
        new Wall(wien, 3, 1, Direction.SOUTH);
        new Wall(wien, 3, 1, Direction.WEST);
        new Wall(wien, 2, 1, Direction.WEST);
        //GOING THROUGH TO PICK UP ALL "THINGS"
        while (true) {
            while (krazy.canPickThing()) {
                krazy.pickThing();
            }
            if (krazy.frontIsClear()) {
                krazy.move();
            }
            while (krazy.canPickThing()) {
                krazy.pickThing();
            }
            if (!krazy.frontIsClear()) {
                while (!(krazy.getDirection() == Direction.SOUTH)) {
                    krazy.turnLeft();
                }
                if (!krazy.frontIsClear()) {
                    break;
                }
                krazy.move();
                krazy.turnLeft();
                if (!krazy.frontIsClear()) {
                    krazy.turnLeft();
                    krazy.turnLeft();
                }
            }


        } 
        //GO BACK TO (1,1)
        while (krazy.getStreet() > 1) {
            //TURN UNTIL FACING NORTH
            while (!(krazy.getDirection() == Direction.NORTH)) {
                krazy.turnLeft();
            }
            krazy.move();
        }
        while (krazy.getAvenue() < 1) {
            //TURN UNTIL FACING EAST
            while (!(krazy.getDirection() == Direction.EAST)) {
                krazy.turnLeft();
            }
            krazy.move();
        }
        while (krazy.getAvenue() > 1) {
            //TURN UNTIL FACING WEST
            while (!(krazy.getDirection() == Direction.WEST)) {
                krazy.turnLeft();
            }
            krazy.move();
        }


    }
}
