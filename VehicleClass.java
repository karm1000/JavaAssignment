//import java.awt.*;
import java.io.*;

class HarleyDavidson extends Vehicle{
    private String model_no;
    private String name_of_model;
    private String color;
    private int registration_no;

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

    }
    public void showDetails(){
        System.out.println("Name of Model - "+name_of_model);
        System.out.println("Model No. - "+model_no);
        System.out.println("Color - "+color);
        System.out.println("Registration No. - "+registration_no);
        System.out.println("Type of the vehicle "+type_of_vehicle);
        System.out.println("Wheels - "+no_of_wheels);
        System.out.println("Number of Seats "+ no_of_seats);
        System.out.println((hasGear)?"It has Gear":"It is gear-less");
        System.out.println("Fuel Type - "+fuel_type);
        System.out.println("Range of Vehicle - "+ range);
    }
}



public class VehicleClass {
    public static void main(String[] args)throws IOException {
        HarleyDavidson h = new HarleyDavidson();
        h.showDetails();
    }

}
