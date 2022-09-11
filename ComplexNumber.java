import org.w3c.dom.html.HTMLImageElement;

public class ComplexNumber {
    static class Complex{
        private double real;
        private double imaginary;
        private double magnitude;
        public Complex(double real,double imaginary){
            this.real = real;
            this.imaginary = imaginary;

            magnitude=getMagnitude();
        }

        public Complex(){}

        public void display(){
            System.out.println(real+(imaginary>0?"+":"")+imaginary+"i");
        }

        public Complex add(Complex c){
            Complex num = new Complex();
            num.real = real + c.real;
            num.imaginary = imaginary + c.imaginary;
            return num;
        }

        public Complex add(double real,double imaginary){
            Complex num = new Complex(real, imaginary);
            num.real += real;
            num.imaginary += imaginary;
            /*num.real = this.real + real;
            num.imaginary = this.imaginary + imaginary;*/
            return num;
        }

        public Complex subtract(int real,int imaginary){
            Complex num = new Complex(0,0);

            num.real = this.real - real;
            num.imaginary = this.imaginary - imaginary;
            return num;
        }

        public Complex subtract(Complex c){
            Complex num = new Complex(real - c.real,imaginary - c.imaginary);
            return num;
        }

        public Complex conjugate(){
            Complex num = new Complex(real,imaginary);
            num.imaginary = (-1)*imaginary;
            return num;
        }

        public double getMagnitude(){
            return Math.sqrt(real*real + imaginary*imaginary);
        }

        public Complex multiply(Complex complex){
            Complex c = new Complex();
            c.real = real* complex.real - imaginary* complex.imaginary;
            c.imaginary = real * complex.imaginary + imaginary* complex.real;
            return c;
        }




    }

    public static void main(String[] args) {
        /*Complex complex = new Complex(1.0/Math.sqrt(2) , 1.0/Math.sqrt(2) );
        Complex conjugate = complex.conjugate();
        double mag = complex.getMagnitude();
        complex.display();
        System.out.println(mag);
        conjugate.display();
        Complex complex1 = new Complex(1,1);
        Complex complex2 = new Complex(5,5);
        Complex c = complex1.add(complex2);
        Complex c1 = complex1.subtract(complex2);
        complex1.display();
        complex2.display();
        c.display();
        c1.display();
        complex1.add(1.0,1.0).display();
        complex1.conjugate().display();*/

        Complex a = new Complex(1,2);
        Complex b = new Complex(2,1);
        Complex c = a.add(b);
        Complex d = a.subtract(b);
        Complex e = a.conjugate();

        a.display();
        System.out.println("Magnitude = "+a.getMagnitude());
        b.display();
        c.display();
        d.display();
        e.display();



    }
}
