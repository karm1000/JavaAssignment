import java.io.*;
import java.util.Scanner;

/**
 * This is vehicle class
 * @see <a href="Vehicle.html">This</a>
 * @version 0.0
 * @author Karm
 */

public class Vehicle{
    String type_of_vehicle;
    byte no_of_wheels;
    String fuel_type;
    boolean hasGear;
    int range;
    short no_of_seats;
    public Vehicle(){}

    /**
     * These Methods are for asking details to users
     * @throws IOException
     */
    public void askDetails()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.print("Type of Vehicle - ");
        this.type_of_vehicle = br.readLine();
        System.out.print("No. of Wheels - ");
        this.no_of_wheels = Byte.parseByte(br.readLine());
        System.out.print("Fuel type - ");
        this.fuel_type = br.readLine();
        System.out.print("Is it with Gear(true) or Gear-less(false) - ");
        this.hasGear = sc.nextBoolean();
        System.out.print("Range of " + type_of_vehicle + " per litre or per charge(if Electric) - ");
        this.range = Integer.parseInt(br.readLine());
        System.out.print("No. of Seats - ");
        this.no_of_seats = Short.parseShort(br.readLine());
    }
}