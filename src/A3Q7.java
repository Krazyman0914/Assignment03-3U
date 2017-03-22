
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
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING NEW CITY
        City wien = new City();
        //CREATING NEW ROBOT "KRAZY"
        Robot krazy = new Robot(wien, 3, 3, Direction.SOUTH);
        //CREATING UPPER RIGHT BOX
        new Wall(wien, 1, 1, Direction.WEST);
        new Wall(wien, 1, 1, Direction.NORTH);
        new Wall(wien, 1, 2, Direction.NORTH);
        new Wall(wien, 1, 2, Direction.EAST);
        new Wall(wien, 2, 1, Direction.WEST);
        new Wall(wien, 2, 1, Direction.SOUTH);
        new Wall(wien, 2, 2, Direction.SOUTH);
        new Wall(wien, 2, 2, Direction.EAST);
        //CREATING UPPER LEFT BOX
        new Wall(wien, 1, 4, Direction.WEST);
        new Wall(wien, 1, 4, Direction.NORTH);
        new Wall(wien, 1, 5, Direction.NORTH);
        new Wall(wien, 1, 5, Direction.EAST);
        new Wall(wien, 2, 4, Direction.WEST);
        new Wall(wien, 2, 4, Direction.SOUTH);
        new Wall(wien, 2, 5, Direction.SOUTH);
        new Wall(wien, 2, 5, Direction.EAST);
        //CREATING LOWER RIGHT BOX
        new Wall(wien, 4, 1, Direction.WEST);
        new Wall(wien, 4, 1, Direction.NORTH);
        new Wall(wien, 4, 2, Direction.NORTH);
        new Wall(wien, 4, 2, Direction.EAST);
        new Wall(wien, 5, 1, Direction.WEST);
        new Wall(wien, 5, 1, Direction.SOUTH);
        new Wall(wien, 5, 2, Direction.SOUTH);
        new Wall(wien, 5, 2, Direction.EAST);
        //CREATING LOWER LEFT BOX
        new Wall(wien, 4, 4, Direction.WEST);
        new Wall(wien, 4, 4, Direction.NORTH);
        new Wall(wien, 4, 5, Direction.NORTH);
        new Wall(wien, 4, 5, Direction.EAST);
        new Wall(wien, 5, 4, Direction.WEST);
        new Wall(wien, 5, 4, Direction.SOUTH);
        new Wall(wien, 5, 5, Direction.SOUTH);
        new Wall(wien, 5, 5, Direction.EAST);

        for (int i = 0; i < 4; i++) {
            {
                krazy.move();
                krazy.move();
                krazy.move();
                krazy.turnLeft();
                krazy.move();
                krazy.move();
                krazy.move();
                krazy.turnLeft();
                krazy.move();
                krazy.move();
                krazy.move();
                krazy.turnLeft();
                krazy.move();
                krazy.move();
                krazy.move();
            }
        }

    }
}
