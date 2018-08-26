// This is the derived class from the Vehicle class
package carparkmanagement;
public class Bike extends Vehicle
{
    public Bike()
    {
        super();        // This is the zero argument constructor that is common
                        // for both vehicle and bike classes
    }
    public Bike(String model, String color, int numOfWheels, String transmission)
    {
        super(model, color, numOfWheels, "na");
        //bikeCount+=1;
    }
}