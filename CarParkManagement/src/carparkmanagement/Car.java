// This class also inherits from the vehicle class
package carparkmanagement;
public class Car extends Vehicle
{
    public boolean hasRoof;
    public Car()
    {
        super();
    }
    public Car(String model, String color, int numOfWheels, String transmission)
    {
        super(model, color, numOfWheels, "na");
        this.hasRoof = hasRoof;
    }
}  