//import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



class Vehicle{
     String type_of_vehicle;
//     String name_of_vehicle;
     String specialPurpose;
     byte no_of_wheels;
     String fuel_type;
     float max_torque;
     float max_power;
     boolean hasGear;
     int range;
     short no_of_seats;
     short no_of_AirBags;
     short boot_space_in_litres;
     byte GNCAP;

    public void askDetails()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.print("Type of Vehicle - ");
        this.type_of_vehicle = br.readLine();
        /*System.out.print("Name of Vehicle - ");
        this.name_of_vehicle = br.readLine();*/
        System.out.print("What is main purpose of this vehicle - ");
        this.specialPurpose = br.readLine();
        System.out.print("No. of Wheels - ");
        this.no_of_wheels = Byte.parseByte(br.readLine());
        System.out.print("Fuel type - ");
        this.fuel_type = br.readLine();
        System.out.print("Maximum torque - ");
        this.max_torque = Float.parseFloat(br.readLine());
        System.out.print("Maximum power - ");
        this.max_power = Float.parseFloat(br.readLine());
        System.out.print("Is it with Gear or Gear-less - ");
        this.hasGear = sc.nextBoolean();
        System.out.print("Range of " + type_of_vehicle + " per litre or per charge(if Electric) - ");
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
    private int registration_no;
//    private Date registration_date;
//    private Date launch_date;
    private String registration_date;
    private String launch_date;


    public HarleyDavidson()throws IOException{
        askDetails();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Model No. - ");
        this.model_no = br.readLine();
        System.out.print("Name of Model - ");
        this.name_of_model = br.readLine();
        System.out.print("Color - ");
        this.color = br.readLine();
        System.out.print("Registration No. - ");
        this.registration_no = Integer.parseInt(br.readLine());
        System.out.print("Enter Registration Date(dd/mm/yyyy) - ");
        this.registration_date = br.readLine();
        System.out.print("Enter Launch Date(dd/mm/yyyy) - ");
        this.launch_date = br.readLine();
    }

    public void showDetails(){
        System.out.println("Name of Model - "+name_of_model);
        System.out.println("Model No. - "+model_no);
        System.out.println("Color - "+color);
        System.out.println("Registration No. - "+registration_no);
//        System.out.println("Global Ne");
        System.out.println("Registration Date - "+registration_date);
        System.out.println("Launch Date - "+launch_date);
        System.out.println("Type of the vehicle "+type_of_vehicle);
        System.out.println("Purpose - "+specialPurpose);
        System.out.println("Wheels - "+no_of_wheels);
        System.out.println("Number of Seats "+ no_of_seats);
        System.out.println((hasGear)?"It has Gear":"It is gearless");
        System.out.println("Boot space(in litres) "+boot_space_in_litres);
        System.out.println("Fuel Type - "+fuel_type);
        System.out.println("Range of Vehicle - "+ range);
        System.out.println("Max Power - "+max_power+"  Max Torque - "+max_torque);
        System.out.println("AirBags - "+no_of_AirBags);
    }
}

/*class Tesla{

}*/

public class VehicleClass {
    public static void main(String[] args)throws IOException {
        HarleyDavidson h = new HarleyDavidson();
        h.showDetails();
    }

}
