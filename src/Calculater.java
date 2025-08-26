public class Calculater {
    double area;

    public void area(double length,double width){
        area = length*width;
        System.out.println("Area of rectangle "+area);
    }
    public void area(double radius){
        area = Math.PI*radius*radius;
        System.out.println("Area of circle "+area);
    }
    public void area(double length,double width,double height){
        area = 2*(length*width+width*height + length*height);
        System.out.println("Total surface Area of cuboid "+area);
    }
}
