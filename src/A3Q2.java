
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bisef5371
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING NEW CITY
        City wien = new City();
        //CREATING NEW ROBOT "KRAZY"
        Robot krazy = new Robot(wien, 0, 0, Direction.SOUTH);
        //CREATING NEW WALLS
        new Wall(wien, 1, 1, Direction.NORTH);
        new Wall(wien, 1, 2, Direction.NORTH);
        new Wall(wien, 1, 2, Direction.EAST);
        new Wall(wien, 2, 2, Direction.EAST);
        new Wall(wien, 2, 2, Direction.SOUTH);
        new Wall(wien, 2, 1, Direction.SOUTH);
        new Wall(wien, 2, 1, Direction.WEST);
        new Wall(wien, 1, 1, Direction.WEST);

        int count = 0;
        while (count < 8) {
            krazy.move();
            krazy.move();
            krazy.move();
            krazy.turnLeft();
            count++;
        }

    }
}
