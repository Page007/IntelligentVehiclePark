// This class basically contains all the methods
// pertaining to the mTHMtics of car park
package carparkmanagement;
// import java.util.AbstractList;           ....not neccesary....
import java.util.ArrayList;

public class CarPark 
{
    private static final int MAX_CAPACITY = 10;
    private final ArrayList <Vehicle>CarParkArray;
    
    public CarPark()
    {
        this.CarParkArray = new ArrayList <>(MAX_CAPACITY);
    }
    public static int getMaxCapacity()
    {
        return MAX_CAPACITY;
    }
    public int numOfOccupiedSpots()
    {
        return this.CarParkArray.size();
    }
    public int numOfAvailableSpots()
    {
        return MAX_CAPACITY - this.numOfOccupiedSpots();
    }
    
    public void addVehicle(Vehicle vehicle)
    {
        if(this.numOfAvailableSpots() > 0)
        {
            this.CarParkArray.add(vehicle);
            System.out.println("Vehicle successfully added");
        }
        else
        {
            System.out.println("Vehicle cannot be accomodated");
        }
    }
    
    public void removeVehicle(Vehicle vehicle)
    {
        if(!this.CarParkArray.isEmpty())
        {
            vehicle.reduceCount();
            CarParkArray.remove(vehicle); 
            System.out.println("The car has been removed");
        }
        else
        {
            System.out.println("The car cannot be removed since there exists no such car");
        }
    }
}
