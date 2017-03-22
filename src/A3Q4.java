
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bisef5371
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING NEW CITY
        City wien = new City();
        //CREATING NEW RobotSE "KRAZY"
        RobotSE krazy = new RobotSE(wien, 2, 2, Direction.EAST);
        //CREATING NEW WALLS
        new Wall(wien, 2, 2, Direction.NORTH);
        new Wall(wien, 2, 2, Direction.WEST);
        new Wall(wien, 2, 3, Direction.NORTH);
        new Wall(wien, 2, 4, Direction.NORTH);
        new Wall(wien, 2, 5, Direction.NORTH);
        new Wall(wien, 2, 5, Direction.EAST);
        new Wall(wien, 3, 5, Direction.EAST);
        //new Wall(wien, 4, 5, Direction.EAST);
        new Wall(wien, 5, 5, Direction.EAST);
        new Wall(wien, 5, 5, Direction.SOUTH);
        new Wall(wien, 5, 4, Direction.SOUTH);
        new Wall(wien, 5, 3, Direction.SOUTH);
        new Wall(wien, 5, 2, Direction.SOUTH);
        new Wall(wien, 5, 2, Direction.WEST);
        new Wall(wien, 4, 2, Direction.WEST);
        new Wall(wien, 3, 2, Direction.WEST);

        int i = 0;
        while (krazy.frontIsClear()) {
            krazy.move();
        }
        while (!krazy.frontIsClear()) {
            krazy.turnLeft();
        }
        while (i < 1) {
            if (krazy.frontIsClear()) {

                if (krazy.frontIsClear()) {
                    krazy.turnRight();
                }
                if (krazy.frontIsClear()) {
                    i++;
                }
                if (!krazy.frontIsClear()) {
                    krazy.turnLeft();
                }

            }
            while (!krazy.frontIsClear()) {
                krazy.turnLeft();
            }
           krazy.move();
        }
    }
}
