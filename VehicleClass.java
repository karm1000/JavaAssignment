import java.io.BufferedReader;
import java.io.InputStreamReader;

class Vehicle{
    private String type_of_vehicle;
    private String name_of_vehicle;
    private byte no_of_wheels;
    private String fuel_type;
    private float max_torque;
    private float max_power;
    private boolean gear_or_noGear;
    private int range;
    private short no_of_seats;
    private short no_of_AirBags;
    private short boot_space_in_litres;
    private byte GNCAP;

    public void askDetails(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Type of Vehicle - ");
        this.type_of_vehicle = br.readLine();

    }
}

public class VehicleClass {

}
