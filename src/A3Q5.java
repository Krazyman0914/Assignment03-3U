
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bisef5371
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING NEW CITY
        City wien = new City();
        //CREATING NEW ROBOT "KRAZY"
        Robot krazy = new Robot(wien, 2, 2, Direction.EAST);
        //CREATING LABELS FOR THE THIGS
        wien.showThingCounts(true);
        //CREATING THINGS
        new Thing(wien, 2, 2);
        new Thing(wien, 2, 2);
        new Thing(wien, 2, 2);
        new Thing(wien, 2, 2);
        new Thing(wien, 2, 2);
        new Thing(wien, 2, 2);
        new Thing(wien, 2, 2);
        new Thing(wien, 2, 2);
        new Thing(wien, 2, 2);
        new Thing(wien, 2, 2);

        int counter = 0;
        while (krazy.canPickThing()) {
            krazy.pickThing();
            counter++;
        }
        krazy.move();

        while (counter <= 10) {
            krazy.putThing();
            counter--;

            if (counter == 0) {
                break;
            }
        }
    }
}
