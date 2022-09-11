import java.util.Arrays;
import java.util.Scanner;

public class Addition{
    public static void main(String[] args) {
        int sum=0,x;
        for(String element : args){
            x  = Integer.parseInt(element);
            sum+=x;
        }
        System.out.println("Sum = "+sum);
    }
}
