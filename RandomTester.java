import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random rand;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        rand = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom(int y)
    {
        System.out.println(rand.nextInt());
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printMultiRandom(int howMany)
    {
        int i = 0;
        while(i>howMany){
            System.out.println(rand.nextInt());
            i++;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int throwDice()
    {
        return rand.nextInt(6)+1;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getResponse()
    {
        ArrayList<String> responses = new ArrayList<>();
        responses.add("yes");
        responses.add("maybe");
        responses.add("no");
        responses.add("maybe not");
        
        int index = rand.nextInt(responses.size());
        return responses.get(index);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getFrom1toMax(int max)
    {
        return rand.nextInt(max)+1; 
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getFromMintoMax(int min, int max)
    {
        return rand.nextInt(max-min+1)+min; 
    }
}