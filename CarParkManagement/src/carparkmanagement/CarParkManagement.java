package carparkmanagement;
public class CarParkManagement 
{
    public static void main(String[] args) throws Exception
    {
        Car BMW = new Car("250d", "blue", 4, "auto");
        Car Porche = new Car("911", "Red", 4, "manual");
        Bike Bugati = new Bike("2031", "Orange", 2, "na");
        Bike Duke = new Bike("9094", "Golden", 2, "na");
        CarPark bikeParking = new CarPark();
        CarPark carParking = new CarPark();
        bikeParking.addVehicle(Bugati);
        bikeParking.addVehicle(Duke);
        carParking.addVehicle(Porche);
        carParking.addVehicle(BMW);
        Bugati.printDetails();
        Duke.printDetails();
        System.out.println("Following is the information upon the cars : ");
        Porche.printDetails();
        BMW.printDetails();
    }  
}