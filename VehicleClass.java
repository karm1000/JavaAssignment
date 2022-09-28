//import java.awt.*;
import java.io.*;


public class VehicleClass{
    public static void main(String[] args)throws IOException {
        Revian h = new Revian();
        h.showDetails();
        System.out.println("Required fuel - "+h.calculateFuel(50)+" Litre");
        System.out.println("Distance it can go - "+h.calculateDistance(50)+" km");
    }
}




