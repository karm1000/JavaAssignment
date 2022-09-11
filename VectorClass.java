class Vector{
    int x;
    int y;
    int z;

    double magnitude;

    public Vector(){x=0;y=0;z=0;}

    public Vector(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
        magnitude= getMagnitude();
    }

    private double getMagnitude(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    }

    public Vector add(Vector v){
        Vector vector = new Vector();
        vector.x = x + v.x;
        vector.y = y + v.y;
        vector.z = z + v.z;
        return vector;
    }
    public Vector subtract(Vector v){
        Vector vector = new Vector();
        vector.x = x - v.x;
        vector.y = y - v.y;
        vector.z = z - v.z;
        return vector;
    }

    public double dotProduct(Vector v){
        return (x * v.x) + (y * v.y) + (z * v.z);
    }



    public Vector crossProduct(Vector v){
        Vector vector = new Vector();
        vector.x = y*v.z - z*v.y;
        vector.y = z*v.x-x*v.z;
        vector.z = x*v.y - y*v.x;
        return vector;
    }

    public double cosineTheta(Vector v){
        return dotProduct(v)/(magnitude*v.magnitude);
    }

    public double theta(Vector v){
        return Math.acos(cosineTheta(v));
    }

    public void display(){
        System.out.println(x+"i"+((y>=0)?"+":"")+y+"j"+((z>=0)?"+":"")+z+"k");
    }

}

public class VectorClass {

    /*static class Vector{
        int x;
        int y;
        int z;

        double magnitude;

        public Vector(){x=0;y=0;z=0;}

        public Vector(int x,int y,int z){
            this.x=x;
            this.y=y;
            this.z=z;
            magnitude= getMagnitude();
        }

        private double getMagnitude(){
            return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        }

        public Vector add(Vector v){
            Vector vector = new Vector();
            vector.x = x + v.x;
            vector.y = y + v.y;
            vector.z = z + v.z;
            return vector;
        }
        public Vector subtract(Vector v){
            Vector vector = new Vector();
            vector.x = x - v.x;
            vector.y = y - v.y;
            vector.z = z - v.z;
            return vector;
        }

        public double dotProduct(Vector v){
            return (x * v.x) + (y * v.y) + (z * v.z);
        }



        public Vector crossProduct(Vector v){
            Vector vector = new Vector();
            vector.x = y*v.z - z*v.y;
            vector.y = z*v.x-x*v.z;
            vector.z = x*v.y - y*v.x;
            return vector;
        }

        public double cosineTheta(Vector v){
            return dotProduct(v)/(magnitude*v.magnitude);
        }

        public double theta(Vector v){
            return Math.acos(cosineTheta(v));
        }

        public void display(){
            System.out.println(x+"i"+((y>=0)?"+":"")+y+"j"+((z>=0)?"+":"")+z+"k");
        }

    }*/

    public static void main(String []args){
       /* Vector a = new Vector(2,-1,1);
        Vector b= new Vector(1,1,1);
        Vector c = a.add(b);
        Vector d = a.subtract(b);
        double AdotB = a.dotProduct(b);
        double aDOTa = a.dotProduct(a);
        Vector e = a.crossProduct(b);
        double cosine = a.cosineTheta(b);
        double thetaha = a.theta(b);
        System.out.print("a= ");a.display();
        System.out.print("b= ");b.display();
        System.out.print("c= ");c.display();
        System.out.print("d= ");d.display();
        System.out.print("e= ");e.display();
        System.out.println("AdotB= "+ AdotB);
        System.out.println("aDOTb= "+ aDOTa);
        System.out.println("cosine(a->b)= "+ cosine);
        System.out.println("theta(a->b)= "+ thetaha);*/
        Vector a = new Vector(1,1,1);
        Vector b = new Vector(2,2,2);
        System.out.println(a.cosineTheta(b));




    }

}
