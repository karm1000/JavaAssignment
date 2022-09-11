//import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;



class Vehicle{
    private String type_of_vehicle;
    private String name_of_vehicle;
    private String purpose;
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

    public void askDetails()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.print("Type of Vehicle - ");
        this.type_of_vehicle = br.readLine();
        System.out.print("Name of Vehicle - ");
        this.name_of_vehicle = br.readLine();
        System.out.print("What is main purpose of this vehicle - ");
        this.purpose = br.readLine();
        System.out.print("No. of Wheels - ");
        this.no_of_wheels = Byte.parseByte(br.readLine());
        System.out.print("Fuel type - ");
        this.fuel_type = br.readLine();
        System.out.print("Maximum torque - ");
        this.max_torque = Float.parseFloat(br.readLine());
        System.out.print("Maximum power - ");
        this.max_power = Float.parseFloat(br.readLine());
        System.out.print("Is it with Gear or Gearless - ");
        this.gear_or_noGear = sc.nextBoolean();
        System.out.print("Range of " + name_of_vehicle + " per litre or per charge(if Electric) - ");
        this.range = Integer.parseInt(br.readLine());
        System.out.print("No. of Seats - ");
        this.no_of_seats = Short.parseShort(br.readLine());
        System.out.print("No. of Air-Bags - ");
        this.no_of_AirBags = Short.parseShort(br.readLine());
        System.out.print("Boot Space Available in litres - ");
        this.boot_space_in_litres = Short.parseShort(br.readLine());
        System.out.print("GNCAP Rank - ");
        this.GNCAP = Byte.parseByte(br.readLine());
    }

}

class HarleyDavidson extends Vehicle{
    private String model_no;
    private String name_of_model;
    private String color;
    private long registration_no;
    private Date registration_date;
    private Date launch_date;

    public HarleyDavidson()throws IOException{
        askDetails();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Model No. - ");
        this.model_no = br.readLine();
        this.registration_no = Long.parseLong(br.readLine());
        




    }
}

class Tesla{

}

public class VehicleClass {

}
