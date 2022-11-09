package shape;

public class Sphere extends Shape3D{
    double radius;
    public Sphere(){}
    public Sphere(double radius){
        this.radius = radius;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
        this.volume = calculateVolume();
    }

    public double calculateArea(){
        return 4*Math.PI*Math.pow(radius, 2);
    }

    public double calculatePerimeter(){
        return Double.POSITIVE_INFINITY;
    }

    public double calculateVolume(){
        return 4/3*Math.PI*Math.pow(radius, 3);
    }

    public double getArea(){
        return this.area;
    }

    public double getVolume(){
        return this.volume;
    }

    public double getPerimeter(){
        return this.perimeter;
    }

    @Override
    public String toString(){
        return super.toString()+("\nShape : Sphere"
                                +"\nRadius : "+radius
                                +"\nVolume : "+volume
                                +"\nArea : "+area
                                +"\nPerimeter : "+perimeter);
    }

    public void printDetails(){
        System.out.println(this);
    }
}
