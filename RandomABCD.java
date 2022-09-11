import java.util.Random;

public class RandomABCD {
    static char assignChar(int n){

        return switch (n) {
            case 0 -> 'A';
            case 1 -> 'B';
            case 2 -> 'C';
            case 3 -> 'D';
            default -> 0;
        };

    }
    public static void main(String[] args) {
        Random r = new Random();
        int x;
        char []random = new char[4];
        for(int i=0;i<4;i++){
            x= r.nextInt(4);
            random[i]=assignChar(x);
        }
        System.out.println(random);
    }
}
