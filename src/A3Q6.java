
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bisef5371
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING NEW CITY
        City wien = new City();
        //CREATING NEW ROBOT "KRAZY"
        RobotSE krazy = new RobotSE(wien, 0, 1, Direction.SOUTH);
        //CREATING LABELS FOR THE THIGS
        wien.showThingCounts(true);
        //CREATING THINGS
        new Thing(wien, 1, 1);
        new Thing(wien, 1, 1);
        new Thing(wien, 1, 1);
        new Thing(wien, 1, 1);
        new Thing(wien, 1, 1);
        new Thing(wien, 1, 1);
        new Thing(wien, 1, 1);
        new Thing(wien, 1, 1);
        new Thing(wien, 1, 1);
        new Thing(wien, 1, 1);

        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);
        new Thing(wien, 2, 1);

        new Thing(wien, 3, 1);
        new Thing(wien, 3, 1);
        new Thing(wien, 3, 1);
        new Thing(wien, 3, 1);
        new Thing(wien, 3, 1);
        new Thing(wien, 3, 1);
        new Thing(wien, 3, 1);
        new Thing(wien, 3, 1);

        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);
        new Thing(wien, 4, 1);

        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);
        new Thing(wien, 5, 1);

        wien.showThingCounts(true);

        krazy.move();

        while (krazy.canPickThing()) {
            krazy.turnLeft();
            krazy.pickAllThings();

            while(krazy.countThingsInBackpack() > 0) {
                krazy.move();
                krazy.putThing();
            }
            krazy.turnAround();

            while(krazy.canPickThing()) {
                krazy.move();
            }
        
        krazy.turnLeft();
        krazy.move();
        }
    }
}
