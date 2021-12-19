
/**
 * This program calculates the trajectory of fruit from a catapult.
 *
 * @author Ruthie Dignan
 * @version 3/10/21
 */
public class Catapult
{
    private double velocity;
    private double degrees;
    private double distance;
    
    public Catapult(double v, double deg)
    {
        velocity = v;
        degrees = deg;
    }
    
    public double getVelocity()
    {
        return velocity;
    }
    
    public double getDegrees()
    {
        return degrees;
    }
    
    public double getDistance()
    {
        return distance;
    }
    
    public void calcDistance()
    {
        distance = (Math.pow(velocity, 2) * Math.sin( 2 * Math.toRadians(degrees)) / 9.8);
    }
    
}
