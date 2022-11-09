package shape;

public class Cube extends Shape3D{
    double side;
    public Cube(){}
    public Cube(double side){
        this.side = side;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
        this.volume = calculateVolume();
    }

    public double calculateArea(){
        return 6*Math.pow(side, 2);
    }

    public double calculatePerimeter(){
        return 12*side;
    }

    public double calculateVolume(){
        return Math.pow(side, 3);
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
        return super.toString()+("\nShape : Cube"
                                +"\nside : "+side
                                +"\nVolume : "+volume
                                +"\nArea : "+area
                                +"\nPerimeter : "+perimeter);
    }

    public void printDetails(){
        System.out.println(this);
    }
}