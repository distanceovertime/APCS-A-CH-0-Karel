package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
        
       figureEight(); //technically only one instruction 
    }
    
    public void shuttleRace() {
               
    }
    private void figureEight()
    {
       turnLeft();
        move();
        turnRight();
        move2();
        turnRight();
        move2();
        turnLeft();
        move2();
        turnLeft();
        move2();
        turnLeft();
        move2();
        turnLeft();
        move2();
        turnRight();
        move2();
        turnRight();
        move();
        turnRight();
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    private void move2()
    {
        move();
        move();
    }
   
}