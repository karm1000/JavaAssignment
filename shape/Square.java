package shape;

public class Square extends Shape2D{
    double side;
    public Square(){}

    public Square(double side){
        this.side = side;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public void setSide(double side){
        this.side = side;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public double getArea(){
        return this.area;
    }

    public double getPerimeter(){
        return this.perimeter;
    }

    public double calculateArea(){
        return Math.pow(side, 2);
    }

    public double calculatePerimeter(){
        return 4*side;
    }

    public void printDetails(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return super.toString()+("\nShape : Square"
                               +"\nRadius : "+side
                               +"\nArea :  "+area
                               +"\nPerimeter : "+perimeter);
    }
}
