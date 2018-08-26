// This class is the super class of the car, bike and the truck classes.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparkmanagement;

/**
 *
 * @author HP
 */
public class Vehicle 
{
    private String model;
    private static int carCount = 0;
    private static int bikeCount = 0;
    private String color;
    private int numOfWheels;
    private String transmission;
    public Vehicle()
    {
    }
    public Vehicle(String model, String color, int numOfWheels, String transmission)
    {
        this.model = model; this.color = color; this.numOfWheels = numOfWheels;
        this.transmission = transmission;
        if(this.numOfWheels == 2)
            bikeCount+=1;
        else
            carCount+=1;
    }
    public String getModel()
    {
        return model;
    }
    public String getColor()
    {
        return color;
    }
    public int getNumOfWheels()
    {
        return numOfWheels;
    }
    public String getTransmission()
    {
        return transmission;
    }
    public void setModel(String setModel)
    {
        this.model = setModel;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setNumOfWheels(int numOfWheels)
    {
        this.numOfWheels = numOfWheels;
    }
    public void setTransmission(String transmission)
    {
        this.transmission = transmission;
    }
    
    public void printDetails()
    {
        System.out.println("Following are the details of the Bike");
        System.out.print("Model : " + this.getModel() + "\nColor : " + this.getColor() + "\nNumber Of Wheels : " + this.getNumOfWheels());
        System.out.println("Transmission Type : " + this.getTransmission());
    }
    public void reduceCount()
    {
        if(this.numOfWheels == 2)
            bikeCount-=1;
        else
            carCount-=1;
    }
}