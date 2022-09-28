import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is class Revian.
 * Extends class Vehicle
 */
public class Revian extends Vehicle{
    private String model_no;
    private String name_of_model;
    private String color;

    public Revian()throws IOException {
        askDetails();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Model No. - ");
        this.model_no = br.readLine();
        System.out.print("Name of Model - ");
        this.name_of_model = br.readLine();
        System.out.print("Color - ");
        this.color = br.readLine();
    }
    public void showDetails(){
        System.out.println("Name of Model - "+name_of_model);
        System.out.println("Model No. - "+model_no);
        System.out.println("Color - "+color);
        System.out.println("Type of the vehicle "+type_of_vehicle);
        System.out.println("Wheels - "+no_of_wheels);
        System.out.println("Number of Seats "+ no_of_seats);
        System.out.println((hasGear)?"It has Gear":"It is gear-less");
        System.out.println("Fuel Type - "+fuel_type);
        System.out.println("Range of Vehicle - "+ range);
    }

    /**
     * Calculates required fuel for given distance (in km)
     * @param km
     * @return required fuel
     */
    public double calculateFuel(double km){
        return km/range;
    }
    /**
     * Calculates Distance That vehicle can go in given fuel
     * @param remaining_fuel
     * @return  Distance that can go
     */
    public double calculateDistance(double remaining_fuel){
        return remaining_fuel*range;
    }
}
