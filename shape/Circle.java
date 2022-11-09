package shape;

public class Circle extends Shape2D {
    double radius;
    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }

    public void setRadius(double radius){
        this.radius = radius;
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
        return Math.PI*Math.pow(radius, 2);
    }

    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

    public void printDetails(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return super.toString()+("\nShape : Circle"
                +"\nRadius : "+radius
                +"\nArea :  "+area
                +"\nPerimeter : "+perimeter);
    }


}
